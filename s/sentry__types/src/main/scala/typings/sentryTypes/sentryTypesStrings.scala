package typings.sentryTypes

import typings.sentryTypes.dsnMod.DsnProtocol
import typings.sentryTypes.requestMod.SentryRequestType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sentryTypesStrings {
  
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  
  @scala.inline
  def session: session = "session".asInstanceOf[session]
  
  @scala.inline
  def transaction: transaction = "transaction".asInstanceOf[transaction]
  
  @js.native
  sealed trait event extends SentryRequestType
  
  @js.native
  sealed trait http extends DsnProtocol
  
  @js.native
  sealed trait https extends DsnProtocol
  
  @js.native
  sealed trait session extends SentryRequestType
  
  @js.native
  sealed trait transaction extends SentryRequestType
}
