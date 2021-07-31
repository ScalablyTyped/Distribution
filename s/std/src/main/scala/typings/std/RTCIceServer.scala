package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceServer extends StObject {
  
  var credential: js.UndefOr[java.lang.String | RTCOAuthCredential] = js.undefined
  
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.undefined
  
  var urls: java.lang.String | js.Array[java.lang.String]
  
  var username: js.UndefOr[java.lang.String] = js.undefined
}
object RTCIceServer {
  
  @scala.inline
  def apply(urls: java.lang.String | js.Array[java.lang.String]): RTCIceServer = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceServer]
  }
  
  @scala.inline
  implicit class RTCIceServerMutableBuilder[Self <: RTCIceServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredential(value: java.lang.String | RTCOAuthCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialType(value: RTCIceCredentialType): Self = StObject.set(x, "credentialType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialTypeUndefined: Self = StObject.set(x, "credentialType", js.undefined)
    
    @scala.inline
    def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
    
    @scala.inline
    def setUrls(value: java.lang.String | js.Array[java.lang.String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsVarargs(value: java.lang.String*): Self = StObject.set(x, "urls", js.Array(value :_*))
    
    @scala.inline
    def setUsername(value: java.lang.String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
