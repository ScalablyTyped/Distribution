package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "RNFirebase.firestore.Blob")
@js.native
class Blob () extends StObject {
  
  def isEqual(other: Blob): Boolean = js.native
  
  def toBase64(): String = js.native
  
  def toUint8Array(): Uint8Array = js.native
}
object Blob {
  
  @JSImport("react-native-firebase", "RNFirebase.firestore.Blob")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def fromBase64String(base64: String): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64String")(base64.asInstanceOf[js.Any]).asInstanceOf[Blob]
  
  /* static member */
  @scala.inline
  def fromUint8Array(array: Uint8Array): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Array")(array.asInstanceOf[js.Any]).asInstanceOf[Blob]
}
