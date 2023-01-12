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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderMetadataOpts] (val x: Self) extends AnyVal {
    
    inline def setOrder(value: `true`): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
