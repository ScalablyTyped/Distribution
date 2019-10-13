package typings.restify.restifyMod.bunyan

import typings.node.streamMod.internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Bunyan stream to capture records in a ring buffer and only pass through
  * on a higher-level record. E.g. buffer up all records but only dump when
  * getting a WARN or above.
  */
@JSImport("restify", "bunyan.RequestCaptureStream")
@js.native
class RequestCaptureStream protected () extends internal {
  def this(opts: RequestCaptureOptions) = this()
  /** write to the stream */
  def write(record: js.Any): Unit = js.native
}

