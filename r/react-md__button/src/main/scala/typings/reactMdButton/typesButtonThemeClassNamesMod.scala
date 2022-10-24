package typings.reactMdButton

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesButtonThemeClassNamesMod {
  
  @JSImport("@react-md/button/types/buttonThemeClassNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buttonThemeClassNames(param0: ButtonThemeProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonThemeClassNames")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
    
    inline def clear: typings.reactMdButton.reactMdButtonStrings.clear = "clear".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.clear]
    
    inline def disabled: typings.reactMdButton.reactMdButtonStrings.disabled = "disabled".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.disabled]
    
    inline def error: typings.reactMdButton.reactMdButtonStrings.error = "error".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.error]
    
    inline def primary: typings.reactMdButton.reactMdButtonStrings.primary = "primary".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.primary]
    
    inline def secondary: typings.reactMdButton.reactMdButtonStrings.secondary = "secondary".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.secondary]
    
    inline def warning: typings.reactMdButton.reactMdButtonStrings.warning = "warning".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.warning]
  }
  
  trait ButtonThemeProps extends StObject {
    
    /**
      * This is the specific material design button type to use. This can either be
      * set to "text" or "icon". When this is set to "text", the styles applied
      * will make buttons with just text or text with icons render nicely. When
      * this is set to "icon", the styles applied will make icon only buttons
      * render nicely.
      */
    var buttonType: js.UndefOr[ButtonType] = js.undefined
    
    /**
      * An optional className to also apply to the button for additional theming
      * and styling. This will be merged with the `Button.theme` class name styles.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Enabling this prop will apply the disabled styles to a `Button`. When this
      * is also applied to the button component, the button will be updated so that
      * it can no longer be interacted with.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The material design theme to apply to the button. The theme prop will
      * update the look and feel of the button by applying different background
      * and/or foreground colors.
      */
    var theme: js.UndefOr[ButtonTheme] = js.undefined
    
    /**
      * The material design theme type to apply. The themeTYpe prop will update the
      * look and feel of the button by applying different border or box shadow.
      */
    var themeType: js.UndefOr[ButtonThemeType] = js.undefined
  }
  object ButtonThemeProps {
    
    inline def apply(): ButtonThemeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonThemeProps]
    }
    
    extension [Self <: ButtonThemeProps](x: Self) {
      
      inline def setButtonType(value: ButtonType): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
      
      inline def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setTheme(value: ButtonTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeType(value: ButtonThemeType): Self = StObject.set(x, "themeType", value.asInstanceOf[js.Any])
      
      inline def setThemeTypeUndefined: Self = StObject.set(x, "themeType", js.undefined)
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdButton.reactMdButtonStrings.flat
    - typings.reactMdButton.reactMdButtonStrings.outline
    - typings.reactMdButton.reactMdButtonStrings.contained
  */
  trait ButtonThemeType extends StObject
  object ButtonThemeType {
    
    inline def contained: typings.reactMdButton.reactMdButtonStrings.contained = "contained".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.contained]
    
    inline def flat: typings.reactMdButton.reactMdButtonStrings.flat = "flat".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.flat]
    
    inline def outline: typings.reactMdButton.reactMdButtonStrings.outline = "outline".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.outline]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdButton.reactMdButtonStrings.text
    - typings.reactMdButton.reactMdButtonStrings.icon
  */
  trait ButtonType extends StObject
  object ButtonType {
    
    inline def icon: typings.reactMdButton.reactMdButtonStrings.icon = "icon".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.icon]
    
    inline def text: typings.reactMdButton.reactMdButtonStrings.text = "text".asInstanceOf[typings.reactMdButton.reactMdButtonStrings.text]
  }
}
