package typings.pulumiAws.protectionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtectionArgs extends js.Object {
  /**
    * A friendly name for the Protection you are creating.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN (Amazon Resource Name) of the resource to be protected.
    */
  val resourceArn: Input[String] = js.native
}

object ProtectionArgs {
  @scala.inline
  def apply(resourceArn: Input[String]): ProtectionArgs = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionArgs]
  }
  @scala.inline
  implicit class ProtectionArgsOps[Self <: ProtectionArgs] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: Input[String]): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

