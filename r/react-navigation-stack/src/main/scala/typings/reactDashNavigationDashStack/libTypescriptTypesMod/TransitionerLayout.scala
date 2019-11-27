package typings.reactDashNavigationDashStack.libTypescriptTypesMod

import typings.reactDashNative.reactDashNativeMod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionerLayout extends js.Object {
  var height: Value
  var initHeight: Double
  var initWidth: Double
  var isMeasured: Boolean
  var width: Value
}

object TransitionerLayout {
  @scala.inline
  def apply(height: Value, initHeight: Double, initWidth: Double, isMeasured: Boolean, width: Value): TransitionerLayout = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], initHeight = initHeight.asInstanceOf[js.Any], initWidth = initWidth.asInstanceOf[js.Any], isMeasured = isMeasured.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransitionerLayout]
  }
}

