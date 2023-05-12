package typings.sentryCore

import org.scalablytyped.runtime.StringDictionary
import typings.sentryCore.anon.ReadonlyPartialDynamicSam
import typings.sentryCore.typesHubMod.Hub
import typings.sentryCore.typesTracingSpanMod.Span
import typings.sentryTypes.anon.PartialDynamicSamplingCon
import typings.sentryTypes.anon.PartialTransactionMetadat
import typings.sentryTypes.typesContextMod.Context
import typings.sentryTypes.typesInstrumenterMod.Instrumenter
import typings.sentryTypes.typesMeasurementMod.MeasurementUnit
import typings.sentryTypes.typesMiscMod.Primitive
import typings.sentryTypes.typesSpanMod.SpanContext
import typings.sentryTypes.typesTransactionMod.TransactionContext
import typings.sentryTypes.typesTransactionMod.TransactionMetadata
import typings.sentryTypes.typesTransactionMod.TransactionSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTracingTransactionMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sentryTypes.typesSpanMod.SpanContext because Already inherited
  - typings.sentryTypes.typesTransactionMod.TransactionContext because var conflicts: data, description, endTimestamp, instrumenter, op, parentSpanId, sampled, spanId, startTimestamp, status, tags, traceId. Inlined parentSampled, name, trimEnd, metadata
  - typings.sentryTypes.typesTransactionMod.Transaction because var conflicts: data, description, endTimestamp, instrumenter, op, parentSpanId, sampled, spanId, startTimestamp, status, tags, traceId, transaction. Inlined instrumenter_Transaction, spanId_Transaction, tags_Transaction, data_Transaction, metadata_Transaction, startTimestamp_Transaction, traceId_Transaction, getDynamicSamplingContext, setContext, setMeasurement, setMetadata, setName, setName, toContext_SpanContext */ @JSImport("@sentry/core/types/tracing/transaction", "Transaction")
  @js.native
  open class Transaction protected () extends Span {
    /**
      * This constructor should never be called manually. Those instrumenting tracing should use
      * `Sentry.startTransaction()`, and internal methods should use `hub.startTransaction()`.
      * @internal
      * @hideconstructor
      * @hidden
      */
    def this(transactionContext: TransactionContext) = this()
    def this(transactionContext: TransactionContext, hub: Hub) = this()
    
    /* private */ var _contexts: Any = js.native
    
    /* private */ var _frozenDynamicSamplingContext: Any = js.native
    
    /**
      * The reference to the current hub.
      */
    var _hub: Hub = js.native
    
    /* private */ var _measurements: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /* private */ var _trimEnd: Any = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("data")
    var data_Transaction: StringDictionary[Any] = js.native
    
    /** Return the current Dynamic Sampling Context of this transaction */
    def getDynamicSamplingContext(): PartialDynamicSamplingCon = js.native
    /**
      * @inheritdoc
      *
      * @experimental
      */
    @JSName("getDynamicSamplingContext")
    def getDynamicSamplingContext_ReadonlyPartialDynamicSam(): ReadonlyPartialDynamicSam = js.native
    
    /**
      * Attaches SpanRecorder to the span itself
      * @param maxlen maximum number of spans that can be recorded
      */
    def initSpanRecorder(): Unit = js.native
    def initSpanRecorder(maxlen: Double): Unit = js.native
    
    /**
      * The instrumenter that created this transaction.
      */
    @JSName("instrumenter")
    var instrumenter_Transaction: Instrumenter = js.native
    
    var metadata: js.UndefOr[PartialTransactionMetadat | TransactionMetadata] = js.native
    /**
      * Metadata about the transaction
      */
    @JSName("metadata")
    var metadata_Transaction: TransactionMetadata = js.native
    
    /** Getter for `name` property */
    def name: String = js.native
    /** Setter for `name` property, which also sets `source` as custom */
    def name_=(newName: String): Unit = js.native
    /**
      * Human-readable identifier for the transaction
      */
    @JSName("name")
    var name_FTransaction: String = js.native
    
    /**
      * If this transaction has a parent, the parent's sampling decision
      */
    var parentSampled: js.UndefOr[Boolean] = js.native
    
    /**
      * @inheritDoc
      */
    def setContext(key: String): Unit = js.native
    /**
      * Set the context of a transaction event
      */
    def setContext(key: String, context: Context): Unit = js.native
    
    /**
      * Override the current hub with a new one.
      * Used if you want another hub to finish the transaction.
      *
      * @internal
      */
    def setHub(hub: Hub): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def setMeasurement(name: String, value: Double): Unit = js.native
    /**
      * Set observed measurement for this transaction.
      *
      * @param name Name of the measurement
      * @param value Value of the measurement
      * @param unit Unit of the measurement. (Defaults to an empty string)
      */
    def setMeasurement(name: String, value: Double, unit: MeasurementUnit): Unit = js.native
    
    /**
      * @inheritDoc
      */
    def setMetadata(newMetadata: typings.sentryCore.anon.PartialTransactionMetadat): Unit = js.native
    /**
      * Set metadata for this transaction.
      * @hidden
      */
    def setMetadata(newMetadata: PartialTransactionMetadat): Unit = js.native
    
    /**
      * JSDoc
      */
    /**
      * Set the name of the transaction
      */
    def setName(name: String): Unit = js.native
    def setName(name: String, source: TransactionSource): Unit = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("spanId")
    var spanId_Transaction: String = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("startTimestamp")
    var startTimestamp_Transaction: Double = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("tags")
    var tags_Transaction: StringDictionary[Primitive] = js.native
    
    /** Returns the current span properties as a `SpanContext` */
    @JSName("toContext")
    def toContext_SpanContext(): SpanContext = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("traceId")
    var traceId_Transaction: String = js.native
    
    /**
      * If true, sets the end timestamp of the transaction to the highest timestamp of child spans, trimming
      * the duration of the transaction. This is useful to discard extra time in the transaction that is not
      * accounted for in child spans, like what happens in the idle transaction Tracing integration, where we finish the
      * transaction after a given "idle time" and we don't want this "idle time" to be part of the transaction.
      */
    var trimEnd: js.UndefOr[Boolean] = js.native
    
    /**
      * @inheritDoc
      */
    def updateWithContext(transactionContext: TransactionContext): this.type = js.native
  }
}
