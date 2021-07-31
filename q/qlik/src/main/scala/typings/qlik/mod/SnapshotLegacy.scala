package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotLegacy extends StObject {
  
  var canTakeSnapshot: Boolean
}
object SnapshotLegacy {
  
  @scala.inline
  def apply(canTakeSnapshot: Boolean): SnapshotLegacy = {
    val __obj = js.Dynamic.literal(canTakeSnapshot = canTakeSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotLegacy]
  }
  
  @scala.inline
  implicit class SnapshotLegacyMutableBuilder[Self <: SnapshotLegacy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanTakeSnapshot(value: Boolean): Self = StObject.set(x, "canTakeSnapshot", value.asInstanceOf[js.Any])
  }
}
