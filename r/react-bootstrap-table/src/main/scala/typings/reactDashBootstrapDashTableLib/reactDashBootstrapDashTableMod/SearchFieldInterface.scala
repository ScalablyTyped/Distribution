package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFieldInterface extends js.Object {
  /**
  	 * getValue should return the current search text.
  	 */
  def getValue(): java.lang.String
  /**
  	 * setValue should update the current search text to the given value.
  	 */
  def setValue(search: java.lang.String): scala.Unit
}

object SearchFieldInterface {
  @scala.inline
  def apply(getValue: () => java.lang.String, setValue: java.lang.String => scala.Unit): SearchFieldInterface = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[SearchFieldInterface]
  }
}

