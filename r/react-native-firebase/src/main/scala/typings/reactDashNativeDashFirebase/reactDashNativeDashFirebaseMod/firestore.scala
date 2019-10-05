package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "firestore")
@js.native
object firestore extends TopLevel[FirestoreModule] {
  @js.native
  class GeoPoint protected ()
    extends typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.GeoPoint {
    def this(latitude: Double, longitude: Double) = this()
  }
  
}

