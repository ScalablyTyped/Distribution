package typings.atPusherChatkitDashClient

import typings.atPusherChatkitDashClient.userMod.PusherUserPresence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atPusherChatkitDashClientStrings {
  @js.native
  sealed trait attachment extends js.Object
  
  @js.native
  sealed trait `inline` extends js.Object
  
  @js.native
  sealed trait newer extends js.Object
  
  @js.native
  sealed trait offline extends PusherUserPresence
  
  @js.native
  sealed trait older extends js.Object
  
  @js.native
  sealed trait online extends PusherUserPresence
  
  @js.native
  sealed trait unknown extends PusherUserPresence
  
  @js.native
  sealed trait url extends js.Object
  
  @scala.inline
  def attachment: attachment = "attachment".asInstanceOf[attachment]
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  @scala.inline
  def newer: newer = "newer".asInstanceOf[newer]
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  @scala.inline
  def older: older = "older".asInstanceOf[older]
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
}

