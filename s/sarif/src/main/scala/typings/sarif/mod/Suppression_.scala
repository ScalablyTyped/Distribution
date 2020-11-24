package typings.sarif.mod

import typings.sarif.mod.Suppression.kind
import typings.sarif.mod.Suppression.status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Suppression_ extends js.Object {
  
  /**
    * A stable, unique identifer for the suprression in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.native
  
  /**
    * A string representing the justification for the suppression.
    */
  var justification: js.UndefOr[String] = js.native
  
  /**
    * A string that indicates where the suppression is persisted.
    */
  var kind: kind = js.native
  
  /**
    * Identifies the location associated with the suppression.
    */
  var location: js.UndefOr[Location] = js.native
  
  /**
    * Key/value pairs that provide additional information about the suppression.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * A string that indicates the review status of the suppression.
    */
  var status: js.UndefOr[status] = js.native
}
object Suppression_ {
  
  @scala.inline
  def apply(kind: kind): Suppression_ = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suppression_]
  }
  
  @scala.inline
  implicit class Suppression_Ops[Self <: Suppression_] (val x: Self) extends AnyVal {
    
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
    def setKind(value: kind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    
    @scala.inline
    def setJustification(value: String): Self = this.set("justification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustification: Self = this.set("justification", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setStatus(value: status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
