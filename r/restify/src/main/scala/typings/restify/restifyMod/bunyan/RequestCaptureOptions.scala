package typings.restify.restifyMod.bunyan

import typings.bunyan.bunyanMod.LogLevel
import typings.bunyan.bunyanMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestCaptureOptions extends js.Object {
  /**
    * If true, then dump captured records on the *default* request id when
    * dumping. I.e. dump records logged without "req_id" field. Default
    * false.
    */
  var dumpDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * The level at which to trigger dumping captured records. Defaults to
    * bunyan.WARN.
    */
  var level: js.UndefOr[LogLevel] = js.undefined
  /** Number of records to capture. Default 100. */
  var maxRecords: js.UndefOr[Double] = js.undefined
  /**
    * Number of simultaneous request id capturing buckets to maintain.
    * Default 1000.
    */
  var maxRequestIds: js.UndefOr[Double] = js.undefined
  /** The stream to which to write when dumping captured records. */
  var stream: js.UndefOr[Stream] = js.undefined
  /** The streams to which to write when dumping captured records. */
  var streams: js.UndefOr[js.Array[Stream]] = js.undefined
}

object RequestCaptureOptions {
  @scala.inline
  def apply(
    dumpDefault: js.UndefOr[Boolean] = js.undefined,
    level: LogLevel = null,
    maxRecords: Int | Double = null,
    maxRequestIds: Int | Double = null,
    stream: Stream = null,
    streams: js.Array[Stream] = null
  ): RequestCaptureOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dumpDefault)) __obj.updateDynamic("dumpDefault")(dumpDefault)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (maxRecords != null) __obj.updateDynamic("maxRecords")(maxRecords.asInstanceOf[js.Any])
    if (maxRequestIds != null) __obj.updateDynamic("maxRequestIds")(maxRequestIds.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (streams != null) __obj.updateDynamic("streams")(streams)
    __obj.asInstanceOf[RequestCaptureOptions]
  }
}

