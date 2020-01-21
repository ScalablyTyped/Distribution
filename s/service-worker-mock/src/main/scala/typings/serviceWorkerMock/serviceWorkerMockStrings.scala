package typings.serviceWorkerMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object serviceWorkerMockStrings {
  @js.native
  sealed trait fetch extends js.Object
  
  @js.native
  sealed trait message extends js.Object
  
  @js.native
  sealed trait notificationclick extends js.Object
  
  @js.native
  sealed trait notificationclose extends js.Object
  
  @js.native
  sealed trait push extends js.Object
  
  @scala.inline
  def fetch: fetch = "fetch".asInstanceOf[fetch]
  @scala.inline
  def message: message = "message".asInstanceOf[message]
  @scala.inline
  def notificationclick: notificationclick = "notificationclick".asInstanceOf[notificationclick]
  @scala.inline
  def notificationclose: notificationclose = "notificationclose".asInstanceOf[notificationclose]
  @scala.inline
  def push: push = "push".asInstanceOf[push]
}

