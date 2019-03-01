package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Camera extends js.Object {
  var angle: scala.Double
  var ratio: scala.Double
  var readPrefix: java.lang.String
  var x: scala.Double
  var y: scala.Double
  def cameraPosition(x: scala.Double, y: scala.Double): sigmajsLib.Anon_X
  def goTo(settings: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit
  def graphPosition(x: scala.Double, y: scala.Double): sigmajsLib.Anon_X
  def settings(setting: java.lang.String): js.Any
}

object Camera {
  @scala.inline
  def apply(
    angle: scala.Double,
    cameraPosition: js.Function2[scala.Double, scala.Double, sigmajsLib.Anon_X],
    goTo: js.Function1[org.scalablytyped.runtime.StringDictionary[js.Any], scala.Unit],
    graphPosition: js.Function2[scala.Double, scala.Double, sigmajsLib.Anon_X],
    ratio: scala.Double,
    readPrefix: java.lang.String,
    settings: js.Function1[java.lang.String, js.Any],
    x: scala.Double,
    y: scala.Double
  ): Camera = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("angle")(angle)
    __obj.updateDynamic("cameraPosition")(cameraPosition)
    __obj.updateDynamic("goTo")(goTo)
    __obj.updateDynamic("graphPosition")(graphPosition)
    __obj.updateDynamic("ratio")(ratio)
    __obj.updateDynamic("readPrefix")(readPrefix)
    __obj.updateDynamic("settings")(settings)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Camera]
  }
}

