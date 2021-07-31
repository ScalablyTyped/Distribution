package typings.sharepoint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupId extends StObject {
  
  var LookupId: Double
  
  var LookupValue: String
}
object LookupId {
  
  @scala.inline
  def apply(LookupId: Double, LookupValue: String): LookupId = {
    val __obj = js.Dynamic.literal(LookupId = LookupId.asInstanceOf[js.Any], LookupValue = LookupValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupId]
  }
  
  @scala.inline
  implicit class LookupIdMutableBuilder[Self <: LookupId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLookupId(value: Double): Self = StObject.set(x, "LookupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupValue(value: String): Self = StObject.set(x, "LookupValue", value.asInstanceOf[js.Any])
  }
}
