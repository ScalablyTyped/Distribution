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
  
  @scala.inline
  def apply(): Multipart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multipart]
  }
  
  @scala.inline
  implicit class MultipartMutableBuilder[Self <: Multipart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunked(value: Boolean): Self = StObject.set(x, "chunked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkedUndefined: Self = StObject.set(x, "chunked", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[Body]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: Body*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
