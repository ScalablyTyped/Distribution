package typings.reactNativeFirebase.mod.RNFirebase.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "RNFirebase.firestore.FieldPath")
@js.native
open class FieldPath protected () extends StObject {
  def this(segments: String*) = this()
}
object FieldPath {
  
  @JSImport("react-native-firebase", "RNFirebase.firestore.FieldPath")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def documentId(): FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[FieldPath]
}
