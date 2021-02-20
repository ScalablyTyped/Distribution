package typings.storybookAddonKnobs

import typings.react.mod.Component
import typings.storybookAddonKnobs.anon.OnChange
import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("@storybook/addon-knobs/dist/components/types/Text", JSImport.Default)
  @js.native
  class default () extends TextType
  /* static members */
  object default {
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Text", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Text", "default.defaultProps")
    @js.native
    def defaultProps: TextTypeProps = js.native
    @scala.inline
    def defaultProps_=(x: TextTypeProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Text", "default.deserialize")
    @js.native
    def deserialize(value: TextTypeKnobValue): String = js.native
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Text", "default.propTypes")
    @js.native
    def propTypes: OnChange = js.native
    @scala.inline
    def propTypes_=(x: OnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Text", "default.serialize")
    @js.native
    def serialize(value: TextTypeKnobValue): String = js.native
  }
  
  @js.native
  trait TextType
    extends Component[TextTypeProps, js.Object, js.Any] {
    
    var handleChange: js.Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTextType(nextProps: TextTypeProps): Boolean = js.native
  }
  
  /* Inlined @storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/types.KnobControlConfig<@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Text.TextTypeKnobValue> & {  value :@storybook/addon-knobs.@storybook/addon-knobs/dist/components/types/Text.TextTypeKnobValue | undefined} */
  @js.native
  trait TextTypeKnob extends StObject {
    
    var defaultValue: js.UndefOr[TextTypeKnobValue] = js.native
    
    var name: String = js.native
    
    var value: TextTypeKnobValue with js.UndefOr[TextTypeKnobValue] = js.native
  }
  object TextTypeKnob {
    
    @scala.inline
    def apply(name: String, value: TextTypeKnobValue with js.UndefOr[TextTypeKnobValue]): TextTypeKnob = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextTypeKnob]
    }
    
    @scala.inline
    implicit class TextTypeKnobMutableBuilder[Self <: TextTypeKnob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: TextTypeKnobValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: TextTypeKnobValue with js.UndefOr[TextTypeKnobValue]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TextTypeKnobValue = String
  
  type TextTypeProps = KnobControlProps[TextTypeKnobValue]
}
