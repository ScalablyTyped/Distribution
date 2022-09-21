package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilCoreStrings.`Accept-Encoding`
import typings.stencilCore.stencilCoreStrings.gzip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevResponseHeaders extends StObject {
  
  var `access-control-allow-origin`: js.UndefOr[String] = js.undefined
  
  var `access-control-expose-headers`: js.UndefOr[String] = js.undefined
  
  var `cache-control`: js.UndefOr[String] = js.undefined
  
  var `content-encoding`: js.UndefOr[gzip] = js.undefined
  
  var `content-length`: js.UndefOr[Double] = js.undefined
  
  var `content-type`: js.UndefOr[String] = js.undefined
  
  var date: js.UndefOr[String] = js.undefined
  
  var expires: js.UndefOr[String] = js.undefined
  
  var server: js.UndefOr[String] = js.undefined
  
  var vary: js.UndefOr[`Accept-Encoding`] = js.undefined
  
  var `x-directory-index`: js.UndefOr[String] = js.undefined
  
  var `x-source`: js.UndefOr[String] = js.undefined
}
object DevResponseHeaders {
  
  inline def apply(): DevResponseHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevResponseHeaders]
  }
  
  extension [Self <: DevResponseHeaders](x: Self) {
    
    inline def `setAccess-control-allow-origin`(value: String): Self = StObject.set(x, "access-control-allow-origin", value.asInstanceOf[js.Any])
    
    inline def `setAccess-control-allow-originUndefined`: Self = StObject.set(x, "access-control-allow-origin", js.undefined)
    
    inline def `setAccess-control-expose-headers`(value: String): Self = StObject.set(x, "access-control-expose-headers", value.asInstanceOf[js.Any])
    
    inline def `setAccess-control-expose-headersUndefined`: Self = StObject.set(x, "access-control-expose-headers", js.undefined)
    
    inline def `setCache-control`(value: String): Self = StObject.set(x, "cache-control", value.asInstanceOf[js.Any])
    
    inline def `setCache-controlUndefined`: Self = StObject.set(x, "cache-control", js.undefined)
    
    inline def `setContent-encoding`(value: gzip): Self = StObject.set(x, "content-encoding", value.asInstanceOf[js.Any])
    
    inline def `setContent-encodingUndefined`: Self = StObject.set(x, "content-encoding", js.undefined)
    
    inline def `setContent-length`(value: Double): Self = StObject.set(x, "content-length", value.asInstanceOf[js.Any])
    
    inline def `setContent-lengthUndefined`: Self = StObject.set(x, "content-length", js.undefined)
    
    inline def `setContent-type`(value: String): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
    
    inline def `setContent-typeUndefined`: Self = StObject.set(x, "content-type", js.undefined)
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setVary(value: `Accept-Encoding`): Self = StObject.set(x, "vary", value.asInstanceOf[js.Any])
    
    inline def setVaryUndefined: Self = StObject.set(x, "vary", js.undefined)
    
    inline def `setX-directory-index`(value: String): Self = StObject.set(x, "x-directory-index", value.asInstanceOf[js.Any])
    
    inline def `setX-directory-indexUndefined`: Self = StObject.set(x, "x-directory-index", js.undefined)
    
    inline def `setX-source`(value: String): Self = StObject.set(x, "x-source", value.asInstanceOf[js.Any])
    
    inline def `setX-sourceUndefined`: Self = StObject.set(x, "x-source", js.undefined)
  }
}
