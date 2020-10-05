package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanGestureHandlerEventExtra extends js.Object {
  var absoluteX: Double = js.native
  var absoluteY: Double = js.native
  var translationX: Double = js.native
  var translationY: Double = js.native
  var velocityX: Double = js.native
  var velocityY: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object PanGestureHandlerEventExtra {
  @scala.inline
  def apply(
    absoluteX: Double,
    absoluteY: Double,
    translationX: Double,
    translationY: Double,
    velocityX: Double,
    velocityY: Double,
    x: Double,
    y: Double
  ): PanGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanGestureHandlerEventExtra]
  }
  @scala.inline
  implicit class PanGestureHandlerEventExtraOps[Self <: PanGestureHandlerEventExtra] (val x: Self) extends AnyVal {
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
    def setAbsoluteX(value: Double): Self = this.set("absoluteX", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbsoluteY(value: Double): Self = this.set("absoluteY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslationX(value: Double): Self = this.set("translationX", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslationY(value: Double): Self = this.set("translationY", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocityX(value: Double): Self = this.set("velocityX", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocityY(value: Double): Self = this.set("velocityY", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

