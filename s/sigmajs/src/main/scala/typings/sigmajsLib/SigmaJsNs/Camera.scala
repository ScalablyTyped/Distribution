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
    cameraPosition: (scala.Double, scala.Double) => sigmajsLib.Anon_X,
    goTo: org.scalablytyped.runtime.StringDictionary[js.Any] => scala.Unit,
    graphPosition: (scala.Double, scala.Double) => sigmajsLib.Anon_X,
    ratio: scala.Double,
    readPrefix: java.lang.String,
    settings: java.lang.String => js.Any,
    x: scala.Double,
    y: scala.Double
  ): Camera = {
    val __obj = js.Dynamic.literal(angle = angle, cameraPosition = js.Any.fromFunction2(cameraPosition), goTo = js.Any.fromFunction1(goTo), graphPosition = js.Any.fromFunction2(graphPosition), ratio = ratio, readPrefix = readPrefix, settings = js.Any.fromFunction1(settings), x = x, y = y)
  
    __obj.asInstanceOf[Camera]
  }
}

