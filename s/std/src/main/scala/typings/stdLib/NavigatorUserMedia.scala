package typings
package stdLib

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
  ): scala.Unit
}

