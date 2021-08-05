package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedUserMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Feed/FeedUser", JSImport.Default)
  @js.native
  val default: StatelessComponent[FeedUserProps] = js.native
  
  trait FeedUserProps
    extends StObject
       with StrictFeedUserProps
       with /* key */ StringDictionary[js.Any]
  object FeedUserProps {
    
    inline def apply(): FeedUserProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedUserProps]
    }
  }
  
  trait StrictFeedUserProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictFeedUserProps {
    
    inline def apply(): StrictFeedUserProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFeedUserProps]
    }
    
    extension [Self <: StrictFeedUserProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type _To = StatelessComponent[FeedUserProps]
  
  /* This means you don't have to write `default`, but can instead just say `feedUserMod.foo` */
  override def _to: StatelessComponent[FeedUserProps] = default
}
