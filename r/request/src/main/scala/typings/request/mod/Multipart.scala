package typings.request.mod

import typings.request.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Multipart extends StObject {
  
  var chunked: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[js.Array[Body]] = js.undefined
}
object Multipart {
  
  inline def apply(): Multipart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multipart]
  }
  
  extension [Self <: Multipart](x: Self) {
    
    inline def setChunked(value: Boolean): Self = StObject.set(x, "chunked", value.asInstanceOf[js.Any])
    
    inline def setChunkedUndefined: Self = StObject.set(x, "chunked", js.undefined)
    
    inline def setData(value: js.Array[Body]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Body*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
