package typings.sentryReplay.typesTypesReplayMod

import typings.sentryReplay.typesTypesReplayFrameMod.ReplayFrameEvent
import typings.sentryReplay.typesTypesRrwebMod.recordOptions
import typings.std.Blob
import typings.std.BufferSource
import typings.std.FormData
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AddEventResult = Unit

type AddUpdateCallback = js.Function0[Boolean | Unit]

type BeforeAddRecordingEvent = js.Function1[/* event */ ReplayFrameEvent, js.UndefOr[ReplayFrameEvent | Null]]

type RecordingOptions = recordOptions

type RequestBody = Null | Blob | BufferSource | FormData | URLSearchParams | String
