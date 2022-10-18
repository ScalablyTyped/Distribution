package typings.rdfjsTypes.queryCommonMod

import typings.rdfjsTypes.rdfjsTypesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableOrdersMetadataSupport extends StObject {
  
  var availableOrders: `true`
}
object AvailableOrdersMetadataSupport {
  
  inline def apply(): AvailableOrdersMetadataSupport = {
    val __obj = js.Dynamic.literal(availableOrders = true)
    __obj.asInstanceOf[AvailableOrdersMetadataSupport]
  }
  
  extension [Self <: AvailableOrdersMetadataSupport](x: Self) {
    
    inline def setAvailableOrders(value: `true`): Self = StObject.set(x, "availableOrders", value.asInstanceOf[js.Any])
  }
}
