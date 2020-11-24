package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationRelationship extends js.Object {
  
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
  implicit class LocationRelationshipOps[Self <: LocationRelationship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTarget(value: Double): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Message): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setKindsVarargs(value: String*): Self = this.set("kinds", js.Array(value :_*))
    
    @scala.inline
    def setKinds(value: js.Array[String]): Self = this.set("kinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinds: Self = this.set("kinds", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
