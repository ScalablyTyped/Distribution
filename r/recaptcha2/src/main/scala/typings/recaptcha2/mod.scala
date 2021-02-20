package typings.recaptcha2

import typings.recaptcha2.recaptcha2Booleans.`true`
import typings.recaptcha2.recaptcha2Strings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("recaptcha2", JSImport.Namespace)
  @js.native
  class ^ protected () extends Recaptcha2 {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var secretKey: String = js.native
    
    var siteKey: String = js.native
    
    var ssl: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(secretKey: String, siteKey: String): Options = {
      val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any], siteKey = siteKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiteKey(value: String): Self = StObject.set(x, "siteKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
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
  
  @js.native
  trait RequestOptions[T] extends StObject {
    
    var form: T = js.native
    
    var json: `true` = js.native
    
    var method: POST = js.native
    
    var uri: String = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply[T](form: T, json: `true`, method: POST, uri: String): RequestOptions[T] = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions[T]]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions[_], T] (val x: Self with RequestOptions[T]) extends AnyVal {
      
      @scala.inline
      def setForm(value: T): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
