package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameInput extends js.Object {
  var name: js.UndefOr[Input[String]] = js.undefined
}

object Anon_NameInput {
  @scala.inline
  def apply(name: Input[String] = null): Anon_NameInput = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameInput]
  }
}

