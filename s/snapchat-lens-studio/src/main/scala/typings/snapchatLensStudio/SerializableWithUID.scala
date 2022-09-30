package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Low-level data class.
  */
trait SerializableWithUID
  extends StObject
     with ScriptObject {
  
  /** Returns true if this object is the same as other. Useful for checking if two references point to the same thing. */
  def isSame(other: SerializableWithUID): Boolean
}
object SerializableWithUID {
  
  inline def apply(getTypeName: () => String, isOfType: String => Boolean, isSame: SerializableWithUID => Boolean): SerializableWithUID = {
    val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame))
    __obj.asInstanceOf[SerializableWithUID]
  }
  
  extension [Self <: SerializableWithUID](x: Self) {
    
    inline def setIsSame(value: SerializableWithUID => Boolean): Self = StObject.set(x, "isSame", js.Any.fromFunction1(value))
  }
}
