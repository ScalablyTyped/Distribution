package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentAvatarMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Comment/CommentAvatar", JSImport.Default)
  @js.native
  val default: FC[CommentAvatarProps] = js.native
  
  trait CommentAvatarProps
    extends StObject
       with StrictCommentAvatarProps
       with /* key */ StringDictionary[Any]
  object CommentAvatarProps {
    
    inline def apply(): CommentAvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentAvatarProps]
    }
  }
  
  trait StrictCommentAvatarProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Specifies the URL of the image. */
    var src: js.UndefOr[String] = js.undefined
  }
  object StrictCommentAvatarProps {
    
    inline def apply(): StrictCommentAvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictCommentAvatarProps]
    }
    
    extension [Self <: StrictCommentAvatarProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  type _To = FC[CommentAvatarProps]
  
  /* This means you don't have to write `default`, but can instead just say `commentAvatarMod.foo` */
  override def _to: FC[CommentAvatarProps] = default
}
