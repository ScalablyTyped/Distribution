package typings.simplecrawler

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActualDataSize extends StObject {
    
    var actualDataSize: Double
    
    var code: Double
    
    var contentLength: Double
    
    var contentType: String
    
    var downloadTime: Double
    
    var headers: js.Object
    
    var requestLatency: Double
    
    var requestTime: Double
    
    var sentIncorrectSize: Boolean
  }
  object ActualDataSize {
    
    inline def apply(
      actualDataSize: Double,
      code: Double,
      contentLength: Double,
      contentType: String,
      downloadTime: Double,
      headers: js.Object,
      requestLatency: Double,
      requestTime: Double,
      sentIncorrectSize: Boolean
    ): ActualDataSize = {
      val __obj = js.Dynamic.literal(actualDataSize = actualDataSize.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], contentLength = contentLength.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], downloadTime = downloadTime.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], requestLatency = requestLatency.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any], sentIncorrectSize = sentIncorrectSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActualDataSize]
    }
    
    extension [Self <: ActualDataSize](x: Self) {
      
      inline def setActualDataSize(value: Double): Self = StObject.set(x, "actualDataSize", value.asInstanceOf[js.Any])
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setDownloadTime(value: Double): Self = StObject.set(x, "downloadTime", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setRequestLatency(value: Double): Self = StObject.set(x, "requestLatency", value.asInstanceOf[js.Any])
      
      inline def setRequestTime(value: Double): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
      
      inline def setSentIncorrectSize(value: Boolean): Self = StObject.set(x, "sentIncorrectSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var Accept: String
    
    var `Accept-Encoding`: js.UndefOr[String] = js.undefined
    
    var Authorization: js.UndefOr[String] = js.undefined
    
    var Host: String
    
    var `Proxy-Authorization`: js.UndefOr[String] = js.undefined
    
    var Referer: js.UndefOr[String] = js.undefined
    
    var `User-Agent`: String
    
    var cookie: js.UndefOr[String] = js.undefined
  }
  object Dictkey {
    
    inline def apply(Accept: String, Host: String, `User-Agent`: String): Dictkey = {
      val __obj = js.Dynamic.literal(Accept = Accept.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any])
      __obj.updateDynamic("User-Agent")(`User-Agent`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setAccept(value: String): Self = StObject.set(x, "Accept", value.asInstanceOf[js.Any])
      
      inline def `setAccept-Encoding`(value: String): Self = StObject.set(x, "Accept-Encoding", value.asInstanceOf[js.Any])
      
      inline def `setAccept-EncodingUndefined`: Self = StObject.set(x, "Accept-Encoding", js.undefined)
      
      inline def setAuthorization(value: String): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationUndefined: Self = StObject.set(x, "Authorization", js.undefined)
      
      inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
      
      inline def `setProxy-Authorization`(value: String): Self = StObject.set(x, "Proxy-Authorization", value.asInstanceOf[js.Any])
      
      inline def `setProxy-AuthorizationUndefined`: Self = StObject.set(x, "Proxy-Authorization", js.undefined)
      
      inline def setReferer(value: String): Self = StObject.set(x, "Referer", value.asInstanceOf[js.Any])
      
      inline def setRefererUndefined: Self = StObject.set(x, "Referer", js.undefined)
      
      inline def `setUser-Agent`(value: String): Self = StObject.set(x, "User-Agent", value.asInstanceOf[js.Any])
    }
  }
}
