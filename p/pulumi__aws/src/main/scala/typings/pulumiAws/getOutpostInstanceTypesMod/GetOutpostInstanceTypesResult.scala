package typings.pulumiAws.getOutpostInstanceTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOutpostInstanceTypesResult extends js.Object {
  val arn: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Set of instance types.
    */
  val instanceTypes: js.Array[String] = js.native
}

object GetOutpostInstanceTypesResult {
  @scala.inline
  def apply(arn: String, id: String, instanceTypes: js.Array[String]): GetOutpostInstanceTypesResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutpostInstanceTypesResult]
  }
  @scala.inline
  implicit class GetOutpostInstanceTypesResultOps[Self <: GetOutpostInstanceTypesResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceTypesVarargs(value: String*): Self = this.set("instanceTypes", js.Array(value :_*))
    @scala.inline
    def setInstanceTypes(value: js.Array[String]): Self = this.set("instanceTypes", value.asInstanceOf[js.Any])
  }
  
}

