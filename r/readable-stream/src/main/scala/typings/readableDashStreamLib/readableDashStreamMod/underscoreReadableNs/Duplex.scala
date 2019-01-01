package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(nodeLib.streamMod.Duplex because Inheritance from two classes, readableDashStreamLib.readableDashStreamMod._Readable because Inheritance from two classes)*/
@js.native
trait Duplex extends Writable {
  var _readableState: ReadableState = js.native
  var allowHalfOpen: scala.Boolean = js.native
  @JSName(org.scalablytyped.runtime.Symbol.asyncIterator)
  var asyncIterator: js.Function0[nodeLib.AsyncIterableIterator[java.lang.String | nodeLib.Buffer]] = js.native
  // Readable
  var readable: scala.Boolean = js.native
  val readableHighWaterMark: scala.Double = js.native
  val readableLength: scala.Double = js.native
  def _read(): scala.Unit = js.native
  def _read(size: scala.Double): scala.Unit = js.native
  def isPaused(): scala.Boolean = js.native
  def pause(): this.type = js.native
  def push(chunk: js.Any): scala.Boolean = js.native
  def push(chunk: js.Any, encoding: java.lang.String): scala.Boolean = js.native
  def read(): js.Any = js.native
  def read(size: scala.Double): js.Any = js.native
  def resume(): this.type = js.native
  def setEncoding(enc: java.lang.String): this.type = js.native
  def unpipe(): this.type = js.native
  def unpipe(dest: nodeLib.NodeJSNs.WritableStream): this.type = js.native
  def unshift(chunk: js.Any): scala.Boolean = js.native
  def wrap(oldStream: nodeLib.NodeJSNs.ReadableStream): this.type = js.native
}

