package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsCollectionsMessageMessageContentMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/MessageContent", JSImport.Default)
  @js.native
  val default: FC[MessageContentProps] = js.native
  
  trait MessageContentProps
    extends StObject
       with StrictMessageContentProps
       with /* key */ StringDictionary[Any]
  object MessageContentProps {
    
    inline def apply(): MessageContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageContentProps]
    }
  }
  
  trait StrictMessageContentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictMessageContentProps {
    
    inline def apply(): StrictMessageContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMessageContentProps]
    }
    
    extension [Self <: StrictMessageContentProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type _To = FC[MessageContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsCollectionsMessageMessageContentMod.foo` */
  override def _to: FC[MessageContentProps] = default
}
