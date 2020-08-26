package typings.pulumiAws.outputMod.lambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionDeadLetterConfig extends js.Object {
  var targetArn: String = js.native
}

object GetFunctionDeadLetterConfig {
  @scala.inline
  def apply(targetArn: String): GetFunctionDeadLetterConfig = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionDeadLetterConfig]
  }
  @scala.inline
  implicit class GetFunctionDeadLetterConfigOps[Self <: GetFunctionDeadLetterConfig] (val x: Self) extends AnyVal {
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
    def setTargetArn(value: String): Self = this.set("targetArn", value.asInstanceOf[js.Any])
  }
  
}

