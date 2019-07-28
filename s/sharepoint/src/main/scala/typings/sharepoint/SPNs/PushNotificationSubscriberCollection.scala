package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotificationSubscriberCollection extends ClientObjectCollection[PushNotificationSubscriber] {
  def getByStoreId(id: String): PushNotificationSubscriber = js.native
  def get_item(index: Double): PushNotificationSubscriber = js.native
  def itemAt(index: Double): PushNotificationSubscriber = js.native
}

