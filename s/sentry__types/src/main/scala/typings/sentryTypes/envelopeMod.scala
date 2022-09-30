package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.clientreportMod.ClientReport
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.sdkinfoMod.SdkInfo
import typings.sentryTypes.sentryTypesStrings.attachment
import typings.sentryTypes.sentryTypesStrings.client_report
import typings.sentryTypes.sentryTypesStrings.event
import typings.sentryTypes.sentryTypesStrings.session
import typings.sentryTypes.sentryTypesStrings.sessions
import typings.sentryTypes.sentryTypesStrings.transaction
import typings.sentryTypes.sentryTypesStrings.user_report
import typings.sentryTypes.sessionMod.Session
import typings.sentryTypes.sessionMod.SessionAggregates
import typings.sentryTypes.userMod.UserFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object envelopeMod {
  
  type AttachmentItem = BaseEnvelopeItem[AttachmentItemHeaders, String | js.typedarray.Uint8Array]
  
  trait AttachmentItemHeaders extends StObject {
    
    var attachment_type: js.UndefOr[String] = js.undefined
    
    var content_type: js.UndefOr[String] = js.undefined
    
    var filename: String
    
    var length: Double
    
    var `type`: attachment
  }
  object AttachmentItemHeaders {
    
    inline def apply(filename: String, length: Double): AttachmentItemHeaders = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("attachment")
      __obj.asInstanceOf[AttachmentItemHeaders]
    }
    
    extension [Self <: AttachmentItemHeaders](x: Self) {
      
      inline def setAttachment_type(value: String): Self = StObject.set(x, "attachment_type", value.asInstanceOf[js.Any])
      
      inline def setAttachment_typeUndefined: Self = StObject.set(x, "attachment_type", js.undefined)
      
      inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setType(value: attachment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type BaseEnvelope[EnvelopeHeader, Item] = js.Tuple2[
    EnvelopeHeader & BaseEnvelopeHeaders, 
    js.Array[Item & (BaseEnvelopeItem[BaseEnvelopeItemHeaders, Any])]
  ]
  
  trait BaseEnvelopeHeaders
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var dsn: js.UndefOr[String] = js.undefined
    
    var sdk: js.UndefOr[SdkInfo] = js.undefined
  }
  object BaseEnvelopeHeaders {
    
    inline def apply(): BaseEnvelopeHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseEnvelopeHeaders]
    }
    
    extension [Self <: BaseEnvelopeHeaders](x: Self) {
      
      inline def setDsn(value: String): Self = StObject.set(x, "dsn", value.asInstanceOf[js.Any])
      
      inline def setDsnUndefined: Self = StObject.set(x, "dsn", js.undefined)
      
      inline def setSdk(value: SdkInfo): Self = StObject.set(x, "sdk", value.asInstanceOf[js.Any])
      
      inline def setSdkUndefined: Self = StObject.set(x, "sdk", js.undefined)
    }
  }
  
  type BaseEnvelopeItem[ItemHeader, P /* <: Any */] = js.Tuple2[ItemHeader & BaseEnvelopeItemHeaders, P]
  
  trait BaseEnvelopeItemHeaders
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var length: js.UndefOr[Double] = js.undefined
    
    var `type`: EnvelopeItemType
  }
  object BaseEnvelopeItemHeaders {
    
    inline def apply(`type`: EnvelopeItemType): BaseEnvelopeItemHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEnvelopeItemHeaders]
    }
    
    extension [Self <: BaseEnvelopeItemHeaders](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setType(value: EnvelopeItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ClientReportEnvelope = BaseEnvelope[ClientReportEnvelopeHeaders, ClientReportItem]
  
  type ClientReportEnvelopeHeaders = BaseEnvelopeHeaders
  
  type ClientReportItem = BaseEnvelopeItem[ClientReportItemHeaders, ClientReport]
  
  trait ClientReportItemHeaders extends StObject {
    
    var `type`: client_report
  }
  object ClientReportItemHeaders {
    
    inline def apply(): ClientReportItemHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("client_report")
      __obj.asInstanceOf[ClientReportItemHeaders]
    }
    
    extension [Self <: ClientReportItemHeaders](x: Self) {
      
      inline def setType(value: client_report): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DynamicSamplingContext extends StObject {
    
    var environment: js.UndefOr[String] = js.undefined
    
    var public_key: js.UndefOr[String] = js.undefined
    
    var release: js.UndefOr[String] = js.undefined
    
    var sample_rate: js.UndefOr[String] = js.undefined
    
    var trace_id: String
    
    var transaction: js.UndefOr[String] = js.undefined
    
    var user_segment: js.UndefOr[String] = js.undefined
  }
  object DynamicSamplingContext {
    
    inline def apply(trace_id: String): DynamicSamplingContext = {
      val __obj = js.Dynamic.literal(trace_id = trace_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicSamplingContext]
    }
    
    extension [Self <: DynamicSamplingContext](x: Self) {
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
      
      inline def setPublic_keyUndefined: Self = StObject.set(x, "public_key", js.undefined)
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      inline def setSample_rate(value: String): Self = StObject.set(x, "sample_rate", value.asInstanceOf[js.Any])
      
      inline def setSample_rateUndefined: Self = StObject.set(x, "sample_rate", js.undefined)
      
      inline def setTrace_id(value: String): Self = StObject.set(x, "trace_id", value.asInstanceOf[js.Any])
      
      inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
      
      inline def setUser_segment(value: String): Self = StObject.set(x, "user_segment", value.asInstanceOf[js.Any])
      
      inline def setUser_segmentUndefined: Self = StObject.set(x, "user_segment", js.undefined)
    }
  }
  
  type Envelope = EventEnvelope | SessionEnvelope | ClientReportEnvelope
  
  type EnvelopeItem = /* import warning: importer.ImportType#apply Failed type conversion: @sentry/types.@sentry/types/types/envelope.Envelope[1][number] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.sentryTypesStrings.client_report
    - typings.sentryTypes.sentryTypesStrings.user_report
    - typings.sentryTypes.sentryTypesStrings.session
    - typings.sentryTypes.sentryTypesStrings.sessions
    - typings.sentryTypes.sentryTypesStrings.transaction
    - typings.sentryTypes.sentryTypesStrings.attachment
    - typings.sentryTypes.sentryTypesStrings.event
  */
  trait EnvelopeItemType extends StObject
  object EnvelopeItemType {
    
    inline def attachment: typings.sentryTypes.sentryTypesStrings.attachment = "attachment".asInstanceOf[typings.sentryTypes.sentryTypesStrings.attachment]
    
    inline def client_report: typings.sentryTypes.sentryTypesStrings.client_report = "client_report".asInstanceOf[typings.sentryTypes.sentryTypesStrings.client_report]
    
    inline def event: typings.sentryTypes.sentryTypesStrings.event = "event".asInstanceOf[typings.sentryTypes.sentryTypesStrings.event]
    
    inline def session: typings.sentryTypes.sentryTypesStrings.session = "session".asInstanceOf[typings.sentryTypes.sentryTypesStrings.session]
    
    inline def sessions: typings.sentryTypes.sentryTypesStrings.sessions = "sessions".asInstanceOf[typings.sentryTypes.sentryTypesStrings.sessions]
    
    inline def transaction: typings.sentryTypes.sentryTypesStrings.transaction = "transaction".asInstanceOf[typings.sentryTypes.sentryTypesStrings.transaction]
    
    inline def user_report: typings.sentryTypes.sentryTypesStrings.user_report = "user_report".asInstanceOf[typings.sentryTypes.sentryTypesStrings.user_report]
  }
  
  type EventEnvelope = BaseEnvelope[EventEnvelopeHeaders, EventItem | AttachmentItem | UserFeedbackItem]
  
  trait EventEnvelopeHeaders extends StObject {
    
    var event_id: String
    
    var sent_at: String
    
    var trace: js.UndefOr[DynamicSamplingContext] = js.undefined
  }
  object EventEnvelopeHeaders {
    
    inline def apply(event_id: String, sent_at: String): EventEnvelopeHeaders = {
      val __obj = js.Dynamic.literal(event_id = event_id.asInstanceOf[js.Any], sent_at = sent_at.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventEnvelopeHeaders]
    }
    
    extension [Self <: EventEnvelopeHeaders](x: Self) {
      
      inline def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
      
      inline def setSent_at(value: String): Self = StObject.set(x, "sent_at", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: DynamicSamplingContext): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
    }
  }
  
  type EventItem = BaseEnvelopeItem[EventItemHeaders, Event]
  
  trait EventItemHeaders extends StObject {
    
    var `type`: event | transaction
  }
  object EventItemHeaders {
    
    inline def apply(`type`: event | transaction): EventItemHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventItemHeaders]
    }
    
    extension [Self <: EventItemHeaders](x: Self) {
      
      inline def setType(value: event | transaction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SessionAggregatesItemHeaders extends StObject {
    
    var `type`: sessions
  }
  object SessionAggregatesItemHeaders {
    
    inline def apply(): SessionAggregatesItemHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("sessions")
      __obj.asInstanceOf[SessionAggregatesItemHeaders]
    }
    
    extension [Self <: SessionAggregatesItemHeaders](x: Self) {
      
      inline def setType(value: sessions): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type SessionEnvelope = BaseEnvelope[SessionEnvelopeHeaders, SessionItem]
  
  trait SessionEnvelopeHeaders extends StObject {
    
    var sent_at: String
  }
  object SessionEnvelopeHeaders {
    
    inline def apply(sent_at: String): SessionEnvelopeHeaders = {
      val __obj = js.Dynamic.literal(sent_at = sent_at.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionEnvelopeHeaders]
    }
    
    extension [Self <: SessionEnvelopeHeaders](x: Self) {
      
      inline def setSent_at(value: String): Self = StObject.set(x, "sent_at", value.asInstanceOf[js.Any])
    }
  }
  
  type SessionItem = BaseEnvelopeItem[SessionAggregatesItemHeaders | SessionItemHeaders, Session | SessionAggregates]
  
  trait SessionItemHeaders extends StObject {
    
    var `type`: session
  }
  object SessionItemHeaders {
    
    inline def apply(): SessionItemHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("session")
      __obj.asInstanceOf[SessionItemHeaders]
    }
    
    extension [Self <: SessionItemHeaders](x: Self) {
      
      inline def setType(value: session): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type UserFeedbackItem = BaseEnvelopeItem[UserFeedbackItemHeaders, UserFeedback]
  
  trait UserFeedbackItemHeaders extends StObject {
    
    var `type`: user_report
  }
  object UserFeedbackItemHeaders {
    
    inline def apply(): UserFeedbackItemHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("user_report")
      __obj.asInstanceOf[UserFeedbackItemHeaders]
    }
    
    extension [Self <: UserFeedbackItemHeaders](x: Self) {
      
      inline def setType(value: user_report): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
