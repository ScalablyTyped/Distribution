package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an Automation SAFEARRAY
  */
trait SafeArray[T] extends StObject {
  
  /* standard scripthost */
  /* private */ var SafeArray_typekey: SafeArray[T]
}
object SafeArray {
  
  inline def apply[T](SafeArray_typekey: SafeArray[T]): SafeArray[T] = {
    val __obj = js.Dynamic.literal(SafeArray_typekey = SafeArray_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeArray[T]]
  }
  
  extension [Self <: SafeArray[?], T](x: Self & SafeArray[T]) {
    
    inline def setSafeArray_typekey(value: SafeArray[T]): Self = StObject.set(x, "SafeArray_typekey", value.asInstanceOf[js.Any])
  }
}
