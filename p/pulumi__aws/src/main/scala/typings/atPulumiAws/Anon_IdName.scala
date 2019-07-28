package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdName extends js.Object {
  var id: js.UndefOr[Input[String]] = js.undefined
  var name: js.UndefOr[Input[String]] = js.undefined
  var version: js.UndefOr[Input[String]] = js.undefined
}

object Anon_IdName {
  @scala.inline
  def apply(id: Input[String] = null, name: Input[String] = null, version: Input[String] = null): Anon_IdName = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdName]
  }
}

