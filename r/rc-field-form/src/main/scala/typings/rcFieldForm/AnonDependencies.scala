package typings.rcFieldForm

import typings.rcFieldForm.interfaceMod.NamePath
import typings.rcFieldForm.interfaceMod.Rule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDependencies extends js.Object {
  var dependencies: js.UndefOr[js.Array[NamePath]] = js.undefined
  var name: js.UndefOr[NamePath] = js.undefined
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
}

object AnonDependencies {
  @scala.inline
  def apply(dependencies: js.Array[NamePath] = null, name: NamePath = null, rules: js.Array[Rule] = null): AnonDependencies = {
    val __obj = js.Dynamic.literal()
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDependencies]
  }
}

