package typings.storybookAddonKnobs.colorMod

import typings.storybookAddonKnobs.anon.OnChange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-knobs/dist/components/types/Color", JSImport.Default)
@js.native
class default () extends ColorType
/* static members */
@JSImport("@storybook/addon-knobs/dist/components/types/Color", JSImport.Default)
@js.native
object default extends js.Object {
  
  var defaultProps: ColorTypeProps = js.native
  
  def deserialize(value: ColorTypeKnobValue): String = js.native
  
  var propTypes: OnChange = js.native
  
  def serialize(value: ColorTypeKnobValue): String = js.native
}
