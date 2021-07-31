package typings.storybookAddonNotes

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.storybookApi.mod.API
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panelMod {
  
  @JSImport("@storybook/addon-notes/dist/Panel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(hasActive: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasActive.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def NotesLink(hasHrefChildrenProps: NotesLinkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NotesLink")(hasHrefChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def SyntaxHighlighter(hasClassNameChildrenProps: SyntaxHighlighterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SyntaxHighlighter")(hasClassNameChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait NotesLinkProps extends StObject {
    
    var children: ReactElement
    
    var href: String
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
  
  trait Props extends StObject {
    
    var active: Boolean
    
    var api: API
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
  
  trait SyntaxHighlighterProps
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var children: ReactElement
    
    var className: js.UndefOr[String] = js.undefined
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
