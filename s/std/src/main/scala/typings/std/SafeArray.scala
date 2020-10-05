package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an Automation SAFEARRAY
  */
@js.native
trait SafeArray[T] extends js.Object {
  var SafeArray_typekey: SafeArray[T] = js.native
}

object SafeArray {
  @scala.inline
  def apply[T](SafeArray_typekey: SafeArray[T]): SafeArray[T] = {
    val __obj = js.Dynamic.literal(SafeArray_typekey = SafeArray_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeArray[T]]
  }
  @scala.inline
  implicit class SafeArrayOps[Self <: SafeArray[_], T] (val x: Self with SafeArray[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSafeArray_typekey(value: SafeArray[T]): Self = this.set("SafeArray_typekey", value.asInstanceOf[js.Any])
  }
  
}

