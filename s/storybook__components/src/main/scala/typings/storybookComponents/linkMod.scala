package typings.storybookComponents

import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @JSImport("@storybook/components/dist/typography/link/link", "Link")
  @js.native
  val Link: FunctionComponent[LinkProps with AProps] = js.native
  
  type AProps = AnchorHTMLAttributes[HTMLAnchorElement]
  
  @js.native
  trait LinkInnerProps extends StObject {
    
    var containsIcon: js.UndefOr[Boolean] = js.native
    
    var withArrow: js.UndefOr[Boolean] = js.native
  }
  object LinkInnerProps {
    
    @scala.inline
    def apply(): LinkInnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkInnerProps]
    }
    
    @scala.inline
    implicit class LinkInnerPropsMutableBuilder[Self <: LinkInnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainsIcon(value: Boolean): Self = StObject.set(x, "containsIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsIconUndefined: Self = StObject.set(x, "containsIcon", js.undefined)
      
      @scala.inline
      def setWithArrow(value: Boolean): Self = StObject.set(x, "withArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithArrowUndefined: Self = StObject.set(x, "withArrow", js.undefined)
    }
  }
  
  @js.native
  trait LinkProps
    extends LinkInnerProps
       with LinkStylesProps {
    
    var cancel: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object LinkProps {
    
    @scala.inline
    def apply(): LinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkProps]
    }
    
    @scala.inline
    implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait LinkStylesProps extends StObject {
    
    var inverse: js.UndefOr[Boolean] = js.native
    
    var isButton: js.UndefOr[Boolean] = js.native
    
    var nochrome: js.UndefOr[Boolean] = js.native
    
    var secondary: js.UndefOr[Boolean] = js.native
    
    var tertiary: js.UndefOr[Boolean] = js.native
  }
  object LinkStylesProps {
    
    @scala.inline
    def apply(): LinkStylesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkStylesProps]
    }
    
    @scala.inline
    implicit class LinkStylesPropsMutableBuilder[Self <: LinkStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setIsButton(value: Boolean): Self = StObject.set(x, "isButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsButtonUndefined: Self = StObject.set(x, "isButton", js.undefined)
      
      @scala.inline
      def setNochrome(value: Boolean): Self = StObject.set(x, "nochrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNochromeUndefined: Self = StObject.set(x, "nochrome", js.undefined)
      
      @scala.inline
      def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      @scala.inline
      def setTertiary(value: Boolean): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTertiaryUndefined: Self = StObject.set(x, "tertiary", js.undefined)
    }
  }
}
