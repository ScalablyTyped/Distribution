package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.componentsButtonBaseMod.ButtonBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsButtonIconButtonMod {
  
  @JSImport("react-toolbox/components/button/IconButton", JSImport.Default)
  @js.native
  open class default protected () extends IconButton {
    def this(props: IconButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IconButtonProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/button/IconButton", "IconButton")
  @js.native
  open class IconButton protected ()
    extends Component[IconButtonProps, js.Object, Any] {
    def this(props: IconButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IconButtonProps, context: Any) = this()
  }
  
  trait IconButtonProps
    extends StObject
       with ButtonBaseProps {
    
    /**
      * Creates a link for the button.
      */
    var href: js.UndefOr[String] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[IconButtonTheme] = js.undefined
  }
  object IconButtonProps {
    
    inline def apply(): IconButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconButtonProps] (val x: Self) extends AnyVal {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setTheme(value: IconButtonTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait IconButtonTheme extends StObject {
    
    /**
      * Used for the root in case button is accent.
      */
    var accent: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element in any button.
      */
    var button: js.UndefOr[String] = js.undefined
    
    /**
      * For the icon inside a button.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * Used when colors are inverted.
      */
    var inverse: js.UndefOr[String] = js.undefined
    
    /**
      * Used for neutral colored buttons.
      */
    var neutral: js.UndefOr[String] = js.undefined
    
    /**
      * Used for primary buttons when button is primary.
      */
    var primary: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the ripple element.
      */
    var rippleWrapper: js.UndefOr[String] = js.undefined
    
    /**
      * Used for toggle buttons in the root element.
      */
    var toggle: js.UndefOr[String] = js.undefined
  }
  object IconButtonTheme {
    
    inline def apply(): IconButtonTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconButtonTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconButtonTheme] (val x: Self) extends AnyVal {
      
      inline def setAccent(value: String): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
      
      inline def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInverse(value: String): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setNeutral(value: String): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
      
      inline def setNeutralUndefined: Self = StObject.set(x, "neutral", js.undefined)
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setRippleWrapper(value: String): Self = StObject.set(x, "rippleWrapper", value.asInstanceOf[js.Any])
      
      inline def setRippleWrapperUndefined: Self = StObject.set(x, "rippleWrapper", js.undefined)
      
      inline def setToggle(value: String): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
}
