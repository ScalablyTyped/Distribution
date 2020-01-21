package typings.pulumiPulumi.stackReferenceMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackReferenceArgs extends js.Object {
  /**
    * The name of the stack to reference.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object StackReferenceArgs {
  @scala.inline
  def apply(name: Input[String] = null): StackReferenceArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackReferenceArgs]
  }
}

