package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentAvatarMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Comment/CommentAvatar", JSImport.Default)
  @js.native
  val default: StatelessComponent[CommentAvatarProps] = js.native
  
  @js.native
  trait CommentAvatarProps
    extends StrictCommentAvatarProps
       with /* key */ StringDictionary[js.Any]
  object CommentAvatarProps {
    
    @scala.inline
    def apply(): CommentAvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentAvatarProps]
    }
  }
  
  @js.native
  trait StrictCommentAvatarProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Specifies the URL of the image. */
    var src: js.UndefOr[String] = js.native
  }
  object StrictCommentAvatarProps {
    
    @scala.inline
    def apply(): StrictCommentAvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCommentAvatarProps]
    }
    
    @scala.inline
    implicit class StrictCommentAvatarPropsMutableBuilder[Self <: StrictCommentAvatarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  type _To = StatelessComponent[CommentAvatarProps]
  
  /* This means you don't have to write `default`, but can instead just say `commentAvatarMod.foo` */
  override def _to: StatelessComponent[CommentAvatarProps] = default
}
