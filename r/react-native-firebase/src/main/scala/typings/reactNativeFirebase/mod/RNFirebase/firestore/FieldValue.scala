package typings.reactNativeFirebase.mod.RNFirebase.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "RNFirebase.firestore.FieldValue")
@js.native
open class FieldValue () extends StObject
object FieldValue {
  
  @JSImport("react-native-firebase", "RNFirebase.firestore.FieldValue")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def arrayRemove(elements: AnyJs*): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FieldValue]
  
  /* static member */
  inline def arrayUnion(elements: AnyJs*): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FieldValue]
  
  /* static member */
  inline def delete(): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")().asInstanceOf[FieldValue]
  
  /* static member */
  inline def increment(n: Double): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[FieldValue]
  
  /* static member */
  inline def serverTimestamp(): FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[FieldValue]
}
