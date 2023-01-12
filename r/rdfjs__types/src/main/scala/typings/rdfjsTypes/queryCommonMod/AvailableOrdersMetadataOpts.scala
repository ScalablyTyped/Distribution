package typings.rdfjsTypes.queryCommonMod

import typings.rdfjsTypes.rdfjsTypesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableOrdersMetadataOpts extends StObject {
  
  var availableOrders: `true`
}
object AvailableOrdersMetadataOpts {
  
  inline def apply(): AvailableOrdersMetadataOpts = {
    val __obj = js.Dynamic.literal(availableOrders = true)
    __obj.asInstanceOf[AvailableOrdersMetadataOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailableOrdersMetadataOpts] (val x: Self) extends AnyVal {
    
    inline def setAvailableOrders(value: `true`): Self = StObject.set(x, "availableOrders", value.asInstanceOf[js.Any])
  }
}
