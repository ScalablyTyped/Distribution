package typings.reactHamburgerMenu

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-hamburger-menu", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[HamburgerMenuProps, js.Object, js.Any]
  
  type HamburgerMenu = PureComponent[HamburgerMenuProps, js.Object, js.Any]
  
  @js.native
  trait HamburgerMenuProps extends StObject {
    
    /**
      * The length of time it takes for the icon transitions to complete.
      * @default 0.4
      */
    var animationDuration: js.UndefOr[Double] = js.native
    
    /**
      * The border radius of the lines
      * @default 0
      */
    var borderRadius: js.UndefOr[Double] = js.native
    
    /**
      * The color of both icons
      * @default #000
      */
    var color: String = js.native
    
    /**
      * The height of the icon
      * @default 30
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Determines whether the menu is a hamburger or cross icon
      */
    var isOpen: Boolean = js.native
    
    /**
      * Will be invoked when the component is clicked
      */
    def menuClicked(): Unit = js.native
    
    /**
      * The rotation of the icon, eg {45} would be 45deg
      * @default 0
      */
    var rotate: js.UndefOr[Double] = js.native
    
    /**
      * The stroke width of the lines
      * @default 2
      */
    var strokeWidth: js.UndefOr[Double] = js.native
    
    /**
      * The width of the icon
      * @default 36
      */
    var width: js.UndefOr[Double] = js.native
  }
  object HamburgerMenuProps {
    
    @scala.inline
    def apply(color: String, isOpen: Boolean, menuClicked: () => Unit): HamburgerMenuProps = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], menuClicked = js.Any.fromFunction0(menuClicked))
      __obj.asInstanceOf[HamburgerMenuProps]
    }
    
    @scala.inline
    implicit class HamburgerMenuPropsMutableBuilder[Self <: HamburgerMenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuClicked(value: () => Unit): Self = StObject.set(x, "menuClicked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
