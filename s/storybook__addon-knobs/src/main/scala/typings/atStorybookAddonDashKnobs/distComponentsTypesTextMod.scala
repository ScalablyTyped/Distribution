package typings.atStorybookAddonDashKnobs

import typings.atStorybookAddonDashKnobs.distComponentsTypesTextMod.TextType
import typings.atStorybookAddonDashKnobs.distComponentsTypesTextMod.TextTypeKnobValue
import typings.atStorybookAddonDashKnobs.distComponentsTypesTextMod.TextTypeProps
import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlProps
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.Component
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types/Text", JSImport.Namespace)
@js.native
object distComponentsTypesTextMod extends js.Object {
  @js.native
  trait TextType
    extends Component[TextTypeProps, js.Object, js.Any] {
    def handleChange(event: ChangeEvent[HTMLTextAreaElement]): Unit = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTextType(nextProps: TextTypeProps): Boolean = js.native
  }
  
  @js.native
  class default () extends TextType
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: TextTypeProps = js.native
    var propTypes: Anon_KnobOnChange = js.native
    def deserialize(value: String): String = js.native
    def serialize(value: String): String = js.native
  }
  
  type TextTypeKnob = KnobControlConfig[TextTypeKnobValue]
  type TextTypeKnobValue = String
  type TextTypeProps = KnobControlProps[TextTypeKnobValue]
}

