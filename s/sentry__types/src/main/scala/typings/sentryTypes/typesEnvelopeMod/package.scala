package typings.sentryTypes.typesEnvelopeMod

import typings.sentryTypes.typesCheckinMod.SerializedCheckIn
import typings.sentryTypes.typesClientreportMod.ClientReport
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesReplayMod.ReplayEvent
import typings.sentryTypes.typesReplayMod.ReplayRecordingData
import typings.sentryTypes.typesSessionMod.SerializedSession
import typings.sentryTypes.typesSessionMod.Session
import typings.sentryTypes.typesSessionMod.SessionAggregates
import typings.sentryTypes.typesUserMod.UserFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AttachmentItem = BaseEnvelopeItem[AttachmentItemHeaders, String | js.typedarray.Uint8Array]

type BaseEnvelope[EnvelopeHeader, Item] = js.Tuple2[
EnvelopeHeader & BaseEnvelopeHeaders, 
js.Array[Item & (BaseEnvelopeItem[BaseEnvelopeItemHeaders, Any])]]

type BaseEnvelopeItem[ItemHeader, P] = js.Tuple2[ItemHeader & BaseEnvelopeItemHeaders, P]

type CheckInEnvelopeHeaders = BaseEnvelopeHeaders

type CheckInEvelope = BaseEnvelope[CheckInEnvelopeHeaders, CheckInItem]

type CheckInItem = BaseEnvelopeItem[CheckInItemHeaders, SerializedCheckIn]

type ClientReportEnvelope = BaseEnvelope[ClientReportEnvelopeHeaders, ClientReportItem]

type ClientReportEnvelopeHeaders = BaseEnvelopeHeaders

type ClientReportItem = BaseEnvelopeItem[ClientReportItemHeaders, ClientReport]

type Envelope = EventEnvelope | SessionEnvelope | ClientReportEnvelope | ReplayEnvelope | CheckInEvelope

type EnvelopeItem = /* import warning: importer.ImportType#apply Failed type conversion: @sentry/types.@sentry/types/types/envelope.Envelope[1][number] */ js.Any

type EventEnvelope = BaseEnvelope[EventEnvelopeHeaders, EventItem | AttachmentItem | UserFeedbackItem]

type EventItem = BaseEnvelopeItem[EventItemHeaders, Event]

type ReplayEnvelope = js.Tuple2[ReplayEnvelopeHeaders, js.Tuple2[ReplayEventItem, ReplayRecordingItem]]

type ReplayEnvelopeHeaders = BaseEnvelopeHeaders

type ReplayEventItem = BaseEnvelopeItem[ReplayEventItemHeaders, ReplayEvent]

type ReplayRecordingItem = BaseEnvelopeItem[ReplayRecordingItemHeaders, ReplayRecordingData]

type SessionEnvelope = BaseEnvelope[SessionEnvelopeHeaders, SessionItem]

type SessionItem = BaseEnvelopeItem[
SessionAggregatesItemHeaders | SessionItemHeaders, 
SerializedSession | Session | SessionAggregates]

type UserFeedbackItem = BaseEnvelopeItem[UserFeedbackItemHeaders, UserFeedback]
