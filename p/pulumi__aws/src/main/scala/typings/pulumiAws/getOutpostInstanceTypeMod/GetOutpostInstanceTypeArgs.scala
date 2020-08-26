package typings.pulumiAws.getOutpostInstanceTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOutpostInstanceTypeArgs extends js.Object {
  /**
    * Outpost Amazon Resource Name (ARN).
    */
  val arn: String = js.native
  /**
    * Desired instance type. Conflicts with `preferredInstanceTypes`.
    */
  val instanceType: js.UndefOr[String] = js.native
  /**
    * Ordered list of preferred instance types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. Conflicts with `instanceType`.
    */
  val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.native
}

object GetOutpostInstanceTypeArgs {
  @scala.inline
  def apply(arn: String): GetOutpostInstanceTypeArgs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutpostInstanceTypeArgs]
  }
  @scala.inline
  implicit class GetOutpostInstanceTypeArgsOps[Self <: GetOutpostInstanceTypeArgs] (val x: Self) extends AnyVal {
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
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    @scala.inline
    def setPreferredInstanceTypesVarargs(value: String*): Self = this.set("preferredInstanceTypes", js.Array(value :_*))
    @scala.inline
    def setPreferredInstanceTypes(value: js.Array[String]): Self = this.set("preferredInstanceTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredInstanceTypes: Self = this.set("preferredInstanceTypes", js.undefined)
  }
  
}

