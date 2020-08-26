package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import typings.sigmajs.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Camera extends js.Object {
  var angle: Double = js.native
  var ratio: Double = js.native
  var readPrefix: String = js.native
  var x: Double = js.native
  var y: Double = js.native
  def cameraPosition(x: Double, y: Double): X = js.native
  def goTo(settings: StringDictionary[js.Any]): Unit = js.native
  def graphPosition(x: Double, y: Double): X = js.native
  def settings(setting: String): js.Any = js.native
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
  @scala.inline
  implicit class CameraOps[Self <: Camera] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCameraPosition(value: (Double, Double) => X): Self = this.set("cameraPosition", js.Any.fromFunction2(value))
    @scala.inline
    def setGoTo(value: StringDictionary[js.Any] => Unit): Self = this.set("goTo", js.Any.fromFunction1(value))
    @scala.inline
    def setGraphPosition(value: (Double, Double) => X): Self = this.set("graphPosition", js.Any.fromFunction2(value))
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadPrefix(value: String): Self = this.set("readPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: String => js.Any): Self = this.set("settings", js.Any.fromFunction1(value))
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

