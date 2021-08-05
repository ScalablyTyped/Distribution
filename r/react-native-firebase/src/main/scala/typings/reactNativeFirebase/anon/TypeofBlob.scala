package typings.reactNativeFirebase.anon

import typings.reactNativeFirebase.mod.RNFirebase.firestore.Blob
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBlob extends StObject {
  
  /* static member */
  def fromBase64String(base64: String): Blob
  
  /* static member */
  def fromUint8Array(array: Uint8Array): Blob
}
object TypeofBlob {
  
  inline def apply(fromBase64String: String => Blob, fromUint8Array: Uint8Array => Blob): TypeofBlob = {
    val __obj = js.Dynamic.literal(fromBase64String = js.Any.fromFunction1(fromBase64String), fromUint8Array = js.Any.fromFunction1(fromUint8Array))
    __obj.asInstanceOf[TypeofBlob]
  }
  
  extension [Self <: TypeofBlob](x: Self) {
    
    inline def setFromBase64String(value: String => Blob): Self = StObject.set(x, "fromBase64String", js.Any.fromFunction1(value))
    
    inline def setFromUint8Array(value: Uint8Array => Blob): Self = StObject.set(x, "fromUint8Array", js.Any.fromFunction1(value))
  }
}
