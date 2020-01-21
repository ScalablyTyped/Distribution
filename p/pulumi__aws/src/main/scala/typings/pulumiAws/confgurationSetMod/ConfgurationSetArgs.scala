package typings.pulumiAws.confgurationSetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfgurationSetArgs extends js.Object {
  val name: js.UndefOr[Input[String]] = js.native
}

object ConfgurationSetArgs {
  @scala.inline
  def apply(name: Input[String] = null): ConfgurationSetArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfgurationSetArgs]
  }
}

