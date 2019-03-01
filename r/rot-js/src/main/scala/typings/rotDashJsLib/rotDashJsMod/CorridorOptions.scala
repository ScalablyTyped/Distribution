package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorridorOptions extends FeatureOptions {
  var corridorLength: js.Tuple2[scala.Double, scala.Double]
}

object CorridorOptions {
  @scala.inline
  def apply(corridorLength: js.Tuple2[scala.Double, scala.Double]): CorridorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("corridorLength")(corridorLength)
    __obj.asInstanceOf[CorridorOptions]
  }
}

