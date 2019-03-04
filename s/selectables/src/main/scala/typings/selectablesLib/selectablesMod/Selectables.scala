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
    disable: js.Function0[scala.Unit],
    enable: js.Function0[scala.Unit],
    options: selectablesLib.selectablesMod.SelectablesNs.Options
  ): Selectables = {
    val __obj = js.Dynamic.literal(disable = disable, enable = enable, options = options)
  
    __obj.asInstanceOf[Selectables]
  }
}

