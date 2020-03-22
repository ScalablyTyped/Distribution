package typings.rcNotification

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcNotificationComponents extends rcNotificationProps {
  @scala.inline
  def Lib: ComponentType[LibProps] = js.constructorOf[typings.rcNotification.mod.default].asInstanceOf[typings.react.mod.ComponentType[LibProps]]
  @scala.inline
  def Notice: ComponentType[NoticeProps] = js.constructorOf[typings.rcNotification.noticeMod.default].asInstanceOf[typings.react.mod.ComponentType[NoticeProps]]
  @scala.inline
  def Notification: ComponentType[NotificationProps] = js.constructorOf[typings.rcNotification.notificationMod.default].asInstanceOf[typings.react.mod.ComponentType[NotificationProps]]
}

