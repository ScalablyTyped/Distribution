package typings.storybookAddonNotes

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.storybookApi.mod.API
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod {
  
  @JSImport("@storybook/addon-notes/dist/Panel", JSImport.Default)
  @js.native
  def default(hasActive: Props): Element = js.native
  
  @JSImport("@storybook/addon-notes/dist/Panel", "NotesLink")
  @js.native
  def NotesLink(hasHrefChildrenProps: NotesLinkProps): Element = js.native
  
  @JSImport("@storybook/addon-notes/dist/Panel", "SyntaxHighlighter")
  @js.native
  def SyntaxHighlighter(hasClassNameChildrenProps: SyntaxHighlighterProps): Element = js.native
  
  @js.native
  trait NotesLinkProps extends StObject {
    
    var children: ReactElement = js.native
    
    var href: String = js.native
  }
  object NotesLinkProps {
    
    @scala.inline
    def apply(children: ReactElement, href: String): NotesLinkProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotesLinkProps]
    }
    
    @scala.inline
    implicit class NotesLinkPropsMutableBuilder[Self <: NotesLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Props extends StObject {
    
    var active: Boolean = js.native
    
    var api: API = js.native
  }
  object Props {
    
    @scala.inline
    def apply(active: Boolean, api: API): Props = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SyntaxHighlighterProps
    extends /* key */ StringDictionary[js.Any] {
    
    var children: ReactElement = js.native
    
    var className: js.UndefOr[String] = js.native
  }
  object SyntaxHighlighterProps {
    
    @scala.inline
    def apply(children: ReactElement): SyntaxHighlighterProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyntaxHighlighterProps]
    }
    
    @scala.inline
    implicit class SyntaxHighlighterPropsMutableBuilder[Self <: SyntaxHighlighterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
