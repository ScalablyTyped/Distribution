package typings.pulumiAws.getCoipPoolMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetCoipPoolFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCoipPoolArgs extends js.Object {
  val filters: js.UndefOr[js.Array[GetCoipPoolFilter]] = js.native
  /**
    * Local Gateway Route Table Id assigned to desired COIP Pool
    */
  val localGatewayRouteTableId: js.UndefOr[String] = js.native
  /**
    * The id of the specific COIP Pool to retrieve.
    */
  val poolId: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired COIP Pool.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetCoipPoolArgs {
  @scala.inline
  def apply(): GetCoipPoolArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCoipPoolArgs]
  }
  @scala.inline
  implicit class GetCoipPoolArgsOps[Self <: GetCoipPoolArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetCoipPoolFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetCoipPoolFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setLocalGatewayRouteTableId(value: String): Self = this.set("localGatewayRouteTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalGatewayRouteTableId: Self = this.set("localGatewayRouteTableId", js.undefined)
    @scala.inline
    def setPoolId(value: String): Self = this.set("poolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoolId: Self = this.set("poolId", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

