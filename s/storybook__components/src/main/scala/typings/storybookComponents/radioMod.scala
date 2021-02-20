package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.OptionsObject
import typings.storybookComponents.controlsTypesMod.OptionsSingleSelection
import typings.storybookComponents.typesMod.ArgType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod {
  
  @JSImport("@storybook/components/dist/controls/options/Radio", "RadioControl")
  @js.native
  val RadioControl: FC[RadioProps] = js.native
  
  /* Inlined @storybook/components.@storybook/components/dist/controls/types.NormalizedOptionsConfig & {  isInline :boolean} */
  @js.native
  trait RadioConfig extends StObject {
    
    var isInline: Boolean = js.native
    
    var options: OptionsObject = js.native
  }
  object RadioConfig {
    
    @scala.inline
    def apply(isInline: Boolean, options: OptionsObject): RadioConfig = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioConfig]
    }
    
    @scala.inline
    implicit class RadioConfigMutableBuilder[Self <: RadioConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: OptionsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @storybook/components.@storybook/components/dist/controls/types.ControlProps<@storybook/components.@storybook/components/dist/controls/types.OptionsSingleSelection> & @storybook/components.@storybook/components/dist/controls/options/Radio.RadioConfig */
  @js.native
  trait RadioProps extends StObject {
    
    var argType: js.UndefOr[ArgType] = js.native
    
    var defaultValue: js.UndefOr[OptionsSingleSelection] = js.native
    
    var isInline: Boolean = js.native
    
    var name: String = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    def onChange(value: OptionsSingleSelection): OptionsSingleSelection | Unit = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var options: OptionsObject = js.native
    
    var value: js.UndefOr[OptionsSingleSelection] = js.native
  }
  object RadioProps {
    
    @scala.inline
    def apply(
      isInline: Boolean,
      name: String,
      onChange: OptionsSingleSelection => OptionsSingleSelection | Unit,
      options: OptionsObject
    ): RadioProps = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioProps]
    }
    
    @scala.inline
    implicit class RadioPropsMutableBuilder[Self <: RadioProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgType(value: ArgType): Self = StObject.set(x, "argType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgTypeUndefined: Self = StObject.set(x, "argType", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: OptionsSingleSelection): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlur(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: OptionsSingleSelection => OptionsSingleSelection | Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocus(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOptions(value: OptionsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: OptionsSingleSelection): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
