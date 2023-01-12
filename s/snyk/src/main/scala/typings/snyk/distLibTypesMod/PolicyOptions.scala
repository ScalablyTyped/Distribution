package typings.snyk.distLibTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyOptions extends StObject {
  
  var `ignore-policy`: js.UndefOr[Boolean] = js.undefined
  
  var loose: js.UndefOr[Boolean] = js.undefined
  
  var `policy-path`: js.UndefOr[String] = js.undefined
  
  var `trust-policies`: js.UndefOr[Boolean] = js.undefined
}
object PolicyOptions {
  
  inline def apply(): PolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyOptions] (val x: Self) extends AnyVal {
    
    inline def `setIgnore-policy`(value: Boolean): Self = StObject.set(x, "ignore-policy", value.asInstanceOf[js.Any])
    
    inline def `setIgnore-policyUndefined`: Self = StObject.set(x, "ignore-policy", js.undefined)
    
    inline def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
    
    inline def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
    
    inline def `setPolicy-path`(value: String): Self = StObject.set(x, "policy-path", value.asInstanceOf[js.Any])
    
    inline def `setPolicy-pathUndefined`: Self = StObject.set(x, "policy-path", js.undefined)
    
    inline def `setTrust-policies`(value: Boolean): Self = StObject.set(x, "trust-policies", value.asInstanceOf[js.Any])
    
    inline def `setTrust-policiesUndefined`: Self = StObject.set(x, "trust-policies", js.undefined)
  }
}
