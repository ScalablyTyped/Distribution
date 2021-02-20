package typings.reactMdIcon

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontIconMod {
  
  @JSImport("@react-md/icon/types/FontIcon", "FontIcon")
  @js.native
  val FontIcon: ForwardRefExoticComponent[FontIconProps with RefAttributes[HTMLElement]] = js.native
  
  @js.native
  trait FontIconProps extends HTMLAttributes[HTMLElement] {
    
    /**
      * Boolean if the font icon should use the dense spec.
      */
    var dense: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the `forceSize` prop should also force the `font-size` instead
      * of only `width` and `height`.
      */
    var forceFontSize: js.UndefOr[Boolean] = js.native
    
    /**
      * Either a boolean that will enforce the 24x24 size of the font icon or a
      * number of the size to enforce. This is useful when using other font icon
      * libraries that do not have a consistent size.
      */
    var forceSize: js.UndefOr[Boolean] = js.native
    
    /**
      * The font icon class name to use.
      */
    var iconClassName: js.UndefOr[String] = js.native
  }
  object FontIconProps {
    
    @scala.inline
    def apply(): FontIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontIconProps]
    }
    
    @scala.inline
    implicit class FontIconPropsMutableBuilder[Self <: FontIconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      @scala.inline
      def setForceFontSize(value: Boolean): Self = StObject.set(x, "forceFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceFontSizeUndefined: Self = StObject.set(x, "forceFontSize", js.undefined)
      
      @scala.inline
      def setForceSize(value: Boolean): Self = StObject.set(x, "forceSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceSizeUndefined: Self = StObject.set(x, "forceSize", js.undefined)
      
      @scala.inline
      def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
    }
  }
}
