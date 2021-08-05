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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Comment/CommentGroup", JSImport.Default)
  @js.native
  val default: StatelessComponent[CommentGroupProps] = js.native
  
  trait CommentGroupProps
    extends StObject
       with StrictCommentGroupProps
       with /* key */ StringDictionary[js.Any]
  object CommentGroupProps {
    
    inline def apply(): CommentGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentGroupProps]
    }
  }
  
  trait StrictCommentGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Comments can be collapsed, or hidden from view. */
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Comments can hide extra information unless a user shows intent to interact with a comment */
    var minimal: js.UndefOr[Boolean] = js.undefined
    
    /** Comments can have different sizes. */
    var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.undefined
    
    /** A comment list can be threaded to showing the relationship between conversations */
    var threaded: js.UndefOr[Boolean] = js.undefined
  }
  object StrictCommentGroupProps {
    
    inline def apply(): StrictCommentGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCommentGroupProps]
    }
    
    extension [Self <: StrictCommentGroupProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      inline def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      inline def setSize(value: mini | tiny | small | large | big | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setThreaded(value: Boolean): Self = StObject.set(x, "threaded", value.asInstanceOf[js.Any])
      
      inline def setThreadedUndefined: Self = StObject.set(x, "threaded", js.undefined)
    }
  }
  
  type _To = StatelessComponent[CommentGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `commentGroupMod.foo` */
  override def _to: StatelessComponent[CommentGroupProps] = default
}
