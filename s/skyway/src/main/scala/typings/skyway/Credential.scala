package typings.skyway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credential extends StObject {
  
  var authToken: js.UndefOr[String] = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
  
  var ttl: js.UndefOr[Double] = js.native
}
object Credential {
  
  @scala.inline
  def apply(): Credential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credential]
  }
  
  @scala.inline
  implicit class CredentialMutableBuilder[Self <: Credential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
