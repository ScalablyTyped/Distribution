package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentEntry
  extends StObject
     with Node
     with MetafieldParentResource
     with MetafieldReference {
  
  var field: js.UndefOr[Metafield] = js.undefined
  
  var handle: String
  
  var `type`: String
  
  var updatedAt: DateTime
}
object ContentEntry {
  
  inline def apply(handle: String, id: ID, `type`: String, updatedAt: DateTime): ContentEntry = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentEntry] (val x: Self) extends AnyVal {
    
    inline def setField(value: Metafield): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: DateTime): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
