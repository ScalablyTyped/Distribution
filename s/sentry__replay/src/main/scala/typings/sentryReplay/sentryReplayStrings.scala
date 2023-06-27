package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayMod.EventBufferType
import typings.sentryReplay.typesTypesReplayMod.Sampled
import typings.sentryReplay.typesTypesRequestMod.NetworkMetaWarning
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
  sealed trait breadcrumb extends StObject
  inline def breadcrumb: breadcrumb = "breadcrumb".asInstanceOf[breadcrumb]
  
  @js.native
  sealed trait buffer
    extends StObject
       with Sampled
  inline def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait clear extends StObject
  inline def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait console extends StObject
  inline def console: console = "console".asInstanceOf[console]
  
  @js.native
  sealed trait finish extends StObject
  inline def finish: finish = "finish".asInstanceOf[finish]
  
  @js.native
  sealed trait finishTransaction extends StObject
  inline def finishTransaction: finishTransaction = "finishTransaction".asInstanceOf[finishTransaction]
  
  @js.native
  sealed trait `largest-contentful-paint` extends StObject
  inline def `largest-contentful-paint`: `largest-contentful-paint` = "largest-contentful-paint".asInstanceOf[`largest-contentful-paint`]
  
  @js.native
  sealed trait memory extends StObject
  inline def memory: memory = "memory".asInstanceOf[memory]
  
  @js.native
  sealed trait navigationDotback_forward extends StObject
  inline def navigationDotback_forward: navigationDotback_forward = "navigation.back_forward".asInstanceOf[navigationDotback_forward]
  
  @js.native
  sealed trait navigationDotnavigate extends StObject
  inline def navigationDotnavigate: navigationDotnavigate = "navigation.navigate".asInstanceOf[navigationDotnavigate]
  
  @js.native
  sealed trait navigationDotpush extends StObject
  inline def navigationDotpush: navigationDotpush = "navigation.push".asInstanceOf[navigationDotpush]
  
  @js.native
  sealed trait navigationDotreload extends StObject
  inline def navigationDotreload: navigationDotreload = "navigation.reload".asInstanceOf[navigationDotreload]
  
  @js.native
  sealed trait `new` extends StObject
  inline def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait options extends StObject
  inline def options: options = "options".asInstanceOf[options]
  
  @js.native
  sealed trait paint extends StObject
  inline def paint: paint = "paint".asInstanceOf[paint]
  
  @js.native
  sealed trait performanceSpan extends StObject
  inline def performanceSpan: performanceSpan = "performanceSpan".asInstanceOf[performanceSpan]
  
  @js.native
  sealed trait replayDotmutations extends StObject
  inline def replayDotmutations: replayDotmutations = "replay.mutations".asInstanceOf[replayDotmutations]
  
  @js.native
  sealed trait resourceDotcss extends StObject
  inline def resourceDotcss: resourceDotcss = "resource.css".asInstanceOf[resourceDotcss]
  
  @js.native
  sealed trait resourceDotfetch extends StObject
  inline def resourceDotfetch: resourceDotfetch = "resource.fetch".asInstanceOf[resourceDotfetch]
  
  @js.native
  sealed trait resourceDotiframe extends StObject
  inline def resourceDotiframe: resourceDotiframe = "resource.iframe".asInstanceOf[resourceDotiframe]
  
  @js.native
  sealed trait resourceDotimg extends StObject
  inline def resourceDotimg: resourceDotimg = "resource.img".asInstanceOf[resourceDotimg]
  
  @js.native
  sealed trait resourceDotlink extends StObject
  inline def resourceDotlink: resourceDotlink = "resource.link".asInstanceOf[resourceDotlink]
  
  @js.native
  sealed trait resourceDotother extends StObject
  inline def resourceDotother: resourceDotother = "resource.other".asInstanceOf[resourceDotother]
  
  @js.native
  sealed trait resourceDotscript extends StObject
  inline def resourceDotscript: resourceDotscript = "resource.script".asInstanceOf[resourceDotscript]
  
  @js.native
  sealed trait resourceDotxhr extends StObject
  inline def resourceDotxhr: resourceDotxhr = "resource.xhr".asInstanceOf[resourceDotxhr]
  
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
  sealed trait timestamp extends StObject
  inline def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  
  @js.native
  sealed trait `type` extends StObject
  inline def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait uiDotblur extends StObject
  inline def uiDotblur: uiDotblur = "ui.blur".asInstanceOf[uiDotblur]
  
  @js.native
  sealed trait uiDotclick extends StObject
  inline def uiDotclick: uiDotclick = "ui.click".asInstanceOf[uiDotclick]
  
  @js.native
  sealed trait uiDotfocus extends StObject
  inline def uiDotfocus: uiDotfocus = "ui.focus".asInstanceOf[uiDotfocus]
  
  @js.native
  sealed trait uiDotinput extends StObject
  inline def uiDotinput: uiDotinput = "ui.input".asInstanceOf[uiDotinput]
  
  @js.native
  sealed trait uiDotkeyDown extends StObject
  inline def uiDotkeyDown: uiDotkeyDown = "ui.keyDown".asInstanceOf[uiDotkeyDown]
  
  @js.native
  sealed trait uiDotmultiClick extends StObject
  inline def uiDotmultiClick: uiDotmultiClick = "ui.multiClick".asInstanceOf[uiDotmultiClick]
  
  @js.native
  sealed trait uiDotslowClickDetected extends StObject
  inline def uiDotslowClickDetected: uiDotslowClickDetected = "ui.slowClickDetected".asInstanceOf[uiDotslowClickDetected]
  
  @js.native
  sealed trait worker
    extends StObject
       with EventBufferType
  inline def worker: worker = "worker".asInstanceOf[worker]
}
