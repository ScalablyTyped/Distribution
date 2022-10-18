package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsCommentCommentActionMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/views/Comment/CommentAction", JSImport.Default)
  @js.native
  open class default protected () extends Component[CommentActionProps, ComponentState, Any] {
    def this(props: CommentActionProps) = this()
    def this(props: CommentActionProps, context: Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/views/Comment/CommentAction", JSImport.Default)
  @js.native
  val default: ComponentClass[CommentActionProps, ComponentState] = js.native
  
  trait CommentActionProps
    extends StObject
       with StrictCommentActionProps
       with /* key */ StringDictionary[Any]
  object CommentActionProps {
    
    inline def apply(): CommentActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentActionProps]
    }
  }
  
  trait StrictCommentActionProps extends StObject {
    
    /** Style as the currently active action. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictCommentActionProps {
    
    inline def apply(): StrictCommentActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCommentActionProps]
    }
    
    extension [Self <: StrictCommentActionProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
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
  
  type _To = ComponentClass[CommentActionProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsCommentCommentActionMod.foo` */
  override def _to: ComponentClass[CommentActionProps, ComponentState] = default
}
