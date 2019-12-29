package typings.readableDashStream.readableDashStreamMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readable-stream", "Writable")
@js.native
class Writable ()
  extends typings.node.streamMod.Writable {
  def this(options: WritableOptions) = this()
  var _writableState: WritableState = js.native
  def _undestroy(): Unit = js.native
  def destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): this.type = js.native
}

