package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorUserMedia extends js.Object {
  val mediaDevices: MediaDevices
  def getDisplayMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream]
  def getUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): Unit
}

object NavigatorUserMedia {
  @scala.inline
  def apply(
    getDisplayMedia: MediaStreamConstraints => js.Promise[MediaStream],
    getUserMedia: (MediaStreamConstraints, NavigatorUserMediaSuccessCallback, NavigatorUserMediaErrorCallback) => Unit,
    mediaDevices: MediaDevices
  ): NavigatorUserMedia = {
    val __obj = js.Dynamic.literal(getDisplayMedia = js.Any.fromFunction1(getDisplayMedia), getUserMedia = js.Any.fromFunction3(getUserMedia), mediaDevices = mediaDevices)
  
    __obj.asInstanceOf[NavigatorUserMedia]
  }
}

