package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.storybookComponents.anon.PickButtonPropscolortrans
import typings.storybookComponents.anon.PickLinkPropscolortransla
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("@storybook/components/dist/bar/button", "IconButton")
  @js.native
  val IconButton: StyledComponent[PickButtonPropscolortrans | PickLinkPropscolortransla, IconButtonProps, Theme] = js.native
  
  @JSImport("@storybook/components/dist/bar/button", "TabButton")
  @js.native
  val TabButton: StyledComponent[PickButtonPropscolortrans | PickLinkPropscolortransla, TabButtonProps, Theme] = js.native
  
  trait ButtonProps
    extends StObject
       with ClassAttributes[HTMLButtonElement]
       with ButtonHTMLAttributes[HTMLButtonElement] {
    
    var href: js.UndefOr[Unit] = js.undefined
  }
  object ButtonProps {
    
    @scala.inline
    def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: Unit): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    }
  }
  
  trait IconButtonProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
  }
  object IconButtonProps {
    
    @scala.inline
    def apply(): IconButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconButtonProps]
    }
    
    @scala.inline
    implicit class IconButtonPropsMutableBuilder[Self <: IconButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    }
  }
  
  trait LinkProps
    extends StObject
       with ClassAttributes[HTMLAnchorElement]
       with AnchorHTMLAttributes[HTMLAnchorElement] {
    
    @JSName("href")
    var href_LinkProps: String
  }
  object LinkProps {
    
    @scala.inline
    def apply(href: String): LinkProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps]
    }
    
    @scala.inline
    implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabButtonProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
  }
  object TabButtonProps {
    
    @scala.inline
    def apply(): TabButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabButtonProps]
    }
    
    @scala.inline
    implicit class TabButtonPropsMutableBuilder[Self <: TabButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    }
  }
}
