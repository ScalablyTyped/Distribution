package typings.sentryTypes.spanMod

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.anon.Data
import typings.sentryTypes.anon.Description
import typings.sentryTypes.anon.PickSpanContextExcludekey
import typings.sentryTypes.transactionMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Span extends SpanContext {
  
  /**
    * Use {@link startChild}
    * @deprecated
    */
  def child(): Span = js.native
  def child(spanContext: PickSpanContextExcludekey): Span = js.native
  
  /**
    * @inheritDoc
    */
  @JSName("data")
  var data_Span: StringDictionary[js.Any] = js.native
  
  /**
    * Sets the finish timestamp on the current span.
    * @param endTimestamp Takes an endTimestamp if the end should not be the time when you call this function.
    */
  def finish(): Unit = js.native
  def finish(endTimestamp: Double): Unit = js.native
  
  /** Convert the object to JSON for w. spans array info only */
  def getTraceContext(): Data = js.native
  
  /**
    * Determines whether span was successful (HTTP200)
    */
  def isSuccess(): Boolean = js.native
  
  /**
    * Sets the data attribute on the current span
    * @param key Data key
    * @param value Data value
    */
  def setData(key: String, value: js.Any): this.type = js.native
  
  /**
    * Sets the status attribute on the current span based on the http code
    * @param httpStatus http code used to set the status
    */
  def setHttpStatus(httpStatus: Double): this.type = js.native
  
  /**
    * Sets the status attribute on the current span
    * See: {@sentry/tracing SpanStatus} for possible values
    * @param status http code used to set the status
    */
  def setStatus(status: String): this.type = js.native
  
  /**
    * Sets the tag attribute on the current span
    * @param key Tag key
    * @param value Tag value
    */
  def setTag(key: String, value: String): this.type = js.native
  
  /**
    * @inheritDoc
    */
  @JSName("spanId")
  var spanId_Span: String = js.native
  
  /**
    * Creates a new `Span` while setting the current `Span.id` as `parentSpanId`.
    * Also the `sampled` decision will be inherited.
    */
  def startChild(): Span = js.native
  def startChild(spanContext: PickSpanContextExcludekey): Span = js.native
  
  /**
    * @inheritDoc
    */
  @JSName("startTimestamp")
  var startTimestamp_Span: Double = js.native
  
  /**
    * @inheritDoc
    */
  @JSName("tags")
  var tags_Span: StringDictionary[String] = js.native
  
  /** Convert the object to JSON */
  def toJSON(): Description = js.native
  
  /** Return a traceparent compatible header string */
  def toTraceparent(): String = js.native
  
  /**
    * @inheritDoc
    */
  @JSName("traceId")
  var traceId_Span: String = js.native
  
  /**
    * The transaction containing this span
    */
  var transaction: js.UndefOr[Transaction] = js.native
}
