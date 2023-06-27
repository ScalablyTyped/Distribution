package typings.sentryUtils

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.typesAttachmentMod.Attachment
import typings.sentryTypes.typesClientreportMod.Outcome
import typings.sentryTypes.typesDatacategoryMod.DataCategory
import typings.sentryTypes.typesDsnMod.DsnComponents
import typings.sentryTypes.typesDsnMod.DsnLike
import typings.sentryTypes.typesEnvelopeMod.AttachmentItem
import typings.sentryTypes.typesEnvelopeMod.ClientReportEnvelope
import typings.sentryTypes.typesEnvelopeMod.Envelope
import typings.sentryTypes.typesEnvelopeMod.EnvelopeItemType
import typings.sentryTypes.typesEnvelopeMod.EventEnvelopeHeaders
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesIntegrationMod.Integration
import typings.sentryTypes.typesMiscMod.ExtractedNodeRequestData
import typings.sentryTypes.typesMiscMod.Primitive
import typings.sentryTypes.typesPolymorphicsMod.PolymorphicRequest
import typings.sentryTypes.typesSdkinfoMod.SdkInfo
import typings.sentryTypes.typesSdkmetadataMod.SdkMetadata
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import typings.sentryTypes.typesStackframeMod.StackFrame
import typings.sentryTypes.typesStacktraceMod.StackLineParser
import typings.sentryTypes.typesStacktraceMod.StackParser
import typings.sentryTypes.typesTextencoderMod.TextEncoderInternal
import typings.sentryTypes.typesTransactionMod.TraceparentData
import typings.sentryTypes.typesTransactionMod.Transaction
import typings.sentryTypes.typesTransactionMod.TransactionSource
import typings.sentryTypes.typesTransportMod.TransportMakeRequestResponse
import typings.sentryTypes.typesWrappedfunctionMod.WrappedFunction
import typings.sentryUtils.anon.CustomRoute
import typings.sentryUtils.anon.Deps
import typings.sentryUtils.anon.DictownProps
import typings.sentryUtils.anon.KeyAttrs
import typings.sentryUtils.anon.Message
import typings.sentryUtils.anon.Method
import typings.sentryUtils.anon.PartialDynamicSamplingCon
import typings.sentryUtils.anon.PartialMechanism
import typings.sentryUtils.sentryUtilsStrings.assert
import typings.sentryUtils.sentryUtilsStrings.debug
import typings.sentryUtils.sentryUtilsStrings.error
import typings.sentryUtils.sentryUtilsStrings.info
import typings.sentryUtils.sentryUtilsStrings.log
import typings.sentryUtils.sentryUtilsStrings.trace
import typings.sentryUtils.sentryUtilsStrings.warn
import typings.sentryUtils.typesEnvMod.SdkSource
import typings.sentryUtils.typesEnvelopeMod.TextDecoderInternal
import typings.sentryUtils.typesInstrumentMod.InstrumentHandlerCallback
import typings.sentryUtils.typesInstrumentMod.InstrumentHandlerType
import typings.sentryUtils.typesLoggerMod.ConsoleLevel
import typings.sentryUtils.typesLoggerMod.Logger_
import typings.sentryUtils.typesMemoMod.MemoFunc
import typings.sentryUtils.typesMiscMod.SemVer
import typings.sentryUtils.typesNodeStackTraceMod.GetModuleFn
import typings.sentryUtils.typesNormalizeMod.ObjOrArray
import typings.sentryUtils.typesPromisebufferMod.PromiseBuffer
import typings.sentryUtils.typesRatelimitMod.RateLimits
import typings.sentryUtils.typesRequestdataMod.AddRequestDataToEventOptions
import typings.sentryUtils.typesRequestdataMod.InjectedNodeDeps
import typings.sentryUtils.typesUrlMod.PartialURL
import typings.sentryUtils.typesUserIntegrationsMod.ForcedIntegrationOptions
import typings.sentryUtils.typesUserIntegrationsMod.UserIntegrations
import typings.sentryUtils.typesWorldwideMod.InternalGlobal
import typings.std.ObjectConstructor
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/utils", "BAGGAGE_HEADER_NAME")
  @js.native
  val BAGGAGE_HEADER_NAME: /* "baggage" */ String = js.native
  
  @JSImport("@sentry/utils", "CONSOLE_LEVELS")
  @js.native
  val CONSOLE_LEVELS: js.Tuple7[debug, info, warn, error, log, assert, trace] = js.native
  
  @JSImport("@sentry/utils", "DEFAULT_RETRY_AFTER")
  @js.native
  val DEFAULT_RETRY_AFTER: Double = js.native
  
  @JSImport("@sentry/utils", "GLOBAL_OBJ")
  @js.native
  val GLOBAL_OBJ: InternalGlobal = js.native
  
  @JSImport("@sentry/utils", "MAX_BAGGAGE_STRING_LENGTH")
  @js.native
  val MAX_BAGGAGE_STRING_LENGTH: /* 8192 */ Double = js.native
  
  @JSImport("@sentry/utils", "SENTRY_BAGGAGE_KEY_PREFIX")
  @js.native
  val SENTRY_BAGGAGE_KEY_PREFIX: /* "sentry-" */ String = js.native
  
  @JSImport("@sentry/utils", "SENTRY_BAGGAGE_KEY_PREFIX_REGEX")
  @js.native
  val SENTRY_BAGGAGE_KEY_PREFIX_REGEX: js.RegExp = js.native
  
  @JSImport("@sentry/utils", "SENTRY_XHR_DATA_KEY")
  @js.native
  val SENTRY_XHR_DATA_KEY: /* "__sentry_xhr_v2__" */ String = js.native
  
  @JSImport("@sentry/utils", "SentryError")
  @js.native
  open class SentryError protected ()
    extends typings.sentryUtils.typesErrorMod.SentryError {
    def this(message: String) = this()
    def this(message: String, logLevel: ConsoleLevel) = this()
  }
  
  /**
    * Thenable class that behaves like a Promise and follows it's interface
    * but is not async internally
    */
  @JSImport("@sentry/utils", "SyncPromise")
  @js.native
  open class SyncPromise[T] protected ()
    extends typings.sentryUtils.typesSyncpromiseMod.SyncPromise[T] {
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | PromiseLike[T] | Null], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ]) = this()
  }
  
  @JSImport("@sentry/utils", "TRACEPARENT_REGEXP")
  @js.native
  val TRACEPARENT_REGEXP: js.RegExp = js.native
  
  inline def addContextToFrame(lines: js.Array[String], frame: StackFrame): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addContextToFrame")(lines.asInstanceOf[js.Any], frame.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addContextToFrame(lines: js.Array[String], frame: StackFrame, linesOfContext: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addContextToFrame")(lines.asInstanceOf[js.Any], frame.asInstanceOf[js.Any], linesOfContext.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addExceptionMechanism(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionMechanism")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addExceptionMechanism(event: Event, newMechanism: PartialMechanism): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionMechanism")(event.asInstanceOf[js.Any], newMechanism.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addExceptionTypeValue(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addExceptionTypeValue(event: Event, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addExceptionTypeValue(event: Event, value: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addExceptionTypeValue(event: Event, value: Unit, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExceptionTypeValue")(event.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addInstrumentationHandler(`type`: InstrumentHandlerType, callback: InstrumentHandlerCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addInstrumentationHandler")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addItemToEnvelope_1[E /* <: Envelope */](
    envelope: E,
    newItem: /* import warning: importer.ImportType#apply Failed type conversion: E[1][number] */ js.Any
  ): E = (^.asInstanceOf[js.Dynamic].applyDynamic("addItemToEnvelope")(envelope.asInstanceOf[js.Any], newItem.asInstanceOf[js.Any])).asInstanceOf[E]
  
  inline def addNonEnumerableProperty(obj: StringDictionary[Any], name: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addNonEnumerableProperty")(obj.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addOrUpdateIntegration[T /* <: UserIntegrations */](defaultIntegrationInstance: Integration, userIntegrations: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addOrUpdateIntegration")(defaultIntegrationInstance.asInstanceOf[js.Any], userIntegrations.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def addOrUpdateIntegration[T /* <: UserIntegrations */](
    defaultIntegrationInstance: Integration,
    userIntegrations: T,
    forcedOptions: ForcedIntegrationOptions
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addOrUpdateIntegration")(defaultIntegrationInstance.asInstanceOf[js.Any], userIntegrations.asInstanceOf[js.Any], forcedOptions.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def addRequestDataToEvent(event: Event, req: PolymorphicRequest): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToEvent")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Event]
  inline def addRequestDataToEvent(event: Event, req: PolymorphicRequest, options: AddRequestDataToEventOptions): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToEvent")(event.asInstanceOf[js.Any], req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Event]
  
  inline def addRequestDataToTransaction(transaction: Unit, req: PolymorphicRequest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToTransaction")(transaction.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addRequestDataToTransaction(transaction: Unit, req: PolymorphicRequest, deps: InjectedNodeDeps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToTransaction")(transaction.asInstanceOf[js.Any], req.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addRequestDataToTransaction(transaction: Transaction, req: PolymorphicRequest): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToTransaction")(transaction.asInstanceOf[js.Any], req.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addRequestDataToTransaction(transaction: Transaction, req: PolymorphicRequest, deps: InjectedNodeDeps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestDataToTransaction")(transaction.asInstanceOf[js.Any], req.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def arrayify[T](maybeArray: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(maybeArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def arrayify[T](maybeArray: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(maybeArray.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def baggageHeaderToDynamicSamplingContext(): js.UndefOr[PartialDynamicSamplingCon] = ^.asInstanceOf[js.Dynamic].applyDynamic("baggageHeaderToDynamicSamplingContext")().asInstanceOf[js.UndefOr[PartialDynamicSamplingCon]]
  inline def baggageHeaderToDynamicSamplingContext(baggageHeader: String): js.UndefOr[PartialDynamicSamplingCon] = ^.asInstanceOf[js.Dynamic].applyDynamic("baggageHeaderToDynamicSamplingContext")(baggageHeader.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PartialDynamicSamplingCon]]
  inline def baggageHeaderToDynamicSamplingContext(baggageHeader: js.Array[String]): js.UndefOr[PartialDynamicSamplingCon] = ^.asInstanceOf[js.Dynamic].applyDynamic("baggageHeaderToDynamicSamplingContext")(baggageHeader.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PartialDynamicSamplingCon]]
  inline def baggageHeaderToDynamicSamplingContext(baggageHeader: Boolean): js.UndefOr[PartialDynamicSamplingCon] = ^.asInstanceOf[js.Dynamic].applyDynamic("baggageHeaderToDynamicSamplingContext")(baggageHeader.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PartialDynamicSamplingCon]]
  inline def baggageHeaderToDynamicSamplingContext(baggageHeader: Double): js.UndefOr[PartialDynamicSamplingCon] = ^.asInstanceOf[js.Dynamic].applyDynamic("baggageHeaderToDynamicSamplingContext")(baggageHeader.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PartialDynamicSamplingCon]]
  
  inline def basename(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def basename(path: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(path.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@sentry/utils", "browserPerformanceTimeOrigin")
  @js.native
  val browserPerformanceTimeOrigin: js.UndefOr[Double] = js.native
  
  @JSImport("@sentry/utils", "_browserPerformanceTimeOriginMode")
  @js.native
  def browserPerformanceTimeOriginMode: String = js.native
  
  inline def browserPerformanceTimeOriginMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_browserPerformanceTimeOriginMode")(x.asInstanceOf[js.Any])
  
  inline def checkOrSetAlreadyCaught(exception: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkOrSetAlreadyCaught")(exception.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def consoleSandbox[T](callback: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("consoleSandbox")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def convertToPlainObject[V](value: V): DictownProps | Message | V = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[DictownProps | Message | V]
  
  inline def createAttachmentEnvelopeItem(attachment: Attachment): AttachmentItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createAttachmentEnvelopeItem")(attachment.asInstanceOf[js.Any]).asInstanceOf[AttachmentItem]
  inline def createAttachmentEnvelopeItem(attachment: Attachment, textEncoder: TextEncoderInternal): AttachmentItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createAttachmentEnvelopeItem")(attachment.asInstanceOf[js.Any], textEncoder.asInstanceOf[js.Any])).asInstanceOf[AttachmentItem]
  
  inline def createClientReportEnvelope(discarded_events: js.Array[Outcome]): ClientReportEnvelope = ^.asInstanceOf[js.Dynamic].applyDynamic("createClientReportEnvelope")(discarded_events.asInstanceOf[js.Any]).asInstanceOf[ClientReportEnvelope]
  inline def createClientReportEnvelope(discarded_events: js.Array[Outcome], dsn: String): ClientReportEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientReportEnvelope")(discarded_events.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[ClientReportEnvelope]
  inline def createClientReportEnvelope(discarded_events: js.Array[Outcome], dsn: String, timestamp: Double): ClientReportEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientReportEnvelope")(discarded_events.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[ClientReportEnvelope]
  inline def createClientReportEnvelope(discarded_events: js.Array[Outcome], dsn: Unit, timestamp: Double): ClientReportEnvelope = (^.asInstanceOf[js.Dynamic].applyDynamic("createClientReportEnvelope")(discarded_events.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[ClientReportEnvelope]
  
  inline def createEnvelope[E /* <: Envelope */](
    headers: /* import warning: importer.ImportType#apply Failed type conversion: E[0] */ js.Any,
    items: /* import warning: importer.ImportType#apply Failed type conversion: E[1] */ js.Any
  ): E = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvelope")(headers.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[E]
  
  inline def createEnvelope_0[E /* <: Envelope */](headers: /* import warning: importer.ImportType#apply Failed type conversion: E[0] */ js.Any): E = ^.asInstanceOf[js.Dynamic].applyDynamic("createEnvelope")(headers.asInstanceOf[js.Any]).asInstanceOf[E]
  
  inline def createEventEnvelopeHeaders(event: Event, sdkInfo: Unit, tunnel: String, dsn: DsnComponents): EventEnvelopeHeaders = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventEnvelopeHeaders")(event.asInstanceOf[js.Any], sdkInfo.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[EventEnvelopeHeaders]
  inline def createEventEnvelopeHeaders(event: Event, sdkInfo: Unit, tunnel: Unit, dsn: DsnComponents): EventEnvelopeHeaders = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventEnvelopeHeaders")(event.asInstanceOf[js.Any], sdkInfo.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[EventEnvelopeHeaders]
  inline def createEventEnvelopeHeaders(event: Event, sdkInfo: SdkInfo, tunnel: String, dsn: DsnComponents): EventEnvelopeHeaders = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventEnvelopeHeaders")(event.asInstanceOf[js.Any], sdkInfo.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[EventEnvelopeHeaders]
  inline def createEventEnvelopeHeaders(event: Event, sdkInfo: SdkInfo, tunnel: Unit, dsn: DsnComponents): EventEnvelopeHeaders = (^.asInstanceOf[js.Dynamic].applyDynamic("createEventEnvelopeHeaders")(event.asInstanceOf[js.Any], sdkInfo.asInstanceOf[js.Any], tunnel.asInstanceOf[js.Any], dsn.asInstanceOf[js.Any])).asInstanceOf[EventEnvelopeHeaders]
  
  inline def createStackParser(parsers: StackLineParser*): StackParser = ^.asInstanceOf[js.Dynamic].applyDynamic("createStackParser")(parsers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[StackParser]
  
  inline def dateTimestampInSeconds(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dateTimestampInSeconds")().asInstanceOf[Double]
  
  inline def dirname(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def disabledUntil(limits: RateLimits, category: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("disabledUntil")(limits.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def dropUndefinedKeys[T](inputValue: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("dropUndefinedKeys")(inputValue.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def dsnFromString(str: String): js.UndefOr[DsnComponents] = ^.asInstanceOf[js.Dynamic].applyDynamic("dsnFromString")(str.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DsnComponents]]
  
  inline def dsnToString(dsn: DsnComponents): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dsnToString")(dsn.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def dsnToString(dsn: DsnComponents, withPassword: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dsnToString")(dsn.asInstanceOf[js.Any], withPassword.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def dynamicRequire(mod: Any, request: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dynamicRequire")(mod.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def dynamicSamplingContextToSentryBaggageHeader(dynamicSamplingContext: PartialDynamicSamplingCon): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("dynamicSamplingContextToSentryBaggageHeader")(dynamicSamplingContext.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def envelopeContainsItemType(envelope: Envelope, types: js.Array[EnvelopeItemType]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("envelopeContainsItemType")(envelope.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def envelopeItemTypeToDataCategory(`type`: EnvelopeItemType): DataCategory = ^.asInstanceOf[js.Dynamic].applyDynamic("envelopeItemTypeToDataCategory")(`type`.asInstanceOf[js.Any]).asInstanceOf[DataCategory]
  
  inline def escapeStringForRegex(regexString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeStringForRegex")(regexString.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extractExceptionKeysForMessage(exception: Record[String, Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractExceptionKeysForMessage")(exception.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def extractExceptionKeysForMessage(exception: Record[String, Any], maxLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("extractExceptionKeysForMessage")(exception.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def extractPathForTransaction(req: PolymorphicRequest): js.Tuple2[String, TransactionSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractPathForTransaction")(req.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, TransactionSource]]
  inline def extractPathForTransaction(req: PolymorphicRequest, options: CustomRoute): js.Tuple2[String, TransactionSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractPathForTransaction")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, TransactionSource]]
  
  inline def extractRequestData(req: PolymorphicRequest): ExtractedNodeRequestData = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any]).asInstanceOf[ExtractedNodeRequestData]
  inline def extractRequestData(req: PolymorphicRequest, options: Deps): ExtractedNodeRequestData = (^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestData")(req.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExtractedNodeRequestData]
  
  inline def extractTraceparentData(traceparent: String): js.UndefOr[TraceparentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTraceparentData")(traceparent.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TraceparentData]]
  
  inline def fill(
    source: StringDictionary[Any],
    name: String,
    replacementFactory: js.Function1[/* repeated */ Any, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(source.asInstanceOf[js.Any], name.asInstanceOf[js.Any], replacementFactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def forEachEnvelopeItem[E /* <: Envelope */](
    envelope: Envelope,
    callback: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: E[1][number] */ /* envelopeItem */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: E[1][number][0]['type'] */ /* envelopeItemType */ js.Any, 
      Boolean | Unit
    ]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachEnvelopeItem")(envelope.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getDomElement[E](selector: String): E | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomElement")(selector.asInstanceOf[js.Any]).asInstanceOf[E | Null]
  
  inline def getEventDescription(event: Event): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventDescription")(event.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getFunctionName(fn: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionName")(fn.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getGlobalObject[T](): T & InternalGlobal = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalObject")().asInstanceOf[T & InternalGlobal]
  
  inline def getGlobalSingleton[T](
    name: /* import warning: importer.ImportType#apply Failed type conversion: 'navigator' | 'console' | 'Sentry' | 'onerror' | 'onunhandledrejection' | 'SENTRY_ENVIRONMENT' | 'SENTRY_DSN' | 'SENTRY_RELEASE' | 'SENTRY_SDK_SOURCE' | '_sentryDebugIds' | '__SENTRY__'['__SENTRY__'] */ js.Any,
    creator: js.Function0[T]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalSingleton")(name.asInstanceOf[js.Any], creator.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getGlobalSingleton[T](
    name: /* import warning: importer.ImportType#apply Failed type conversion: 'navigator' | 'console' | 'Sentry' | 'onerror' | 'onunhandledrejection' | 'SENTRY_ENVIRONMENT' | 'SENTRY_DSN' | 'SENTRY_RELEASE' | 'SENTRY_SDK_SOURCE' | '_sentryDebugIds' | '__SENTRY__'['__SENTRY__'] */ js.Any,
    creator: js.Function0[T],
    obj: Any
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalSingleton")(name.asInstanceOf[js.Any], creator.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def getLocationHref(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocationHref")().asInstanceOf[String]
  
  inline def getNumberOfUrlSegments(url: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOfUrlSegments")(url.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getOriginalFunction(func: WrappedFunction): js.UndefOr[WrappedFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalFunction")(func.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[WrappedFunction]]
  
  inline def getSDKSource(): SdkSource = ^.asInstanceOf[js.Dynamic].applyDynamic("getSDKSource")().asInstanceOf[SdkSource]
  
  inline def getSanitizedUrlString(url: PartialURL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSanitizedUrlString")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSdkMetadataForEnvelopeHeader(): js.UndefOr[SdkInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSdkMetadataForEnvelopeHeader")().asInstanceOf[js.UndefOr[SdkInfo]]
  inline def getSdkMetadataForEnvelopeHeader(metadataOrEvent: Event): js.UndefOr[SdkInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSdkMetadataForEnvelopeHeader")(metadataOrEvent.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SdkInfo]]
  inline def getSdkMetadataForEnvelopeHeader(metadataOrEvent: SdkMetadata): js.UndefOr[SdkInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSdkMetadataForEnvelopeHeader")(metadataOrEvent.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SdkInfo]]
  
  inline def htmlTreeAsString(elem: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlTreeAsString")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def htmlTreeAsString(elem: Any, options: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlTreeAsString")(elem.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def htmlTreeAsString(elem: Any, options: KeyAttrs): String = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlTreeAsString")(elem.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isAbsolute(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBrowserBundle(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowserBundle")().asInstanceOf[Boolean]
  
  inline def isDOMError(wat: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMError")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDOMException(wat: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDOMException")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElement(wat: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isError(wat: Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(wat.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  inline def isErrorEvent(wat: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorEvent")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEvent(wat: Any): /* is @sentry/types.@sentry/types/types/polymorphics.PolymorphicEvent */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEvent")(wat.asInstanceOf[js.Any]).asInstanceOf[/* is @sentry/types.@sentry/types/types/polymorphics.PolymorphicEvent */ Boolean]
  
  inline def isInstanceOf(wat: Any, base: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceOf")(wat.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isMatchingPattern(value: String, pattern: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingPattern")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatchingPattern(value: String, pattern: String, requireExactStringMatch: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingPattern")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], requireExactStringMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatchingPattern(value: String, pattern: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingPattern")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatchingPattern(value: String, pattern: js.RegExp, requireExactStringMatch: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingPattern")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], requireExactStringMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNaN(wat: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNaN")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNativeFetch(func: js.Function): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNativeFetch")(func.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNodeEnv(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeEnv")().asInstanceOf[Boolean]
  
  inline def isPlainObject(wat: Any): /* is std.Record<string, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(wat.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<string, unknown> */ Boolean]
  
  inline def isPrimitive(wat: Any): /* is @sentry/types.@sentry/types/types/misc.Primitive */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitive")(wat.asInstanceOf[js.Any]).asInstanceOf[/* is @sentry/types.@sentry/types/types/misc.Primitive */ Boolean]
  
  inline def isRateLimited(limits: RateLimits, category: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRateLimited")(limits.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isRateLimited(limits: RateLimits, category: String, now: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRateLimited")(limits.asInstanceOf[js.Any], category.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isRegExp(wat: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(wat.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isString(wat: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(wat.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isSyntheticEvent(wat: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyntheticEvent")(wat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isThenable(wat: Any): /* is std.PromiseLike<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThenable")(wat.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<any> */ Boolean]
  
  inline def join(args: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def loadModule[T](moduleName: String): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  @JSImport("@sentry/utils", "logger")
  @js.native
  def logger: Logger_ = js.native
  inline def logger_=(x: Logger_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
  
  inline def makeDsn(from: DsnLike): js.UndefOr[DsnComponents] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeDsn")(from.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DsnComponents]]
  
  inline def makePromiseBuffer[T](): PromiseBuffer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePromiseBuffer")().asInstanceOf[PromiseBuffer[T]]
  inline def makePromiseBuffer[T](limit: Double): PromiseBuffer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makePromiseBuffer")(limit.asInstanceOf[js.Any]).asInstanceOf[PromiseBuffer[T]]
  
  inline def markFunctionWrapped(wrapped: WrappedFunction, original: WrappedFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("markFunctionWrapped")(wrapped.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def memoBuilder(): MemoFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("memoBuilder")().asInstanceOf[MemoFunc]
  
  inline def nodeStackLineParser(): StackLineParser = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeStackLineParser")().asInstanceOf[StackLineParser]
  inline def nodeStackLineParser(getModule: GetModuleFn): StackLineParser = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeStackLineParser")(getModule.asInstanceOf[js.Any]).asInstanceOf[StackLineParser]
  
  inline def normalize(input: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def normalize(input: Any, depth: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def normalize(input: Any, depth: Double, maxProperties: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def normalize(input: Any, depth: Unit, maxProperties: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(input.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def normalizePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeToSize[T](`object`: StringDictionary[Any]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def normalizeToSize[T](`object`: StringDictionary[Any], depth: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def normalizeToSize[T](`object`: StringDictionary[Any], depth: Double, maxSize: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def normalizeToSize[T](`object`: StringDictionary[Any], depth: Unit, maxSize: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeToSize")(`object`.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def objectify(wat: Any): ObjectConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("objectify")(wat.asInstanceOf[js.Any]).asInstanceOf[ObjectConstructor]
  
  inline def parseEnvelope(env: String, textEncoder: TextEncoderInternal, textDecoder: TextDecoderInternal): Envelope = (^.asInstanceOf[js.Dynamic].applyDynamic("parseEnvelope")(env.asInstanceOf[js.Any], textEncoder.asInstanceOf[js.Any], textDecoder.asInstanceOf[js.Any])).asInstanceOf[Envelope]
  inline def parseEnvelope(env: js.typedarray.Uint8Array, textEncoder: TextEncoderInternal, textDecoder: TextDecoderInternal): Envelope = (^.asInstanceOf[js.Dynamic].applyDynamic("parseEnvelope")(env.asInstanceOf[js.Any], textEncoder.asInstanceOf[js.Any], textDecoder.asInstanceOf[js.Any])).asInstanceOf[Envelope]
  
  inline def parseFetchArgs(fetchArgs: js.Array[Any]): Method = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFetchArgs")(fetchArgs.asInstanceOf[js.Any]).asInstanceOf[Method]
  
  inline def parseRetryAfterHeader(header: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRetryAfterHeader")(header.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def parseRetryAfterHeader(header: String, now: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRetryAfterHeader")(header.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def parseSemver(input: String): SemVer = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSemver")(input.asInstanceOf[js.Any]).asInstanceOf[SemVer]
  
  inline def parseUrl(url: String): PartialURL = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[PartialURL]
  
  inline def rejectedSyncPromise[T](): PromiseLike[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("rejectedSyncPromise")().asInstanceOf[PromiseLike[T]]
  inline def rejectedSyncPromise[T](reason: Any): PromiseLike[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("rejectedSyncPromise")(reason.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[T]]
  
  inline def relative(from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolve(args: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def resolvedSyncPromise(): PromiseLike[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvedSyncPromise")().asInstanceOf[PromiseLike[Unit]]
  inline def resolvedSyncPromise[T](value: T): PromiseLike[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvedSyncPromise")(value.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[T]]
  inline def resolvedSyncPromise[T](value: PromiseLike[T]): PromiseLike[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvedSyncPromise")(value.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[T]]
  
  inline def safeJoin(input: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeJoin")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def safeJoin(input: js.Array[Any], delimiter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeJoin")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def serializeEnvelope(envelope: Envelope): String | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeEnvelope")(envelope.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.Uint8Array]
  inline def serializeEnvelope(envelope: Envelope, textEncoder: TextEncoderInternal): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeEnvelope")(envelope.asInstanceOf[js.Any], textEncoder.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
  
  inline def severityFromString(level: String): Severity = ^.asInstanceOf[js.Dynamic].applyDynamic("severityFromString")(level.asInstanceOf[js.Any]).asInstanceOf[Severity]
  inline def severityFromString(level: Severity): Severity = ^.asInstanceOf[js.Dynamic].applyDynamic("severityFromString")(level.asInstanceOf[js.Any]).asInstanceOf[Severity]
  inline def severityFromString(level: SeverityLevel): Severity = ^.asInstanceOf[js.Dynamic].applyDynamic("severityFromString")(level.asInstanceOf[js.Any]).asInstanceOf[Severity]
  
  inline def severityLevelFromString(level: String): SeverityLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("severityLevelFromString")(level.asInstanceOf[js.Any]).asInstanceOf[SeverityLevel]
  inline def severityLevelFromString(level: SeverityLevel): SeverityLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("severityLevelFromString")(level.asInstanceOf[js.Any]).asInstanceOf[SeverityLevel]
  
  inline def snipLine(line: String, colno: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("snipLine")(line.asInstanceOf[js.Any], colno.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stackParserFromStackParserOptions(stackParser: js.Array[StackLineParser]): StackParser = ^.asInstanceOf[js.Dynamic].applyDynamic("stackParserFromStackParserOptions")(stackParser.asInstanceOf[js.Any]).asInstanceOf[StackParser]
  inline def stackParserFromStackParserOptions(stackParser: StackParser): StackParser = ^.asInstanceOf[js.Dynamic].applyDynamic("stackParserFromStackParserOptions")(stackParser.asInstanceOf[js.Any]).asInstanceOf[StackParser]
  
  inline def stringMatchesSomePattern(testString: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("stringMatchesSomePattern")(testString.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def stringMatchesSomePattern(testString: String, patterns: js.Array[String | js.RegExp]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringMatchesSomePattern")(testString.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def stringMatchesSomePattern(testString: String, patterns: js.Array[String | js.RegExp], requireExactStringMatch: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringMatchesSomePattern")(testString.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], requireExactStringMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def stringMatchesSomePattern(testString: String, patterns: Unit, requireExactStringMatch: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("stringMatchesSomePattern")(testString.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], requireExactStringMatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def stripSentryFramesAndReverse(stack: js.Array[StackFrame]): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("stripSentryFramesAndReverse")(stack.asInstanceOf[js.Any]).asInstanceOf[js.Array[StackFrame]]
  
  inline def stripUrlQueryAndFragment(urlPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripUrlQueryAndFragment")(urlPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def supportsDOMError(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsDOMError")().asInstanceOf[Boolean]
  
  inline def supportsDOMException(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsDOMException")().asInstanceOf[Boolean]
  
  inline def supportsErrorEvent(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsErrorEvent")().asInstanceOf[Boolean]
  
  inline def supportsFetch(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsFetch")().asInstanceOf[Boolean]
  
  inline def supportsHistory(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsHistory")().asInstanceOf[Boolean]
  
  inline def supportsNativeFetch(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsNativeFetch")().asInstanceOf[Boolean]
  
  inline def supportsReferrerPolicy(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsReferrerPolicy")().asInstanceOf[Boolean]
  
  inline def supportsReportingObserver(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsReportingObserver")().asInstanceOf[Boolean]
  
  inline def timestampInSeconds(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timestampInSeconds")().asInstanceOf[Double]
  
  inline def timestampWithMs(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timestampWithMs")().asInstanceOf[Double]
  
  inline def truncate(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def truncate(str: String, max: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(str.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def updateRateLimits(limits: RateLimits, param1: TransportMakeRequestResponse): RateLimits = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRateLimits")(limits.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[RateLimits]
  inline def updateRateLimits(limits: RateLimits, param1: TransportMakeRequestResponse, now: Double): RateLimits = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRateLimits")(limits.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[RateLimits]
  
  inline def urlEncode(`object`: StringDictionary[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlEncode")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@sentry/utils", "usingPerformanceAPI")
  @js.native
  val usingPerformanceAPI: Boolean = js.native
  
  inline def uuid4(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid4")().asInstanceOf[String]
  
  @JSImport("@sentry/utils", "validSeverityLevels")
  @js.native
  val validSeverityLevels: js.Array[String] = js.native
  
  /**
    * Visits a node to perform normalization on it
    *
    * @param key The key corresponding to the given node
    * @param value The node to be visited
    * @param depth Optional number indicating the maximum recursion depth
    * @param maxProperties Optional maximum number of properties/elements included in any single object/array
    * @param memo Optional Memo class handling decycling
    */
  inline def walk(key: String, value: Any): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  inline def walk(key: String, value: Any, depth: Double): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  inline def walk(key: String, value: Any, depth: Double, maxProperties: Double): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  inline def walk(key: String, value: Any, depth: Double, maxProperties: Double, memo: MemoFunc): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  inline def walk(key: String, value: Any, depth: Double, maxProperties: Unit, memo: MemoFunc): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  inline def walk(key: String, value: Any, depth: Unit, maxProperties: Double): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  inline def walk(key: String, value: Any, depth: Unit, maxProperties: Double, memo: MemoFunc): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
  inline def walk(key: String, value: Any, depth: Unit, maxProperties: Unit, memo: MemoFunc): Primitive | ObjOrArray[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], maxProperties.asInstanceOf[js.Any], memo.asInstanceOf[js.Any])).asInstanceOf[Primitive | ObjOrArray[Any]]
}
