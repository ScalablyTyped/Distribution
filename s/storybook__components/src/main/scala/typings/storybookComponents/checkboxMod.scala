package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.OptionsMultiSelection
import typings.storybookComponents.controlsTypesMod.OptionsObject
import typings.storybookComponents.typesMod.ArgType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("@storybook/components/dist/controls/options/Checkbox", "CheckboxControl")
  @js.native
  val CheckboxControl: FC[CheckboxProps] = js.native
  
  /* Inlined @storybook/components.@storybook/components/dist/controls/types.NormalizedOptionsConfig & {  isInline :boolean} */
  @js.native
  trait CheckboxConfig extends StObject {
    
    var isInline: Boolean = js.native
    
    var options: OptionsObject = js.native
  }
  object CheckboxConfig {
    
    @scala.inline
    def apply(isInline: Boolean, options: OptionsObject): CheckboxConfig = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxConfig]
    }
    
    @scala.inline
    implicit class CheckboxConfigMutableBuilder[Self <: CheckboxConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: OptionsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @storybook/components.@storybook/components/dist/controls/types.ControlProps<@storybook/components.@storybook/components/dist/controls/types.OptionsMultiSelection> & @storybook/components.@storybook/components/dist/controls/options/Checkbox.CheckboxConfig */
  @js.native
  trait CheckboxProps extends StObject {
    
    var argType: js.UndefOr[ArgType] = js.native
    
    var defaultValue: js.UndefOr[OptionsMultiSelection] = js.native
    
    var isInline: Boolean = js.native
    
    var name: String = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    def onChange(value: OptionsMultiSelection): OptionsMultiSelection | Unit = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* evt */ js.Any, Unit]] = js.native
    
    var options: OptionsObject = js.native
    
    var value: js.UndefOr[OptionsMultiSelection] = js.native
  }
  object CheckboxProps {
    
    @scala.inline
    def apply(
      isInline: Boolean,
      name: String,
      onChange: OptionsMultiSelection => OptionsMultiSelection | Unit,
      options: OptionsObject
    ): CheckboxProps = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxProps]
    }
    
    @scala.inline
    implicit class CheckboxPropsMutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgType(value: ArgType): Self = StObject.set(x, "argType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgTypeUndefined: Self = StObject.set(x, "argType", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: OptionsMultiSelection): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: js.Any*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlur(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: OptionsMultiSelection => OptionsMultiSelection | Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocus(value: /* evt */ js.Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOptions(value: OptionsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: OptionsMultiSelection): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
