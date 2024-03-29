package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainSnapshotOption extends StObject {
  
  /**
    * Hour during which the service takes an automated daily snapshot of the indices in the domain.
    */
  var automatedSnapshotStartHour: Double
}
object GetDomainSnapshotOption {
  
  inline def apply(automatedSnapshotStartHour: Double): GetDomainSnapshotOption = {
    val __obj = js.Dynamic.literal(automatedSnapshotStartHour = automatedSnapshotStartHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainSnapshotOption]
  }
  
  extension [Self <: GetDomainSnapshotOption](x: Self) {
    
    inline def setAutomatedSnapshotStartHour(value: Double): Self = StObject.set(x, "automatedSnapshotStartHour", value.asInstanceOf[js.Any])
  }
}
