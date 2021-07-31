package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainSnapshotOptions extends StObject {
  
  /**
    * Hour during which the service takes an automated daily snapshot of the indices in the domain.
    */
  var automatedSnapshotStartHour: Double
}
object DomainSnapshotOptions {
  
  @scala.inline
  def apply(automatedSnapshotStartHour: Double): DomainSnapshotOptions = {
    val __obj = js.Dynamic.literal(automatedSnapshotStartHour = automatedSnapshotStartHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainSnapshotOptions]
  }
  
  @scala.inline
  implicit class DomainSnapshotOptionsMutableBuilder[Self <: DomainSnapshotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomatedSnapshotStartHour(value: Double): Self = StObject.set(x, "automatedSnapshotStartHour", value.asInstanceOf[js.Any])
  }
}
