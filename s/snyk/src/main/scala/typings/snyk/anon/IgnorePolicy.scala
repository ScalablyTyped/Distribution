package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnorePolicy extends StObject {
  
  var ignorePolicy: js.UndefOr[Boolean] = js.undefined
  
  @JSName("org")
  var org_ : String
  
  var severityThreshold: js.UndefOr[Boolean] = js.undefined
}
object IgnorePolicy {
  
  inline def apply(org_ : String): IgnorePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnorePolicy]
  }
  
  extension [Self <: IgnorePolicy](x: Self) {
    
    inline def setIgnorePolicy(value: Boolean): Self = StObject.set(x, "ignorePolicy", value.asInstanceOf[js.Any])
    
    inline def setIgnorePolicyUndefined: Self = StObject.set(x, "ignorePolicy", js.undefined)
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setSeverityThreshold(value: Boolean): Self = StObject.set(x, "severityThreshold", value.asInstanceOf[js.Any])
    
    inline def setSeverityThresholdUndefined: Self = StObject.set(x, "severityThreshold", js.undefined)
  }
}
