package typings.reactMdForm

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formThemeProviderMod {
  
  @JSImport("@react-md/form/types/FormThemeProvider", "FormThemeProvider")
  @js.native
  def FormThemeProvider(hasThemeUnderlineDirectionChildren: FormThemeProviderProps): ReactElement = js.native
  
  @JSImport("@react-md/form/types/FormThemeProvider", "useFormTheme")
  @js.native
  def useFormTheme(): FormThemeContext = js.native
  @JSImport("@react-md/form/types/FormThemeProvider", "useFormTheme")
  @js.native
  def useFormTheme(options: FormThemeOptions): FormThemeContext = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdForm.reactMdFormStrings.none
    - typings.reactMdForm.reactMdFormStrings.underline
    - typings.reactMdForm.reactMdFormStrings.filled
    - typings.reactMdForm.reactMdFormStrings.outline
  */
  trait FormTheme extends StObject
  object FormTheme {
    
    @scala.inline
    def filled: typings.reactMdForm.reactMdFormStrings.filled = "filled".asInstanceOf[typings.reactMdForm.reactMdFormStrings.filled]
    
    @scala.inline
    def none: typings.reactMdForm.reactMdFormStrings.none = "none".asInstanceOf[typings.reactMdForm.reactMdFormStrings.none]
    
    @scala.inline
    def outline: typings.reactMdForm.reactMdFormStrings.outline = "outline".asInstanceOf[typings.reactMdForm.reactMdFormStrings.outline]
    
    @scala.inline
    def underline: typings.reactMdForm.reactMdFormStrings.underline = "underline".asInstanceOf[typings.reactMdForm.reactMdFormStrings.underline]
  }
  
  /* Inlined std.Required<@react-md/form.@react-md/form/types/FormThemeProvider.FormThemeOptions> */
  @js.native
  trait FormThemeContext extends StObject {
    
    var theme: FormTheme = js.native
    
    var underlineDirection: FormUnderlineDirection = js.native
  }
  object FormThemeContext {
    
    @scala.inline
    def apply(theme: FormTheme, underlineDirection: FormUnderlineDirection): FormThemeContext = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], underlineDirection = underlineDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormThemeContext]
    }
    
    @scala.inline
    implicit class FormThemeContextMutableBuilder[Self <: FormThemeContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: FormTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineDirection(value: FormUnderlineDirection): Self = StObject.set(x, "underlineDirection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FormThemeOptions extends StObject {
    
    /**
      * The current theme type.
      */
    var theme: js.UndefOr[FormTheme] = js.native
    
    /**
      * The current underline direction.
      */
    var underlineDirection: js.UndefOr[FormUnderlineDirection] = js.native
  }
  object FormThemeOptions {
    
    @scala.inline
    def apply(): FormThemeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormThemeOptions]
    }
    
    @scala.inline
    implicit class FormThemeOptionsMutableBuilder[Self <: FormThemeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: FormTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUnderlineDirection(value: FormUnderlineDirection): Self = StObject.set(x, "underlineDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineDirectionUndefined: Self = StObject.set(x, "underlineDirection", js.undefined)
    }
  }
  
  @js.native
  trait FormThemeProviderProps extends FormThemeOptions {
    
    var children: ReactNode = js.native
  }
  object FormThemeProviderProps {
    
    @scala.inline
    def apply(): FormThemeProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormThemeProviderProps]
    }
    
    @scala.inline
    implicit class FormThemeProviderPropsMutableBuilder[Self <: FormThemeProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdForm.reactMdFormStrings.left
    - typings.reactMdForm.reactMdFormStrings.center
    - typings.reactMdForm.reactMdFormStrings.right
  */
  trait FormUnderlineDirection extends StObject
  object FormUnderlineDirection {
    
    @scala.inline
    def center: typings.reactMdForm.reactMdFormStrings.center = "center".asInstanceOf[typings.reactMdForm.reactMdFormStrings.center]
    
    @scala.inline
    def left: typings.reactMdForm.reactMdFormStrings.left = "left".asInstanceOf[typings.reactMdForm.reactMdFormStrings.left]
    
    @scala.inline
    def right: typings.reactMdForm.reactMdFormStrings.right = "right".asInstanceOf[typings.reactMdForm.reactMdFormStrings.right]
  }
}
