package typings.storybookAddonKnobs.checkboxesMod

import typings.storybookAddonKnobs.anon.IsInline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/addon-knobs/dist/components/types/Checkboxes", JSImport.Default)
@js.native
class default protected () extends CheckboxesType {
  def this(props: CheckboxesTypeProps) = this()
}
/* static members */
@JSImport("@storybook/addon-knobs/dist/components/types/Checkboxes", JSImport.Default)
@js.native
object default extends js.Object {
  
  var defaultProps: CheckboxesTypeProps = js.native
  
  def deserialize(value: CheckboxesTypeKnobValue): CheckboxesTypeKnobValue = js.native
  
  var propTypes: IsInline = js.native
  
  def serialize(value: CheckboxesTypeKnobValue): CheckboxesTypeKnobValue = js.native
}
