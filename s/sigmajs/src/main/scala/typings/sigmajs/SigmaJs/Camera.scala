package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typings.sigmajs.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Camera extends js.Object {
  var angle: Double
  var ratio: Double
  var readPrefix: String
  var x: Double
  var y: Double
  def cameraPosition(x: Double, y: Double): X
  def goTo(settings: StringDictionary[js.Any]): Unit
  def graphPosition(x: Double, y: Double): X
  def settings(setting: String): js.Any
}

object Camera {
  @scala.inline
  def apply(
    angle: Double,
    cameraPosition: (Double, Double) => X,
    goTo: StringDictionary[js.Any] => Unit,
    graphPosition: (Double, Double) => X,
    ratio: Double,
    readPrefix: String,
    settings: String => js.Any,
    x: Double,
    y: Double
  ): Camera = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], cameraPosition = js.Any.fromFunction2(cameraPosition), goTo = js.Any.fromFunction1(goTo), graphPosition = js.Any.fromFunction2(graphPosition), ratio = ratio.asInstanceOf[js.Any], readPrefix = readPrefix.asInstanceOf[js.Any], settings = js.Any.fromFunction1(settings), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
}

