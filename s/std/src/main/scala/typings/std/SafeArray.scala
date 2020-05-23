package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an Automation SAFEARRAY
  */
trait SafeArray[T] extends js.Object {
  var SafeArray_typekey: SafeArray[T]
}

object SafeArray {
  @scala.inline
  def apply[T](SafeArray_typekey: SafeArray[T]): SafeArray[T] = {
    val __obj = js.Dynamic.literal(SafeArray_typekey = SafeArray_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeArray[T]]
  }
}

