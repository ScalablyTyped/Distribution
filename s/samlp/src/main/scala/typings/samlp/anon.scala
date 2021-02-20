package typings.samlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Post extends StObject {
    
    var post: js.UndefOr[String] = js.native
    
    var redirect: js.UndefOr[String] = js.native
  }
  object Post {
    
    @scala.inline
    def apply(): Post = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Post]
    }
    
    @scala.inline
    implicit class PostMutableBuilder[Self <: Post] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPost(value: String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      @scala.inline
      def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    }
  }
}
