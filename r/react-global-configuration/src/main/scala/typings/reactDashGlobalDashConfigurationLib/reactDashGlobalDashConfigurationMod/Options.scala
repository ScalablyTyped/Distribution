package typings
package reactDashGlobalDashConfigurationLib.reactDashGlobalDashConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var assign: scala.Boolean
  var freeze: scala.Boolean
}

object Options {
  @scala.inline
  def apply(assign: scala.Boolean, freeze: scala.Boolean): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assign")(assign)
    __obj.updateDynamic("freeze")(freeze)
    __obj.asInstanceOf[Options]
  }
}

