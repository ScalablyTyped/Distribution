package typings.reactMdIcon

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconRotatorMod {
  
  @JSImport("@react-md/icon/types/IconRotator", "IconRotator")
  @js.native
  val IconRotator: ForwardRefExoticComponent[IconRotatorProps & RefAttributes[HTMLSpanElement]] = js.native
  
  trait IconRotatorBaseProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    /**
      * Boolean if the rotation should be animated instead of static.
      */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the child icon should be "forcefully" wrapped in a `<span>`
      * element. This should be enabled if you have a custom icon that does not
      * pass the `className` prop down.
      */
    var forceIconWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the icon is currently rotated.
      */
    var rotated: Boolean
  }
  object IconRotatorBaseProps {
    
    @scala.inline
    def apply(rotated: Boolean): IconRotatorBaseProps = {
      val __obj = js.Dynamic.literal(rotated = rotated.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconRotatorBaseProps]
    }
    
    @scala.inline
    implicit class IconRotatorBasePropsMutableBuilder[Self <: IconRotatorBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setForceIconWrap(value: Boolean): Self = StObject.set(x, "forceIconWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceIconWrapUndefined: Self = StObject.set(x, "forceIconWrap", js.undefined)
      
      @scala.inline
      def setRotated(value: Boolean): Self = StObject.set(x, "rotated", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconRotatorProps
    extends StObject
       with IconRotatorBaseProps {
    
    /**
      * The icon that should be rotated. If this is a valid React Element, the
      * class names will be cloned into that icon, otherwise the icon will be
      * wrapped in a span with the correct class names applied.
      */
    @JSName("children")
    var children_IconRotatorProps: ReactNode
  }
  object IconRotatorProps {
    
    @scala.inline
    def apply(rotated: Boolean): IconRotatorProps = {
      val __obj = js.Dynamic.literal(rotated = rotated.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconRotatorProps]
    }
    
    @scala.inline
    implicit class IconRotatorPropsMutableBuilder[Self <: IconRotatorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
