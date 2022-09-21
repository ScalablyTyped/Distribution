package typings.reactHamburgerMenu

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-hamburger-menu", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[HamburgerMenuProps, js.Object, Any]
  
  type HamburgerMenu = PureComponent[HamburgerMenuProps, js.Object, Any]
  
  trait HamburgerMenuProps extends StObject {
    
    /**
      * The length of time it takes for the icon transitions to complete.
      * @default 0.4
      */
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * The border radius of the lines
      * @default 0
      */
    var borderRadius: js.UndefOr[Double] = js.undefined
    
    /**
      * The color of both icons
      * @default #000
      */
    var color: String
    
    /**
      * The height of the icon
      * @default 30
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Determines whether the menu is a hamburger or cross icon
      */
    var isOpen: Boolean
    
    /**
      * Will be invoked when the component is clicked
      */
    def menuClicked(): Unit
    
    /**
      * The rotation of the icon, eg {45} would be 45deg
      * @default 0
      */
    var rotate: js.UndefOr[Double] = js.undefined
    
    /**
      * The stroke width of the lines
      * @default 2
      */
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * The width of the icon
      * @default 36
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object HamburgerMenuProps {
    
    inline def apply(color: String, isOpen: Boolean, menuClicked: () => Unit): HamburgerMenuProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], menuClicked = js.Any.fromFunction0(menuClicked))
      __obj.asInstanceOf[HamburgerMenuProps]
    }
    
    extension [Self <: HamburgerMenuProps](x: Self) {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setMenuClicked(value: () => Unit): Self = StObject.set(x, "menuClicked", js.Any.fromFunction0(value))
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
