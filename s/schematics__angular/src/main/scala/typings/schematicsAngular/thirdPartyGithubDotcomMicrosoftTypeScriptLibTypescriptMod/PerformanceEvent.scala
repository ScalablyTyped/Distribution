package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import typings.schematicsAngular.schematicsAngularStrings.CreatePackageJsonAutoImportProvider
import typings.schematicsAngular.schematicsAngularStrings.UpdateGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceEvent extends StObject {
  
  var durationMs: Double
  
  var kind: UpdateGraph | CreatePackageJsonAutoImportProvider
}
object PerformanceEvent {
  
  inline def apply(durationMs: Double, kind: UpdateGraph | CreatePackageJsonAutoImportProvider): PerformanceEvent = {
    val __obj = js.Dynamic.literal(durationMs = durationMs.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceEvent] (val x: Self) extends AnyVal {
    
    inline def setDurationMs(value: Double): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    inline def setKind(value: UpdateGraph | CreatePackageJsonAutoImportProvider): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
