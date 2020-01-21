package typings.storybookAddonKnobs

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.std.HTMLTextAreaElement
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types/Text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
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
    var propTypes: AnonKnobOnChange = js.native
    def deserialize(value: String): String = js.native
    def serialize(value: String): String = js.native
  }
  
  type TextTypeKnob = KnobControlConfig[TextTypeKnobValue]
  type TextTypeKnobValue = String
  type TextTypeProps = KnobControlProps[TextTypeKnobValue]
}

