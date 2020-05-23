package typings.rcFieldForm.anon

import typings.rcFieldForm.interfaceMod.NamePath
import typings.rcFieldForm.interfaceMod.Rule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dependencies extends js.Object {
  var dependencies: js.UndefOr[js.Array[NamePath]] = js.undefined
  var initialValue: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[NamePath] = js.undefined
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
}

object Dependencies {
  @scala.inline
  def apply(
    dependencies: js.Array[NamePath] = null,
    initialValue: js.Any = null,
    name: NamePath = null,
    rules: js.Array[Rule] = null
  ): Dependencies = {
    val __obj = js.Dynamic.literal()
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependencies]
  }
}

