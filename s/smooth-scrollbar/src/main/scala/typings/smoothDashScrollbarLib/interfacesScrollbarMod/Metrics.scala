package typings
package smoothDashScrollbarLib.interfacesScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metrics extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object Metrics {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Metrics]
  }
}

