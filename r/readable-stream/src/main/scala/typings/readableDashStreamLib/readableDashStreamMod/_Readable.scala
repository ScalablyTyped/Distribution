package typings
package readableDashStreamLib.readableDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _Readable
  extends nodeLib.streamMod.Readable {
  // static ReadableState: _Readable.ReadableState;
  var _readableState: readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.ReadableState = js.native
  var destroyed: scala.Boolean = js.native
  def _undestroy(): scala.Unit = js.native
  def destroy(err: nodeLib.Error, callback: js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit]): this.type = js.native
}

