package typings.atPulumiAws.shieldProtectionMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtectionState extends js.Object {
  /**
    * A friendly name for the Protection you are creating.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN (Amazon Resource Name) of the resource to be protected.
    */
  val resourceArn: js.UndefOr[Input[String]] = js.native
}

object ProtectionState {
  @scala.inline
  def apply(name: Input[String] = null, resourceArn: Input[String] = null): ProtectionState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionState]
  }
}

