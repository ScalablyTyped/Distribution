package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Categories extends StObject {
  
  var PNAccessDeniedCategory: String = js.native
  
  var PNBadRequestCategory: String = js.native
  
  var PNConnectedCategory: String = js.native
  
  var PNMalformedResponseCategory: String = js.native
  
  var PNNetworkDownCategory: String = js.native
  
  var PNNetworkIssuesCategory: String = js.native
  
  var PNNetworkUpCategory: String = js.native
  
  var PNReconnectedCategory: String = js.native
  
  var PNRequestMessageCountExceedCategory: String = js.native
  
  var PNTimeoutCategory: String = js.native
  
  var PNUnknownCategory: String = js.native
}
object Categories {
  
  @scala.inline
  def apply(
    PNAccessDeniedCategory: String,
    PNBadRequestCategory: String,
    PNConnectedCategory: String,
    PNMalformedResponseCategory: String,
    PNNetworkDownCategory: String,
    PNNetworkIssuesCategory: String,
    PNNetworkUpCategory: String,
    PNReconnectedCategory: String,
    PNRequestMessageCountExceedCategory: String,
    PNTimeoutCategory: String,
    PNUnknownCategory: String
  ): Categories = {
    val __obj = js.Dynamic.literal(PNAccessDeniedCategory = PNAccessDeniedCategory.asInstanceOf[js.Any], PNBadRequestCategory = PNBadRequestCategory.asInstanceOf[js.Any], PNConnectedCategory = PNConnectedCategory.asInstanceOf[js.Any], PNMalformedResponseCategory = PNMalformedResponseCategory.asInstanceOf[js.Any], PNNetworkDownCategory = PNNetworkDownCategory.asInstanceOf[js.Any], PNNetworkIssuesCategory = PNNetworkIssuesCategory.asInstanceOf[js.Any], PNNetworkUpCategory = PNNetworkUpCategory.asInstanceOf[js.Any], PNReconnectedCategory = PNReconnectedCategory.asInstanceOf[js.Any], PNRequestMessageCountExceedCategory = PNRequestMessageCountExceedCategory.asInstanceOf[js.Any], PNTimeoutCategory = PNTimeoutCategory.asInstanceOf[js.Any], PNUnknownCategory = PNUnknownCategory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Categories]
  }
  
  @scala.inline
  implicit class CategoriesMutableBuilder[Self <: Categories] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPNAccessDeniedCategory(value: String): Self = StObject.set(x, "PNAccessDeniedCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNBadRequestCategory(value: String): Self = StObject.set(x, "PNBadRequestCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNConnectedCategory(value: String): Self = StObject.set(x, "PNConnectedCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNMalformedResponseCategory(value: String): Self = StObject.set(x, "PNMalformedResponseCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNNetworkDownCategory(value: String): Self = StObject.set(x, "PNNetworkDownCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNNetworkIssuesCategory(value: String): Self = StObject.set(x, "PNNetworkIssuesCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNNetworkUpCategory(value: String): Self = StObject.set(x, "PNNetworkUpCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNReconnectedCategory(value: String): Self = StObject.set(x, "PNReconnectedCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNRequestMessageCountExceedCategory(value: String): Self = StObject.set(x, "PNRequestMessageCountExceedCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNTimeoutCategory(value: String): Self = StObject.set(x, "PNTimeoutCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNUnknownCategory(value: String): Self = StObject.set(x, "PNUnknownCategory", value.asInstanceOf[js.Any])
  }
}
