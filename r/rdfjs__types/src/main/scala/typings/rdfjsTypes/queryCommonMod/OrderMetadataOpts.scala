package typings.rdfjsTypes.queryCommonMod

import typings.rdfjsTypes.rdfjsTypesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderMetadataOpts extends StObject {
  
  var order: `true`
}
object OrderMetadataOpts {
  
  inline def apply(): OrderMetadataOpts = {
    val __obj = js.Dynamic.literal(order = true)
    __obj.asInstanceOf[OrderMetadataOpts]
  }
  
  extension [Self <: OrderMetadataOpts](x: Self) {
    
    inline def setOrder(value: `true`): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
