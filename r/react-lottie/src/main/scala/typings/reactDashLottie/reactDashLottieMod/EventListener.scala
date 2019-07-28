package typings.reactDashLottie.reactDashLottieMod

import typings.reactDashLottie.reactDashLottieStrings.DOMLoaded
import typings.reactDashLottie.reactDashLottieStrings.complete
import typings.reactDashLottie.reactDashLottieStrings.config_ready
import typings.reactDashLottie.reactDashLottieStrings.data_ready
import typings.reactDashLottie.reactDashLottieStrings.destroy
import typings.reactDashLottie.reactDashLottieStrings.enterFrame
import typings.reactDashLottie.reactDashLottieStrings.loaded_images
import typings.reactDashLottie.reactDashLottieStrings.loopComplete
import typings.reactDashLottie.reactDashLottieStrings.segmentStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListener extends js.Object {
  /**
    * The event sent by Lottie
    */
  var eventName: complete | loopComplete | enterFrame | segmentStart | config_ready | data_ready | loaded_images | DOMLoaded | destroy
  /**
    * A callback that will be executed when the given eventName is received
    */
  def callback(): Unit
}

object EventListener {
  @scala.inline
  def apply(
    callback: () => Unit,
    eventName: complete | loopComplete | enterFrame | segmentStart | config_ready | data_ready | loaded_images | DOMLoaded | destroy
  ): EventListener = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), eventName = eventName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventListener]
  }
}

