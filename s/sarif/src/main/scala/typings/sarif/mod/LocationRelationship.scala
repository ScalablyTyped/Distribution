package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationRelationship extends StObject {
  
  /**
    * A description of the location relationship.
    */
  var description: js.UndefOr[Message] = js.native
  
  /**
    * A set of distinct strings that categorize the relationship. Well-known kinds include 'includes', 'isIncludedBy'
    * and 'relevant'.
    */
  var kinds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Key/value pairs that provide additional information about the location relationship.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * A reference to the related location.
    */
  var target: Double = js.native
}
object LocationRelationship {
  
  @scala.inline
  def apply(target: Double): LocationRelationship = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRelationship]
  }
  
  @scala.inline
  implicit class LocationRelationshipMutableBuilder[Self <: LocationRelationship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setKinds(value: js.Array[String]): Self = StObject.set(x, "kinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindsUndefined: Self = StObject.set(x, "kinds", js.undefined)
    
    @scala.inline
    def setKindsVarargs(value: String*): Self = StObject.set(x, "kinds", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
