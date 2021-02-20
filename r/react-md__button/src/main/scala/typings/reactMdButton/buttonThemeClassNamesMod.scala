package typings.reactMdButton

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonThemeClassNamesMod {
  
  @JSImport("@react-md/button/types/buttonThemeClassNames", "buttonThemeClassNames")
  @js.native
  def buttonThemeClassNames(hasThemeThemeTypeButtonTypeDisabledClassName: ButtonThemeProps): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdButton.reactMdButtonStrings.clear
    - typings.reactMdButton.reactMdButtonStrings.primary
    - typings.reactMdButton.reactMdButtonStrings.secondary
    - typings.reactMdButton.reactMdButtonStrings.warning
    - typings.reactMdButton.reactMdButtonStrings.error
    - typings.reactMdButton.reactMdButtonStrings.disabled
  */
  trait ButtonTheme extends StObject
  object ButtonTheme {
    
    @scala.inline
    def clear: typings.reactMdButton.reactMdButtonStrings.clear = "clear".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.clear]
    
    @scala.inline
    def disabled: typings.reactMdButton.reactMdButtonStrings.disabled = "disabled".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.disabled]
    
    @scala.inline
    def error: typings.reactMdButton.reactMdButtonStrings.error = "error".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.error]
    
    @scala.inline
    def primary: typings.reactMdButton.reactMdButtonStrings.primary = "primary".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.primary]
    
    @scala.inline
    def secondary: typings.reactMdButton.reactMdButtonStrings.secondary = "secondary".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.secondary]
    
    @scala.inline
    def warning: typings.reactMdButton.reactMdButtonStrings.warning = "warning".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.warning]
  }
  
  @js.native
  trait ButtonThemeProps extends StObject {
    
    /**
      * This is the specific material design button type to use. This can either be
      * set to "text" or "icon". When this is set to "text", the styles applied
      * will make buttons with just text or text with icons render nicely. When
      * this is set to "icon", the styles applied will make icon only buttons
      * render nicely.
      */
    var buttonType: js.UndefOr[ButtonType] = js.native
    
    /**
      * An optional className to also apply to the button for additional theming
      * and styling. This will be merged with the `Button.theme` class name styles.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Enabling this prop will apply the disabled styles to a `Button`. When this
      * is also applied to the button component, the button will be updated so that
      * it can no longer be interacted with.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * The material design theme to apply to the button. The theme prop will
      * update the look and feel of the button by applying different background
      * and/or foreground colors.
      */
    var theme: js.UndefOr[ButtonTheme] = js.native
    
    /**
      * The material design theme type to apply. The themeTYpe prop will update the
      * look and feel of the button by applying different border or box shadow.
      */
    var themeType: js.UndefOr[ButtonThemeType] = js.native
  }
  object ButtonThemeProps {
    
    @scala.inline
    def apply(): ButtonThemeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonThemeProps]
    }
    
    @scala.inline
    implicit class ButtonThemePropsMutableBuilder[Self <: ButtonThemeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonType(value: ButtonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setTheme(value: ButtonTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeType(value: ButtonThemeType): Self = StObject.set(x, "themeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeTypeUndefined: Self = StObject.set(x, "themeType", js.undefined)
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdButton.reactMdButtonStrings.flat
    - typings.reactMdButton.reactMdButtonStrings.outline
    - typings.reactMdButton.reactMdButtonStrings.contained
  */
  trait ButtonThemeType extends StObject
  object ButtonThemeType {
    
    @scala.inline
    def contained: typings.reactMdButton.reactMdButtonStrings.contained = "contained".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.contained]
    
    @scala.inline
    def flat: typings.reactMdButton.reactMdButtonStrings.flat = "flat".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.flat]
    
    @scala.inline
    def outline: typings.reactMdButton.reactMdButtonStrings.outline = "outline".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.outline]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdButton.reactMdButtonStrings.text
    - typings.reactMdButton.reactMdButtonStrings.icon
  */
  trait ButtonType extends StObject
  object ButtonType {
    
    @scala.inline
    def icon: typings.reactMdButton.reactMdButtonStrings.icon = "icon".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.icon]
    
    @scala.inline
    def text: typings.reactMdButton.reactMdButtonStrings.text = "text".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.text]
  }
}
