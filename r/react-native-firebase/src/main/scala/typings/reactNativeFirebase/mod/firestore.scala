package typings.reactNativeFirebase.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestore extends Shortcut {
  
  @JSImport("react-native-firebase", "firestore")
  @js.native
  val ^ : FirestoreModule = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-firebase", "firestore.Blob")
  @js.native
  open class Blob ()
    extends typings.reactNativeFirebase.mod.RNFirebase.firestore.Blob
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-firebase", "firestore.FieldPath")
  @js.native
  open class FieldPath protected ()
    extends typings.reactNativeFirebase.mod.RNFirebase.firestore.FieldPath {
    def this(segments: String*) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-firebase", "firestore.FieldValue")
  @js.native
  open class FieldValue ()
    extends typings.reactNativeFirebase.mod.RNFirebase.firestore.FieldValue
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-firebase", "firestore.GeoPoint")
  @js.native
  open class GeoPoint protected ()
    extends typings.reactNativeFirebase.mod.RNFirebase.firestore.GeoPoint {
    def this(latitude: Double, longitude: Double) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-firebase", "firestore.Timestamp")
  @js.native
  open class Timestamp protected ()
    extends typings.reactNativeFirebase.mod.RNFirebase.firestore.Timestamp {
    def this(seconds: Double, nanoseconds: Double) = this()
  }
  
  type _To = FirestoreModule
  
  /* This means you don't have to write `^`, but can instead just say `firestore.foo` */
  override def _to: FirestoreModule = ^
}
