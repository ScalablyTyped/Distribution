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

object listHeaderMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/List/ListHeader", JSImport.Default)
  @js.native
  val default: StatelessComponent[ListHeaderProps] = js.native
  
  @js.native
  trait ListHeaderProps
    extends StrictListHeaderProps
       with /* key */ StringDictionary[js.Any]
  object ListHeaderProps {
    
    @scala.inline
    def apply(): ListHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListHeaderProps]
    }
  }
  
  @js.native
  trait StrictListHeaderProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
  }
  object StrictListHeaderProps {
    
    @scala.inline
    def apply(): StrictListHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictListHeaderProps]
    }
    
    @scala.inline
    implicit class StrictListHeaderPropsMutableBuilder[Self <: StrictListHeaderProps] (val x: Self) extends AnyVal {
      
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
  
  type _To = StatelessComponent[ListHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `listHeaderMod.foo` */
  override def _to: StatelessComponent[ListHeaderProps] = default
}
