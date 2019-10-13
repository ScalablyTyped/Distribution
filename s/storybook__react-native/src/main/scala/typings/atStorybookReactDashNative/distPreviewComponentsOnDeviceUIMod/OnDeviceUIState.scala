package typings.atStorybookReactDashNative.distPreviewComponentsOnDeviceUIMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDeviceUIState extends js.Object {
  var previewHeight: Double
  var previewWidth: Double
  var slideBetweenAnimation: Boolean
  var tabOpen: Double
}

object OnDeviceUIState {
  @scala.inline
  def apply(previewHeight: Double, previewWidth: Double, slideBetweenAnimation: Boolean, tabOpen: Double): OnDeviceUIState = {
    val __obj = js.Dynamic.literal(previewHeight = previewHeight, previewWidth = previewWidth, slideBetweenAnimation = slideBetweenAnimation, tabOpen = tabOpen)
  
    __obj.asInstanceOf[OnDeviceUIState]
  }
}

