package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportingDescriptorRelationship extends StObject {
  
  /**
    * A description of the reporting descriptor relationship.
    */
  var description: js.UndefOr[Message] = js.native
  
  /**
    * A set of distinct strings that categorize the relationship. Well-known kinds include 'canPrecede', 'canFollow',
    * 'willPrecede', 'willFollow', 'superset', 'subset', 'equal', 'disjoint', 'relevant', and 'incomparable'.
    */
  var kinds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Key/value pairs that provide additional information about the reporting descriptor reference.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * A reference to the related reporting descriptor.
    */
  var target: ReportingDescriptorReference = js.native
}
object ReportingDescriptorRelationship {
  
  @scala.inline
  def apply(target: ReportingDescriptorReference): ReportingDescriptorRelationship = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportingDescriptorRelationship]
  }
  
  @scala.inline
  implicit class ReportingDescriptorRelationshipMutableBuilder[Self <: ReportingDescriptorRelationship] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: ReportingDescriptorReference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
