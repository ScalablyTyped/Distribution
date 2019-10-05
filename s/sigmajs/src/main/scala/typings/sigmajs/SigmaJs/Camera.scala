package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typings.sigmajs.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Camera extends js.Object {
  var angle: Double
  var ratio: Double
  var readPrefix: String
  var x: Double
  var y: Double
  def cameraPosition(x: Double, y: Double): Anon_X
  def goTo(settings: StringDictionary[js.Any]): Unit
  def graphPosition(x: Double, y: Double): Anon_X
  def settings(setting: String): js.Any
}

object Camera {
  @scala.inline
  def apply(
    angle: Double,
    cameraPosition: (Double, Double) => Anon_X,
    goTo: StringDictionary[js.Any] => Unit,
    graphPosition: (Double, Double) => Anon_X,
    ratio: Double,
    readPrefix: String,
    settings: String => js.Any,
    x: Double,
    y: Double
  ): Camera = {
    val __obj = js.Dynamic.literal(angle = angle, cameraPosition = js.Any.fromFunction2(cameraPosition), goTo = js.Any.fromFunction1(goTo), graphPosition = js.Any.fromFunction2(graphPosition), ratio = ratio, readPrefix = readPrefix, settings = js.Any.fromFunction1(settings), x = x, y = y)
  
    __obj.asInstanceOf[Camera]
  }
}

