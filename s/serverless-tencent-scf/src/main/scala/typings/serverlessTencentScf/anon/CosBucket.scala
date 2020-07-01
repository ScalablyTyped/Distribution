package typings.serverlessTencentScf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CosBucket extends js.Object {
  var cosBucket: Appid
  var cosNotificationId: String
  var cosObject: Key
  var cosSchemaVersion: String
}

object CosBucket {
  @scala.inline
  def apply(cosBucket: Appid, cosNotificationId: String, cosObject: Key, cosSchemaVersion: String): CosBucket = {
    val __obj = js.Dynamic.literal(cosBucket = cosBucket.asInstanceOf[js.Any], cosNotificationId = cosNotificationId.asInstanceOf[js.Any], cosObject = cosObject.asInstanceOf[js.Any], cosSchemaVersion = cosSchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CosBucket]
  }
}

