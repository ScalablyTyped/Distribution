package typings.storybookAddonKnobs.numberMod

import typings.storybookAddonKnobs.anon.KnobValidator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-knobs/dist/components/types/Number", JSImport.Default)
@js.native
class default () extends NumberType
/* static members */
@JSImport("@storybook/addon-knobs/dist/components/types/Number", JSImport.Default)
@js.native
object default extends js.Object {
  
  var defaultProps: NumberTypeProps = js.native
  
  def deserialize(value: String): Double | Null = js.native
  
  var propTypes: KnobValidator = js.native
  
  def serialize(): String = js.native
  def serialize(value: NumberTypeKnobValue): String = js.native
}
