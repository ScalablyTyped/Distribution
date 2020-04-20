package typings.reactLottie.mod

import typings.reactLottie.reactLottieStrings.DOMLoaded
import typings.reactLottie.reactLottieStrings.complete
import typings.reactLottie.reactLottieStrings.config_ready
import typings.reactLottie.reactLottieStrings.data_ready
import typings.reactLottie.reactLottieStrings.destroy
import typings.reactLottie.reactLottieStrings.enterFrame
import typings.reactLottie.reactLottieStrings.loaded_images
import typings.reactLottie.reactLottieStrings.loopComplete
import typings.reactLottie.reactLottieStrings.segmentStart
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

