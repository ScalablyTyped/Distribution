package typings.reactNativeFirebase.mod.RNFirebase.firestore

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "RNFirebase.firestore.Blob")
@js.native
class Blob () extends StObject {
  
  def isEqual(other: Blob): Boolean = js.native
  
  def toBase64(): String = js.native
  
  def toUint8Array(): Uint8Array = js.native
}
object Blob {
  
  /* static member */
  @JSImport("react-native-firebase", "RNFirebase.firestore.Blob.fromBase64String")
  @js.native
  def fromBase64String(base64: String): Blob = js.native
  
  /* static member */
  @JSImport("react-native-firebase", "RNFirebase.firestore.Blob.fromUint8Array")
  @js.native
  def fromUint8Array(array: Uint8Array): Blob = js.native
}
