package typings
package semanticDashUiDashProgressLib.SemanticUINs.ProgressNs.RandomSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 5
    */
  var max: scala.Double
  /**
    * @default 2
    */
  var min: scala.Double
}

object _Impl {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[_Impl]
  }
}

