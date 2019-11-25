package typings.selectables.selectablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectables extends js.Object {
  var options: Options
  def disable(): Unit
  def enable(): Unit
}

object Selectables {
  @scala.inline
  def apply(disable: () => Unit, enable: () => Unit, options: Options): Selectables = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Selectables]
  }
}

