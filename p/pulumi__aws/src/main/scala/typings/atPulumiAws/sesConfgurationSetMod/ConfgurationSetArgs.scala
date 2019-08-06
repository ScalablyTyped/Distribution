package typings.atPulumiAws.sesConfgurationSetMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfgurationSetArgs extends js.Object {
  val name: js.UndefOr[Input[String]] = js.undefined
}

object ConfgurationSetArgs {
  @scala.inline
  def apply(name: Input[String] = null): ConfgurationSetArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfgurationSetArgs]
  }
}

