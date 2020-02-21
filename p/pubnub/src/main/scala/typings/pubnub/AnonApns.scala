package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApns extends js.Object {
  var apns: js.Object
  var fcm: js.Object
  var mpns: js.Object
}

object AnonApns {
  @scala.inline
  def apply(apns: js.Object, fcm: js.Object, mpns: js.Object): AnonApns = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], fcm = fcm.asInstanceOf[js.Any], mpns = mpns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApns]
  }
}

