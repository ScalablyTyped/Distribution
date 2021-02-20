package typings.pusherChatkitClient

import typings.pusherChatkitClient.userMod.PusherUserPresence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pusherChatkitClientStrings {
  
  @js.native
  sealed trait attachment extends StObject
  @scala.inline
  def attachment: attachment = "attachment".asInstanceOf[attachment]
  
  @js.native
  sealed trait `inline` extends StObject
  @scala.inline
  def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait newer extends StObject
  @scala.inline
  def newer: newer = "newer".asInstanceOf[newer]
  
  @js.native
  sealed trait offline extends PusherUserPresence
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait older extends StObject
  @scala.inline
  def older: older = "older".asInstanceOf[older]
  
  @js.native
  sealed trait online extends PusherUserPresence
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  
  @js.native
  sealed trait unknown extends PusherUserPresence
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait url extends StObject
  @scala.inline
  def url: url = "url".asInstanceOf[url]
}
