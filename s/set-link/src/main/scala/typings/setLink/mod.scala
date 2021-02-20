package typings.setLink

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.setLink.anon.Attach
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("set-link", JSImport.Namespace)
  @js.native
  val ^ : (RequestHandler[ParamsDictionary, _, _, Query]) with Attach = js.native
  
  type _To = (RequestHandler[ParamsDictionary, _, _, Query]) with Attach
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: (RequestHandler[ParamsDictionary, _, _, Query]) with Attach = ^
  
  object expressServeStaticCoreAugmentingMod {
    
    @js.native
    trait Response extends StObject {
      
      def setLink(link: String, rel: String): Unit = js.native
    }
    object Response {
      
      @scala.inline
      def apply(setLink: (String, String) => Unit): Response = {
        val __obj = js.Dynamic.literal(setLink = js.Any.fromFunction2(setLink))
        __obj.asInstanceOf[Response]
      }
      
      @scala.inline
      implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSetLink(value: (String, String) => Unit): Self = StObject.set(x, "setLink", js.Any.fromFunction2(value))
      }
    }
  }
}
