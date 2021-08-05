package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotViewIOSProps
  extends StObject
     with ViewProps {
  
  // A callback when the Snapshot view is ready to be compared
  def onSnapshotReady(): js.Any
  
  // A name to identify the individual instance to the SnapshotView
  var testIdentifier: String
}
object SnapshotViewIOSProps {
  
  inline def apply(onSnapshotReady: () => js.Any, testIdentifier: String): SnapshotViewIOSProps = {
    val __obj = js.Dynamic.literal(onSnapshotReady = js.Any.fromFunction0(onSnapshotReady), testIdentifier = testIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotViewIOSProps]
  }
  
  extension [Self <: SnapshotViewIOSProps](x: Self) {
    
    inline def setOnSnapshotReady(value: () => js.Any): Self = StObject.set(x, "onSnapshotReady", js.Any.fromFunction0(value))
    
    inline def setTestIdentifier(value: String): Self = StObject.set(x, "testIdentifier", value.asInstanceOf[js.Any])
  }
}
