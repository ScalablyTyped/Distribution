package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorUserMedia extends js.Object {
  val mediaDevices: MediaDevices
  def getDisplayMedia(constraints: MediaStreamConstraints): Promise[MediaStream]
  def getUserMedia(
    constraints: MediaStreamConstraints,
    successCallback: NavigatorUserMediaSuccessCallback,
    errorCallback: NavigatorUserMediaErrorCallback
  ): scala.Unit
}

