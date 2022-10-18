package typings.reactToolbox

import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsButtonBaseMod {
  
  trait ButtonBaseProps
    extends StObject
       with Props {
    
    /**
      * Indicates if the button should have accent color.
      * @default false
      */
    var accent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Children to pass through the component.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * If true, component will be disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Value of the icon (See Font Icon Component).
      */
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * If true, the neutral colors are inverted. Useful to put a button over a dark background.
      */
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set it to false if you don't want the neutral styles to be included.
      * @default true
      */
    var neutral: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if the button should have primary color.
      * @default false
      */
    var primary: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, component will have a ripple effect on click.
      * @default true
      */
    var ripple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Component root container type.
      * @default button
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ButtonBaseProps {
    
    inline def apply(): ButtonBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonBaseProps]
    }
    
    extension [Self <: ButtonBaseProps](x: Self) {
      
      inline def setAccent(value: Boolean): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
      
      inline def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setNeutral(value: Boolean): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
      
      inline def setNeutralUndefined: Self = StObject.set(x, "neutral", js.undefined)
      
      inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setRipple(value: Boolean): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ButtonTheme extends StObject {
    
    /**
      * Used for the root in case button is accent.
      */
    var accent: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element in any button.
      */
    var button: js.UndefOr[String] = js.undefined
    
    /**
      * Used when the button is flat for the root element.
      */
    var flat: js.UndefOr[String] = js.undefined
    
    /**
      * Used when the button is floating for the root element.
      */
    var floating: js.UndefOr[String] = js.undefined
    
    /**
      * For the icon inside a button.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * Used when colors are inverted.
      */
    var inverse: js.UndefOr[String] = js.undefined
    
    /**
      * Used for mini floating buttons.
      */
    var mini: js.UndefOr[String] = js.undefined
    
    /**
      * Used for neutral colored buttons.
      */
    var neutral: js.UndefOr[String] = js.undefined
    
    /**
      * Used for primary buttons when button is primary.
      */
    var primary: js.UndefOr[String] = js.undefined
    
    /**
      * Used when the button is raised for root element.
      */
    var raised: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the ripple element.
      */
    var rippleWrapper: js.UndefOr[String] = js.undefined
    
    /**
      * Used for toggle buttons in the root element.
      */
    var toggle: js.UndefOr[String] = js.undefined
  }
  object ButtonTheme {
    
    inline def apply(): ButtonTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonTheme]
    }
    
    extension [Self <: ButtonTheme](x: Self) {
      
      inline def setAccent(value: String): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
      
      inline def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setFlat(value: String): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setFloating(value: String): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInverse(value: String): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setMini(value: String): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
      
      inline def setMiniUndefined: Self = StObject.set(x, "mini", js.undefined)
      
      inline def setNeutral(value: String): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
      
      inline def setNeutralUndefined: Self = StObject.set(x, "neutral", js.undefined)
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setRaised(value: String): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
      
      inline def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
      
      inline def setRippleWrapper(value: String): Self = StObject.set(x, "rippleWrapper", value.asInstanceOf[js.Any])
      
      inline def setRippleWrapperUndefined: Self = StObject.set(x, "rippleWrapper", js.undefined)
      
      inline def setToggle(value: String): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
}
