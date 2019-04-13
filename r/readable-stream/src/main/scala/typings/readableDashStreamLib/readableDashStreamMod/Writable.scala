package typings
package readableDashStreamLib.readableDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readable-stream", "Writable")
@js.native
class Writable ()
  extends nodeLib.streamMod.Writable {
  def this(options: WritableOptions) = this()
  var _writableState: WritableState = js.native
  // static WritableState: WritableState;
  // private static realHasInstance: (obj: any) => boolean;
  var destroyed: scala.Boolean = js.native
  def _undestroy(): scala.Unit = js.native
  def destroy(error: stdLib.Error): this.type = js.native
  def destroy(
    error: stdLib.Error,
    callback: js.Function1[/* error */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  ): this.type = js.native
}

