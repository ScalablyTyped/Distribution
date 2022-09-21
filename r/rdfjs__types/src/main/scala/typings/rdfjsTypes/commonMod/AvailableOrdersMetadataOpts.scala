package typings.rdfjsTypes.commonMod

import typings.rdfjsTypes.rdfjsTypesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableOrdersMetadataOpts
  extends StObject
     with _MetadataOpts[Any] {
  
  var availableOrders: `true`
}
object AvailableOrdersMetadataOpts {
  
  inline def apply(): AvailableOrdersMetadataOpts = {
    val __obj = js.Dynamic.literal(availableOrders = true)
    __obj.asInstanceOf[AvailableOrdersMetadataOpts]
  }
  
  extension [Self <: AvailableOrdersMetadataOpts](x: Self) {
    
    inline def setAvailableOrders(value: `true`): Self = StObject.set(x, "availableOrders", value.asInstanceOf[js.Any])
  }
}
