package typings.raygun.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTTPOptions extends StObject {
  
  var apiKey: String = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var useSSL: Boolean = js.native
}
object HTTPOptions {
  
  @scala.inline
  def apply(apiKey: String, useSSL: Boolean): HTTPOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], useSSL = useSSL.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPOptions]
  }
  
  @scala.inline
  implicit class HTTPOptionsMutableBuilder[Self <: HTTPOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setUseSSL(value: Boolean): Self = StObject.set(x, "useSSL", value.asInstanceOf[js.Any])
  }
}
