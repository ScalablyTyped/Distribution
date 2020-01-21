package typings.readableStream.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _Readable
  extends typings.node.streamMod.Readable {
  // static ReadableState: _Readable.ReadableState;
  var _readableState: ReadableState = js.native
  def _undestroy(): Unit = js.native
  def destroy(err: Error, callback: js.Function1[/* error */ Error | Null, Unit]): this.type = js.native
}

