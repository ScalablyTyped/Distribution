package typings.storybookAddonKnobs.textMod

import typings.storybookAddonKnobs.anon.OnChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-knobs/dist/components/types/Text", JSImport.Default)
@js.native
class default () extends TextType
/* static members */
@JSImport("@storybook/addon-knobs/dist/components/types/Text", JSImport.Default)
@js.native
object default extends js.Object {
  
  var defaultProps: TextTypeProps = js.native
  
  def deserialize(value: TextTypeKnobValue): String = js.native
  
  var propTypes: OnChange = js.native
  
  def serialize(value: TextTypeKnobValue): String = js.native
}
