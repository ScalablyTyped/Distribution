package typings.sentryReplay

import typings.sentryReplay.typesTypesReplayMod.AddEventResult
import typings.sentryReplay.typesTypesReplayMod.ReplayContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilAddMemoryEntryMod {
  
  @JSImport("@sentry/replay/types/util/addMemoryEntry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addMemoryEntry(replay: ReplayContainer): js.Promise[js.Array[AddEventResult | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("addMemoryEntry")(replay.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[AddEventResult | Null]]]
}
