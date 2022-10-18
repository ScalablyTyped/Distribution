package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FC
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticUiReact.distCommonjsViewsCommentCommentActionMod.CommentActionProps
import typings.semanticUiReact.distCommonjsViewsCommentCommentActionsMod.CommentActionsProps
import typings.semanticUiReact.distCommonjsViewsCommentCommentAuthorMod.CommentAuthorProps
import typings.semanticUiReact.distCommonjsViewsCommentCommentAvatarMod.CommentAvatarProps
import typings.semanticUiReact.distCommonjsViewsCommentCommentContentMod.CommentContentProps
import typings.semanticUiReact.distCommonjsViewsCommentCommentGroupMod.CommentGroupProps
import typings.semanticUiReact.distCommonjsViewsCommentCommentMetadataMod.CommentMetadataProps
import typings.semanticUiReact.distCommonjsViewsCommentCommentTextMod.CommentTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsViewsCommentCommentMod {
  
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/views/Comment/Comment", JSImport.Default)
    @js.native
    val ^ : CommentComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/views/Comment/Comment", "default.Action")
    @js.native
    open class Action protected () extends Component[CommentActionProps, ComponentState, Any] {
      def this(props: CommentActionProps) = this()
      def this(props: CommentActionProps, context: Any) = this()
    }
    
    type _To = CommentComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CommentComponent = ^
  }
  
  @js.native
  trait CommentComponent
    extends StObject
       with FunctionComponent[CommentProps] {
    
    var Action: ComponentClass[CommentActionProps, ComponentState] = js.native
    
    var Actions: FC[CommentActionsProps] = js.native
    
    var Author: FC[CommentAuthorProps] = js.native
    
    var Avatar: FC[CommentAvatarProps] = js.native
    
    var Content: FC[CommentContentProps] = js.native
    
    var Group: FC[CommentGroupProps] = js.native
    
    var Metadata: FC[CommentMetadataProps] = js.native
    
    var Text: FC[CommentTextProps] = js.native
  }
  
  trait CommentProps
    extends StObject
       with StrictCommentProps
       with /* key */ StringDictionary[Any]
  object CommentProps {
    
    inline def apply(): CommentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentProps]
    }
  }
  
  trait StrictCommentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Comment can be collapsed, or hidden from view. */
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  }
  object StrictCommentProps {
    
    inline def apply(): StrictCommentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCommentProps]
    }
    
    extension [Self <: StrictCommentProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
}
