package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listListListMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/List/ListList", JSImport.Default)
  @js.native
  val default: StatelessComponent[ListListProps] = js.native
  
  @js.native
  trait ListListProps
    extends StrictListListProps
       with /* key */ StringDictionary[js.Any]
  object ListListProps {
    
    @scala.inline
    def apply(): ListListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListListProps]
    }
  }
  
  @js.native
  trait StrictListListProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
  }
  object StrictListListProps {
    
    @scala.inline
    def apply(): StrictListListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictListListProps]
    }
    
    @scala.inline
    implicit class StrictListListPropsMutableBuilder[Self <: StrictListListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type _To = StatelessComponent[ListListProps]
  
  /* This means you don't have to write `default`, but can instead just say `listListListMod.foo` */
  override def _to: StatelessComponent[ListListProps] = default
}
