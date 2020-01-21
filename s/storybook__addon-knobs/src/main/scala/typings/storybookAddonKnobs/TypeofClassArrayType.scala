package typings.storybookAddonKnobs

import org.scalablytyped.runtime.Instantiable0
import typings.std.Partial
import typings.storybookAddonKnobs.arrayMod.ArrayTypeKnobValue
import typings.storybookAddonKnobs.arrayMod.ArrayTypeProps
import typings.storybookAddonKnobs.arrayMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassArrayType extends Instantiable0[default] {
  var defaultProps: Partial[ArrayTypeProps] = js.native
  var propTypes: AnonKnob = js.native
  def deserialize(value: js.Array[String]): js.Array[String] = js.native
  def serialize(value: ArrayTypeKnobValue): ArrayTypeKnobValue = js.native
}

