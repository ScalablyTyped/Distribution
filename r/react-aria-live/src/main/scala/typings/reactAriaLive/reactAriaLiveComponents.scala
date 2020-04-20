package typings.reactAriaLive

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactAriaLiveComponents extends reactAriaLiveProps {
  @scala.inline
  def LiveAnnouncer: ComponentType[js.Object] = js.constructorOf[typings.reactAriaLive.mod.LiveAnnouncer].asInstanceOf[ComponentType[js.Object]]
  @scala.inline
  def LiveMessage: ComponentType[LiveMessageProps] = typings.reactAriaLive.mod.LiveMessage.asInstanceOf[ComponentType[LiveMessageProps]]
  @scala.inline
  def LiveMessenger: ComponentType[LiveMessengerProps] = typings.reactAriaLive.mod.LiveMessenger.asInstanceOf[ComponentType[LiveMessengerProps]]
}

