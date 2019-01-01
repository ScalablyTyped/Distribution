package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WritableState extends js.Object {
  var buffer: js.Array[BufferRequest] = js.native
  var bufferProcessing: scala.Boolean = js.native
  var bufferedRequest: BufferRequest | scala.Null = js.native
  var bufferedRequestCount: scala.Double = js.native
  var corked: scala.Double = js.native
  var corkedRequestsFree: CorkedRequest = js.native
  var decodeStrings: scala.Boolean = js.native
  var defaultEncoding: java.lang.String = js.native
  var destroyed: scala.Boolean = js.native
  var ended: scala.Boolean = js.native
  var ending: scala.Boolean = js.native
  var errorEmitted: scala.Boolean = js.native
  var finalCalled: scala.Boolean = js.native
  var finished: scala.Boolean = js.native
  var highWaterMark: scala.Double = js.native
  var lastBufferedRequest: BufferRequest | scala.Null = js.native
  var length: scala.Double = js.native
  var needDrain: scala.Boolean = js.native
  var objectMode: scala.Boolean = js.native
  var pendingcb: scala.Double = js.native
  var prefinished: scala.Boolean = js.native
  var sync: scala.Boolean = js.native
  var writecb: (js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit]) | scala.Null = js.native
  var writelen: scala.Double = js.native
  var writing: scala.Boolean = js.native
  // new (options: WritableStateOptions, stream: Writable): WritableState;
  def getBuffer(): js.Array[BufferRequest] = js.native
  def onwrite(): js.Any = js.native
  def onwrite(er: nodeLib.Error): js.Any = js.native
}

