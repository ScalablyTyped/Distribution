package typings.pulumiAws.getCoipPoolMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetCoipPoolFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCoipPoolResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetCoipPoolFilter]] = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val localGatewayRouteTableId: String = js.native
  /**
    * Set of CIDR blocks in pool
    */
  val poolCidrs: js.Array[String] = js.native
  val poolId: String = js.native
  val tags: StringDictionary[String] = js.native
}

object GetCoipPoolResult {
  @scala.inline
  def apply(
    id: String,
    localGatewayRouteTableId: String,
    poolCidrs: js.Array[String],
    poolId: String,
    tags: StringDictionary[String]
  ): GetCoipPoolResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], localGatewayRouteTableId = localGatewayRouteTableId.asInstanceOf[js.Any], poolCidrs = poolCidrs.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCoipPoolResult]
  }
  @scala.inline
  implicit class GetCoipPoolResultOps[Self <: GetCoipPoolResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalGatewayRouteTableId(value: String): Self = this.set("localGatewayRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoolCidrsVarargs(value: String*): Self = this.set("poolCidrs", js.Array(value :_*))
    @scala.inline
    def setPoolCidrs(value: js.Array[String]): Self = this.set("poolCidrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoolId(value: String): Self = this.set("poolId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetCoipPoolFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetCoipPoolFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

