package typings.samlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Post extends StObject {
    
    var post: js.UndefOr[String] = js.undefined
    
    var redirect: js.UndefOr[String] = js.undefined
  }
  object Post {
    
    inline def apply(): Post = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Post]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Post] (val x: Self) extends AnyVal {
      
      inline def setPost(value: String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    }
  }
}
