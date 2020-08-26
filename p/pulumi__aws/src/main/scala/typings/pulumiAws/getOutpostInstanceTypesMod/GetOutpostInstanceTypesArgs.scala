package typings.pulumiAws.getOutpostInstanceTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOutpostInstanceTypesArgs extends js.Object {
  /**
    * Outpost Amazon Resource Name (ARN).
    */
  val arn: String = js.native
}

object GetOutpostInstanceTypesArgs {
  @scala.inline
  def apply(arn: String): GetOutpostInstanceTypesArgs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutpostInstanceTypesArgs]
  }
  @scala.inline
  implicit class GetOutpostInstanceTypesArgsOps[Self <: GetOutpostInstanceTypesArgs] (val x: Self) extends AnyVal {
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
  }
  
}

