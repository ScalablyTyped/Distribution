package typings.sentryTypes

import typings.sentryTypes.dsnMod.DsnProtocol
import typings.sentryTypes.requestMod.SentryRequestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sentryTypesStrings {
  
  @js.native
  sealed trait event
    extends StObject
       with SentryRequestType
  inline def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait http
    extends StObject
       with DsnProtocol
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https
    extends StObject
       with DsnProtocol
  inline def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait session
    extends StObject
       with SentryRequestType
  inline def session: session = "session".asInstanceOf[session]
  
  @js.native
  sealed trait transaction
    extends StObject
       with SentryRequestType
  inline def transaction: transaction = "transaction".asInstanceOf[transaction]
}
