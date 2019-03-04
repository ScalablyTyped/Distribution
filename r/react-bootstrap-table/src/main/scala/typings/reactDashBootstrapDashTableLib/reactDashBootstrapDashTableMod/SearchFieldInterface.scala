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
  def apply(getValue: js.Function0[java.lang.String], setValue: js.Function1[java.lang.String, scala.Unit]): SearchFieldInterface = {
    val __obj = js.Dynamic.literal(getValue = getValue, setValue = setValue)
  
    __obj.asInstanceOf[SearchFieldInterface]
  }
}

