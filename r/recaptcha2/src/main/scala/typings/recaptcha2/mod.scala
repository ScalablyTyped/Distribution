package typings.recaptcha2

import typings.recaptcha2.recaptcha2Booleans.`true`
import typings.recaptcha2.recaptcha2Strings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("recaptcha2", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Recaptcha2 {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var secretKey: String
    
    var siteKey: String
    
    var ssl: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(secretKey: String, siteKey: String): Options = {
      val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any], siteKey = siteKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      inline def setSiteKey(value: String): Self = StObject.set(x, "siteKey", value.asInstanceOf[js.Any])
      
      inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    }
  }
  
  @js.native
  trait Recaptcha2 extends StObject {
    
    def formElement(htmlClass: String): String = js.native
    
    def getRequestOptions[T /* <: js.Object */](body: T): RequestOptions[T] = js.native
    
    def translateErrors(errorCodes: String): String = js.native
    def translateErrors(errorCodes: js.Array[String]): js.Array[String] = js.native
    
    def validate(token: String): js.Promise[Unit] = js.native
    
    def validateRequest(req: js.Object, ip: String): js.Promise[Unit] = js.native
  }
  
  trait RequestOptions[T] extends StObject {
    
    var form: T
    
    var json: `true`
    
    var method: POST
    
    var uri: String
  }
  object RequestOptions {
    
    inline def apply[T](form: T, uri: String): RequestOptions[T] = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], json = true, method = "POST", uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions[T]]
    }
    
    extension [Self <: RequestOptions[?], T](x: Self & RequestOptions[T]) {
      
      inline def setForm(value: T): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
