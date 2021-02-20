package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.semanticUiReactStrings.big
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.massive
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Comment/CommentGroup", JSImport.Default)
  @js.native
  val default: StatelessComponent[CommentGroupProps] = js.native
  
  @js.native
  trait CommentGroupProps
    extends StrictCommentGroupProps
       with /* key */ StringDictionary[js.Any]
  object CommentGroupProps {
    
    @scala.inline
    def apply(): CommentGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentGroupProps]
    }
  }
  
  @js.native
  trait StrictCommentGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Comments can be collapsed, or hidden from view. */
    var collapsed: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** Comments can hide extra information unless a user shows intent to interact with a comment */
    var minimal: js.UndefOr[Boolean] = js.native
    
    /** Comments can have different sizes. */
    var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.native
    
    /** A comment list can be threaded to showing the relationship between conversations */
    var threaded: js.UndefOr[Boolean] = js.native
  }
  object StrictCommentGroupProps {
    
    @scala.inline
    def apply(): StrictCommentGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCommentGroupProps]
    }
    
    @scala.inline
    implicit class StrictCommentGroupPropsMutableBuilder[Self <: StrictCommentGroupProps] (val x: Self) extends AnyVal {
      
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
      
      @scala.inline
      def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      @scala.inline
      def setSize(value: mini | tiny | small | large | big | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setThreaded(value: Boolean): Self = StObject.set(x, "threaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreadedUndefined: Self = StObject.set(x, "threaded", js.undefined)
    }
  }
  
  type _To = StatelessComponent[CommentGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `commentGroupMod.foo` */
  override def _to: StatelessComponent[CommentGroupProps] = default
}
