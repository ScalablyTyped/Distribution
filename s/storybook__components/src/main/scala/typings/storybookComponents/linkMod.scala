package typings.storybookComponents

import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @JSImport("@storybook/components/dist/typography/link/link", "Link")
  @js.native
  val Link: FunctionComponent[LinkProps & AProps] = js.native
  
  type AProps = AnchorHTMLAttributes[HTMLAnchorElement]
  
  trait LinkInnerProps extends StObject {
    
    var containsIcon: js.UndefOr[Boolean] = js.undefined
    
    var withArrow: js.UndefOr[Boolean] = js.undefined
  }
  object LinkInnerProps {
    
    inline def apply(): LinkInnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkInnerProps]
    }
    
    extension [Self <: LinkInnerProps](x: Self) {
      
      inline def setContainsIcon(value: Boolean): Self = StObject.set(x, "containsIcon", value.asInstanceOf[js.Any])
      
      inline def setContainsIconUndefined: Self = StObject.set(x, "containsIcon", js.undefined)
      
      inline def setWithArrow(value: Boolean): Self = StObject.set(x, "withArrow", value.asInstanceOf[js.Any])
      
      inline def setWithArrowUndefined: Self = StObject.set(x, "withArrow", js.undefined)
    }
  }
  
  trait LinkProps
    extends StObject
       with LinkInnerProps
       with LinkStylesProps {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object LinkProps {
    
    inline def apply(): LinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkProps]
    }
    
    extension [Self <: LinkProps](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setOnClick(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait LinkStylesProps extends StObject {
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    var isButton: js.UndefOr[Boolean] = js.undefined
    
    var nochrome: js.UndefOr[Boolean] = js.undefined
    
    var secondary: js.UndefOr[Boolean] = js.undefined
    
    var tertiary: js.UndefOr[Boolean] = js.undefined
  }
  object LinkStylesProps {
    
    inline def apply(): LinkStylesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkStylesProps]
    }
    
    extension [Self <: LinkStylesProps](x: Self) {
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setIsButton(value: Boolean): Self = StObject.set(x, "isButton", value.asInstanceOf[js.Any])
      
      inline def setIsButtonUndefined: Self = StObject.set(x, "isButton", js.undefined)
      
      inline def setNochrome(value: Boolean): Self = StObject.set(x, "nochrome", value.asInstanceOf[js.Any])
      
      inline def setNochromeUndefined: Self = StObject.set(x, "nochrome", js.undefined)
      
      inline def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      inline def setTertiary(value: Boolean): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
      
      inline def setTertiaryUndefined: Self = StObject.set(x, "tertiary", js.undefined)
    }
  }
}
