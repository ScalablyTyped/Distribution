package typings.sentryReplay

import typings.sentryReplay.typesTypesMod.EventBufferType
import typings.sentryReplay.typesTypesMod.NetworkMetaWarning
import typings.sentryReplay.typesTypesMod.Sampled
import typings.sentryReplay.typesUtilCreateBreadcrumbMod.RequiredProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sentryReplayStrings {
  
  @js.native
  sealed trait INVALID_JSON
    extends StObject
       with NetworkMetaWarning
  inline def INVALID_JSON: INVALID_JSON = "INVALID_JSON".asInstanceOf[INVALID_JSON]
  
  @js.native
  sealed trait JSON_TRUNCATED
    extends StObject
       with NetworkMetaWarning
  inline def JSON_TRUNCATED: JSON_TRUNCATED = "JSON_TRUNCATED".asInstanceOf[JSON_TRUNCATED]
  
  @js.native
  sealed trait TEXT_TRUNCATED
    extends StObject
       with NetworkMetaWarning
  inline def TEXT_TRUNCATED: TEXT_TRUNCATED = "TEXT_TRUNCATED".asInstanceOf[TEXT_TRUNCATED]
  
  @js.native
  sealed trait URL_SKIPPED
    extends StObject
       with NetworkMetaWarning
  inline def URL_SKIPPED: URL_SKIPPED = "URL_SKIPPED".asInstanceOf[URL_SKIPPED]
  
  @js.native
  sealed trait addEvent extends StObject
  inline def addEvent: addEvent = "addEvent".asInstanceOf[addEvent]
  
  @js.native
  sealed trait buffer
    extends StObject
       with Sampled
  inline def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait category
    extends StObject
       with RequiredProperties
  inline def category: category = "category".asInstanceOf[category]
  
  @js.native
  sealed trait clear extends StObject
  inline def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait finish extends StObject
  inline def finish: finish = "finish".asInstanceOf[finish]
  
  @js.native
  sealed trait finishTransaction extends StObject
  inline def finishTransaction: finishTransaction = "finishTransaction".asInstanceOf[finishTransaction]
  
  @js.native
  sealed trait message
    extends StObject
       with RequiredProperties
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait `new` extends StObject
  inline def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait saved extends StObject
  inline def saved: saved = "saved".asInstanceOf[saved]
  
  @js.native
  sealed trait session
    extends StObject
       with Sampled
  inline def session: session = "session".asInstanceOf[session]
  
  @js.native
  sealed trait startTransaction extends StObject
  inline def startTransaction: startTransaction = "startTransaction".asInstanceOf[startTransaction]
  
  @js.native
  sealed trait sync
    extends StObject
       with EventBufferType
  inline def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait worker
    extends StObject
       with EventBufferType
  inline def worker: worker = "worker".asInstanceOf[worker]
}
