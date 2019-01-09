package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restify", "bunyan")
@js.native
object bunyanNs extends js.Object {
  trait RequestCaptureOptions extends js.Object {
    /**
      * If true, then dump captured records on the *default* request id when
      * dumping. I.e. dump records logged without "req_id" field. Default
      * false.
      */
    var dumpDefault: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The level at which to trigger dumping captured records. Defaults to
      * bunyan.WARN.
      */
    var level: js.UndefOr[bunyanLib.bunyanMod.LoggerNs.LogLevel] = js.undefined
    /** Number of records to capture. Default 100. */
    var maxRecords: js.UndefOr[scala.Double] = js.undefined
    /**
      * Number of simultaneous request id capturing buckets to maintain.
      * Default 1000.
      */
    var maxRequestIds: js.UndefOr[scala.Double] = js.undefined
    /** The stream to which to write when dumping captured records. */
    var stream: js.UndefOr[bunyanLib.bunyanMod.LoggerNs.Stream] = js.undefined
    /** The streams to which to write when dumping captured records. */
    var streams: js.UndefOr[js.Array[bunyanLib.bunyanMod.LoggerNs.Stream]] = js.undefined
  }
  
  /**
    * A Bunyan stream to capture records in a ring buffer and only pass through
    * on a higher-level record. E.g. buffer up all records but only dump when
    * getting a WARN or above.
    */
  @js.native
  class RequestCaptureStream protected ()
    extends nodeLib.streamMod.Stream {
    def this(opts: RequestCaptureOptions) = this()
    /** write to the stream */
    def write(record: js.Any): scala.Unit = js.native
  }
  
  val serializers: bunyanLib.bunyanMod.LoggerNs.Serializers with restifyLib.Anon_Clientreq = js.native
  /** create a bunyan logger */
  def createLogger(name: java.lang.String): bunyanLib.bunyanMod.namespaced = js.native
}

