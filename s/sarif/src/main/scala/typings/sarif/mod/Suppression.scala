package typings.sarif.mod

import typings.sarif.mod.Suppression.kind
import typings.sarif.mod.Suppression.status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suppression extends StObject {
  
  /**
    * A stable, unique identifer for the suprression in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.undefined
  
  /**
    * A string representing the justification for the suppression.
    */
  var justification: js.UndefOr[String] = js.undefined
  
  /**
    * A string that indicates where the suppression is persisted.
    */
  var kind: kind
  
  /**
    * Identifies the location associated with the suppression.
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the suppression.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * A string that indicates the review status of the suppression.
    */
  var status: js.UndefOr[status] = js.undefined
}
object Suppression {
  
  @scala.inline
  def apply(kind: kind): Suppression = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suppression]
  }
  
  @scala.inline
  implicit class SuppressionMutableBuilder[Self <: Suppression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    @scala.inline
    def setJustification(value: String): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustificationUndefined: Self = StObject.set(x, "justification", js.undefined)
    
    @scala.inline
    def setKind(value: kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setStatus(value: status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.inSource
    - typings.sarif.sarifStrings.external
  */
  trait kind extends StObject
  object kind {
    
    @scala.inline
    def external: typings.sarif.sarifStrings.external = "external".asInstanceOf[typings.sarif.sarifStrings.external]
    
    @scala.inline
    def inSource: typings.sarif.sarifStrings.inSource = "inSource".asInstanceOf[typings.sarif.sarifStrings.inSource]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.accepted
    - typings.sarif.sarifStrings.underReview
    - typings.sarif.sarifStrings.rejected
  */
  trait status extends StObject
  object status {
    
    @scala.inline
    def accepted: typings.sarif.sarifStrings.accepted = "accepted".asInstanceOf[typings.sarif.sarifStrings.accepted]
    
    @scala.inline
    def rejected: typings.sarif.sarifStrings.rejected = "rejected".asInstanceOf[typings.sarif.sarifStrings.rejected]
    
    @scala.inline
    def underReview: typings.sarif.sarifStrings.underReview = "underReview".asInstanceOf[typings.sarif.sarifStrings.underReview]
  }
}
