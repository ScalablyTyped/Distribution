package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientPagingControls extends StObject {
  
  /** ClientPagingControls limit */
  var limit: js.UndefOr[Double | Null] = js.undefined
  
  /** ClientPagingControls start */
  var start: js.UndefOr[String | Null] = js.undefined
}
object IClientPagingControls {
  
  inline def apply(): IClientPagingControls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientPagingControls]
  }
  
  extension [Self <: IClientPagingControls](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitNull: Self = StObject.set(x, "limit", null)
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
