package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationRelationship extends StObject {
  
  /**
    * A description of the location relationship.
    */
  var description: js.UndefOr[Message] = js.undefined
  
  /**
    * A set of distinct strings that categorize the relationship. Well-known kinds include 'includes', 'isIncludedBy'
    * and 'relevant'.
    */
  var kinds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the location relationship.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * A reference to the related location.
    */
  var target: Double
}
object LocationRelationship {
  
  inline def apply(target: Double): LocationRelationship = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRelationship]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationRelationship] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKinds(value: js.Array[String]): Self = StObject.set(x, "kinds", value.asInstanceOf[js.Any])
    
    inline def setKindsUndefined: Self = StObject.set(x, "kinds", js.undefined)
    
    inline def setKindsVarargs(value: String*): Self = StObject.set(x, "kinds", js.Array(value*))
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
