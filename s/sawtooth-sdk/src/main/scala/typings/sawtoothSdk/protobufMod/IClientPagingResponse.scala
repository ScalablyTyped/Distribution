package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientPagingResponse extends StObject {
  
  /** ClientPagingResponse limit */
  var limit: js.UndefOr[Double | Null] = js.undefined
  
  /** ClientPagingResponse next */
  var next: js.UndefOr[String | Null] = js.undefined
  
  /** ClientPagingResponse start */
  var start: js.UndefOr[String | Null] = js.undefined
}
object IClientPagingResponse {
  
  inline def apply(): IClientPagingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientPagingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClientPagingResponse] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitNull: Self = StObject.set(x, "limit", null)
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
