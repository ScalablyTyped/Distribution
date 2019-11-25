package typings.atStorybookAddonDashKnobs.distComponentsTypesArrayMod

import typings.atStorybookAddonDashKnobs.Anon_Knob
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types/Array", JSImport.Default)
@js.native
class default () extends ArrayType

/* static members */
@JSImport("@storybook/addon-knobs/dist/components/types/Array", JSImport.Default)
@js.native
object default extends js.Object {
  var defaultProps: Partial[ArrayTypeProps] = js.native
  var propTypes: Anon_Knob = js.native
  def deserialize(value: js.Array[String]): js.Array[String] = js.native
  def serialize(value: ArrayTypeKnobValue): ArrayTypeKnobValue = js.native
}

