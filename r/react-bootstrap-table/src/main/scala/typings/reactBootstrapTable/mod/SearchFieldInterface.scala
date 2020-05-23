package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFieldInterface extends js.Object {
  /**
    * getValue should return the current search text.
    */
  def getValue(): String
  /**
    * setValue should update the current search text to the given value.
    */
  def setValue(search: String): Unit
}

object SearchFieldInterface {
  @scala.inline
  def apply(getValue: () => String, setValue: String => Unit): SearchFieldInterface = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[SearchFieldInterface]
  }
}

