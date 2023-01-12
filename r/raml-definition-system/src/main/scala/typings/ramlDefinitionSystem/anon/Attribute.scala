package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute extends StObject {
  
  var annotations: NameString
  
  var attribute: NameString
  
  var name: NameString
  
  var namespace: NameString
  
  var prefix: NameString
  
  var wrapped: NameString
}
object Attribute {
  
  inline def apply(
    annotations: NameString,
    attribute: NameString,
    name: NameString,
    namespace: NameString,
    prefix: NameString,
    wrapped: NameString
  ): Attribute = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], attribute = attribute.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], wrapped = wrapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAttribute(value: NameString): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: NameString): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: NameString): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setWrapped(value: NameString): Self = StObject.set(x, "wrapped", value.asInstanceOf[js.Any])
  }
}
