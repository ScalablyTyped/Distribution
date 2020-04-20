package typings.rcNotification

import typings.rcNotification.mod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcNotificationComponents extends rcNotificationProps {
  @scala.inline
  def Lib: ComponentType[LibProps] = js.constructorOf[default].asInstanceOf[ComponentType[LibProps]]
  @scala.inline
  def Notice: ComponentType[NoticeProps] = js.constructorOf[typings.rcNotification.noticeMod.default].asInstanceOf[ComponentType[NoticeProps]]
  @scala.inline
  def Notification: ComponentType[NotificationProps] = js.constructorOf[typings.rcNotification.notificationMod.default].asInstanceOf[ComponentType[NotificationProps]]
}

