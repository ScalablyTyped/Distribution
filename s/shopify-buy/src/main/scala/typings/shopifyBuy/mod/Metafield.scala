package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metafield
  extends StObject
     with Node {
  
  var createdAt: DateTime
  
  var description: js.UndefOr[String] = js.undefined
  
  var key: String
  
  var namespace: String
  
  var parentResource: MetafieldParentResource
  
  var reference: js.UndefOr[MetafieldReference] = js.undefined
  
  var `type`: String
  
  var updatedAt: DateTime
  
  var value: String
}
object Metafield {
  
  inline def apply(
    createdAt: DateTime,
    id: ID,
    key: String,
    namespace: String,
    parentResource: MetafieldParentResource,
    `type`: String,
    updatedAt: DateTime,
    value: String
  ): Metafield = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], parentResource = parentResource.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metafield]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metafield] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setParentResource(value: MetafieldParentResource): Self = StObject.set(x, "parentResource", value.asInstanceOf[js.Any])
    
    inline def setReference(value: MetafieldReference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: DateTime): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
