package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.commentActionMod.CommentActionProps
import typings.semanticUiReact.commentActionsMod.CommentActionsProps
import typings.semanticUiReact.commentAuthorMod.CommentAuthorProps
import typings.semanticUiReact.commentAvatarMod.CommentAvatarProps
import typings.semanticUiReact.commentContentMod.CommentContentProps
import typings.semanticUiReact.commentGroupMod.CommentGroupProps
import typings.semanticUiReact.commentMetadataMod.CommentMetadataProps
import typings.semanticUiReact.commentTextMod.CommentTextProps
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentCommentMod {
  
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/views/Comment/Comment", JSImport.Default)
    @js.native
    val ^ : CommentComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/views/Comment/Comment", "default.Action")
    @js.native
    class Action protected ()
      extends Component[CommentActionProps, ComponentState, js.Any] {
      def this(props: CommentActionProps) = this()
      def this(props: CommentActionProps, context: js.Any) = this()
    }
    
    type _To = CommentComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CommentComponent = ^
  }
  
  @js.native
  trait CommentComponent extends FunctionComponent[CommentProps] {
    
    var Action: ComponentClass[CommentActionProps, ComponentState] = js.native
    
    var Actions: StatelessComponent[CommentActionsProps] = js.native
    
    var Author: StatelessComponent[CommentAuthorProps] = js.native
    
    var Avatar: StatelessComponent[CommentAvatarProps] = js.native
    
    var Content: StatelessComponent[CommentContentProps] = js.native
    
    var Group: StatelessComponent[CommentGroupProps] = js.native
    
    var Metadata: StatelessComponent[CommentMetadataProps] = js.native
    
    var Text: StatelessComponent[CommentTextProps] = js.native
  }
  
  @js.native
  trait CommentProps
    extends StrictCommentProps
       with /* key */ StringDictionary[js.Any]
  object CommentProps {
    
    @scala.inline
    def apply(): CommentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentProps]
    }
  }
  
  @js.native
  trait StrictCommentProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Comment can be collapsed, or hidden from view. */
    var collapsed: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
  }
  object StrictCommentProps {
    
    @scala.inline
    def apply(): StrictCommentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCommentProps]
    }
    
    @scala.inline
    implicit class StrictCommentPropsMutableBuilder[Self <: StrictCommentProps] (val x: Self) extends AnyVal {
      
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
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
}
