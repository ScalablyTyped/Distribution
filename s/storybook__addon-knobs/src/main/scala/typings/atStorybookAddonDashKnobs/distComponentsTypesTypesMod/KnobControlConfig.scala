package typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnobControlConfig[T] extends js.Object {
  var defaultValue: js.UndefOr[T] = js.undefined
  var name: String
  var value: T
}

object KnobControlConfig {
  @scala.inline
  def apply[T](name: String, value: T, defaultValue: T = null): KnobControlConfig[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnobControlConfig[T]]
  }
}

