package typings.reactNativeFirebase.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "firestore")
@js.native
object firestore extends TopLevel[FirestoreModule] {
  
  @js.native
  class GeoPoint protected ()
    extends typings.reactNativeFirebase.mod.RNFirebase.firestore.GeoPoint {
    def this(latitude: Double, longitude: Double) = this()
  }
}
