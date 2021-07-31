package typings.storybookAddonKnobs

import typings.react.mod.Component
import typings.storybookAddonKnobs.anon.OnChange
import typings.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @scala.inline
    def deserialize(value: TextTypeKnobValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("@storybook/addon-knobs/dist/components/types/Text", "default.propTypes")
    @js.native
    def propTypes: OnChange = js.native
    @scala.inline
    def propTypes_=(x: OnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def serialize(value: TextTypeKnobValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @js.native
  trait TextType
    extends Component[TextTypeProps, js.Object, js.Any] {
    
    var handleChange: js.Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTextType(nextProps: TextTypeProps): Boolean = js.native
  }
  
  trait TextTypeKnob
    extends StObject
       with KnobControlConfig[TextTypeKnobValue] {
    
    @JSName("value")
    var value_TextTypeKnob: js.UndefOr[TextTypeKnobValue] = js.undefined
  }
  object TextTypeKnob {
    
    @scala.inline
    def apply(name: String): TextTypeKnob = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextTypeKnob]
    }
    
    @scala.inline
    implicit class TextTypeKnobMutableBuilder[Self <: TextTypeKnob] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: TextTypeKnobValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type TextTypeKnobValue = String
  
  type TextTypeProps = KnobControlProps[TextTypeKnobValue]
}
