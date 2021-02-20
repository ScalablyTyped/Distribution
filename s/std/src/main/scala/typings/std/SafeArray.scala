package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an Automation SAFEARRAY
  */
@js.native
trait SafeArray[T] extends StObject {
  
  var SafeArray_typekey: SafeArray[T] = js.native
}
object SafeArray {
  
  @scala.inline
  def apply[T](SafeArray_typekey: SafeArray[T]): SafeArray[T] = {
    val __obj = js.Dynamic.literal(SafeArray_typekey = SafeArray_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeArray[T]]
  }
  
  @scala.inline
  implicit class SafeArrayMutableBuilder[Self <: SafeArray[_], T] (val x: Self with SafeArray[T]) extends AnyVal {
    
    @scala.inline
    def setSafeArray_typekey(value: SafeArray[T]): Self = StObject.set(x, "SafeArray_typekey", value.asInstanceOf[js.Any])
  }
}
