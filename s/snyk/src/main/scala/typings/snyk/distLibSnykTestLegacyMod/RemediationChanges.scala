package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemediationChanges extends StObject {
  
  var ignore: Any
  
  var patch: StringDictionary[PatchRemediation]
  
  var pin: DependencyPins
  
  var unresolved: js.Array[IssueData]
  
  var upgrade: DependencyUpdates
}
object RemediationChanges {
  
  inline def apply(
    ignore: Any,
    patch: StringDictionary[PatchRemediation],
    pin: DependencyPins,
    unresolved: js.Array[IssueData],
    upgrade: DependencyUpdates
  ): RemediationChanges = {
    val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], unresolved = unresolved.asInstanceOf[js.Any], upgrade = upgrade.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemediationChanges]
  }
  
  extension [Self <: RemediationChanges](x: Self) {
    
    inline def setIgnore(value: Any): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: StringDictionary[PatchRemediation]): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPin(value: DependencyPins): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setUnresolved(value: js.Array[IssueData]): Self = StObject.set(x, "unresolved", value.asInstanceOf[js.Any])
    
    inline def setUnresolvedVarargs(value: IssueData*): Self = StObject.set(x, "unresolved", js.Array(value*))
    
    inline def setUpgrade(value: DependencyUpdates): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
  }
}
