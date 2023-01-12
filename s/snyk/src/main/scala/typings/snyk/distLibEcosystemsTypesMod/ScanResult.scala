package typings.snyk.distLibEcosystemsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanResult extends StObject {
  
  var analytics: js.UndefOr[js.Array[Analytics]] = js.undefined
  
  var facts: js.Array[Facts]
  
  var findings: js.UndefOr[js.Array[Finding]] = js.undefined
  
  var identity: Identity
  
  var name: js.UndefOr[String] = js.undefined
  
  var policy: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[GitTarget | ContainerTarget | NamedTarget] = js.undefined
  
  var targetReference: js.UndefOr[String] = js.undefined
}
object ScanResult {
  
  inline def apply(facts: js.Array[Facts], identity: Identity): ScanResult = {
    val __obj = js.Dynamic.literal(facts = facts.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScanResult] (val x: Self) extends AnyVal {
    
    inline def setAnalytics(value: js.Array[Analytics]): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
    
    inline def setAnalyticsVarargs(value: Analytics*): Self = StObject.set(x, "analytics", js.Array(value*))
    
    inline def setFacts(value: js.Array[Facts]): Self = StObject.set(x, "facts", value.asInstanceOf[js.Any])
    
    inline def setFactsVarargs(value: Facts*): Self = StObject.set(x, "facts", js.Array(value*))
    
    inline def setFindings(value: js.Array[Finding]): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    inline def setFindingsVarargs(value: Finding*): Self = StObject.set(x, "findings", js.Array(value*))
    
    inline def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setTarget(value: GitTarget | ContainerTarget | NamedTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetReference(value: String): Self = StObject.set(x, "targetReference", value.asInstanceOf[js.Any])
    
    inline def setTargetReferenceUndefined: Self = StObject.set(x, "targetReference", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
