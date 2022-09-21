package typings.rdfjsTypes.commonMod

import typings.rdfjsTypes.rdfjsTypesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderMetadataSupport extends StObject {
  
  var order: `true`
}
object OrderMetadataSupport {
  
  inline def apply(): OrderMetadataSupport = {
    val __obj = js.Dynamic.literal(order = true)
    __obj.asInstanceOf[OrderMetadataSupport]
  }
  
  extension [Self <: OrderMetadataSupport](x: Self) {
    
    inline def setOrder(value: `true`): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
