package typings.storybookAddonNotes

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.storybookApi.mod.API
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPanelMod {
  
  @JSImport("@storybook/addon-notes/dist/Panel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def NotesLink(param0: NotesLinkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NotesLink")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SyntaxHighlighter(param0: SyntaxHighlighterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SyntaxHighlighter")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait NotesLinkProps extends StObject {
    
    var children: ReactElement
    
    var href: String
  }
  object NotesLinkProps {
    
    inline def apply(children: ReactElement, href: String): NotesLinkProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotesLinkProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotesLinkProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var active: Boolean
    
    var api: API
  }
  object Props {
    
    inline def apply(active: Boolean, api: API): Props = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    }
  }
  
  trait SyntaxHighlighterProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var children: ReactElement
    
    var className: js.UndefOr[String] = js.undefined
  }
  object SyntaxHighlighterProps {
    
    inline def apply(children: ReactElement): SyntaxHighlighterProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[SyntaxHighlighterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyntaxHighlighterProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
