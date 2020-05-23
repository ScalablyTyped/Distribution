package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base64EncodedByteArray extends js.Object {
  def append(b: js.Any): Unit
  def getByteAt(index: Double): js.Any
  def get_length(): Double
  def setByteAt(index: Double, b: js.Any): Unit
  def toBase64String(): String
}

object Base64EncodedByteArray {
  @scala.inline
  def apply(
    append: js.Any => Unit,
    getByteAt: Double => js.Any,
    get_length: () => Double,
    setByteAt: (Double, js.Any) => Unit,
    toBase64String: () => String
  ): Base64EncodedByteArray = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), getByteAt = js.Any.fromFunction1(getByteAt), get_length = js.Any.fromFunction0(get_length), setByteAt = js.Any.fromFunction2(setByteAt), toBase64String = js.Any.fromFunction0(toBase64String))
    __obj.asInstanceOf[Base64EncodedByteArray]
  }
}

