package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.OptionsObject
import typings.storybookComponents.controlsTypesMod.OptionsSelection
import typings.storybookComponents.typesMod.ArgType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("@storybook/components/dist/controls/options/Select", "SelectControl")
  @js.native
  val SelectControl: FC[SelectProps] = js.native
  
  /* Inlined @storybook/components.@storybook/components/dist/controls/types.NormalizedOptionsConfig & {  isMulti :boolean} */
  @js.native
  trait SelectConfig extends StObject {
    
    var isMulti: Boolean = js.native
    
    var options: OptionsObject = js.native
  }
  object SelectConfig {
    
    @scala.inline
    def apply(isMulti: Boolean, options: OptionsObject): SelectConfig = {
      val __obj = js.Dynamic.literal(isMulti = isMulti.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectConfig]
    }
    
    @scala.inline
    implicit class SelectConfigMutableBuilder[Self <: SelectConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMulti(value: Boolean): Self = StObject.set(x, "isMulti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: OptionsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @storybook/components.@storybook/components/dist/controls/types.ControlProps<@storybook/components.@storybook/components/dist/controls/types.OptionsSelection> & @storybook/components.@storybook/components/dist/controls/options/Select.SelectConfig */
  @js.native
  trait SelectProps extends StObject {
    
    var argType: js.UndefOr[ArgType] = js.native
    
    var defaultValue: js.UndefOr[OptionsSelection] = js.native
    
    var isMulti: Boolean = js.native
    
    var name: String = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    def onChange(value: OptionsSelection): OptionsSelection | Unit = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var options: OptionsObject = js.native
    
    var value: js.UndefOr[OptionsSelection] = js.native
  }
  object SelectProps {
    
    @scala.inline
    def apply(
      isMulti: Boolean,
      name: String,
      onChange: OptionsSelection => OptionsSelection | Unit,
      options: OptionsObject
    ): SelectProps = {
      val __obj = js.Dynamic.literal(isMulti = isMulti.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectProps]
    }
    
    @scala.inline
    implicit class SelectPropsMutableBuilder[Self <: SelectProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgType(value: ArgType): Self = StObject.set(x, "argType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgTypeUndefined: Self = StObject.set(x, "argType", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: OptionsSelection): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: js.Any*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setIsMulti(value: Boolean): Self = StObject.set(x, "isMulti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlur(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: OptionsSelection => OptionsSelection | Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocus(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOptions(value: OptionsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: OptionsSelection): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
