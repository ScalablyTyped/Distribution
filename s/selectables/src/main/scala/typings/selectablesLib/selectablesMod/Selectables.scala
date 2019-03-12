package typings
package selectablesLib.selectablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectables extends js.Object {
  var options: selectablesLib.selectablesMod.SelectablesNs.Options
  def disable(): scala.Unit
  def enable(): scala.Unit
}

object Selectables {
  @scala.inline
  def apply(
    disable: () => scala.Unit,
    enable: () => scala.Unit,
    options: selectablesLib.selectablesMod.SelectablesNs.Options
  ): Selectables = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), options = options)
  
    __obj.asInstanceOf[Selectables]
  }
}

