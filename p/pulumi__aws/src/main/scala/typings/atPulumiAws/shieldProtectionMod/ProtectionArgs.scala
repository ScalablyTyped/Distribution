package typings.atPulumiAws.shieldProtectionMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtectionArgs extends js.Object {
  /**
    * A friendly name for the Protection you are creating.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN (Amazon Resource Name) of the resource to be protected.
    */
  val resourceArn: Input[String]
}

object ProtectionArgs {
  @scala.inline
  def apply(resourceArn: Input[String], name: Input[String] = null): ProtectionArgs = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectionArgs]
  }
}

