package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceBuffer extends EventTarget {
  var appendWindowEnd: scala.Double = js.native
  var appendWindowStart: scala.Double = js.native
  val audioTracks: AudioTrackList = js.native
  val buffered: TimeRanges = js.native
  var mode: AppendMode = js.native
  val textTracks: TextTrackList = js.native
  var timestampOffset: scala.Double = js.native
  val updating: scala.Boolean = js.native
  val videoTracks: VideoTrackList = js.native
  def abort(): scala.Unit = js.native
  def appendBuffer(): scala.Unit = js.native
  def appendBuffer(
    data: ArrayBuffer | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView
  ): scala.Unit = js.native
  def appendStream(stream: MSStream): scala.Unit = js.native
  def appendStream(stream: MSStream, maxSize: scala.Double): scala.Unit = js.native
  def remove(start: scala.Double, end: scala.Double): scala.Unit = js.native
}

@JSGlobal("SourceBuffer")
@js.native
object SourceBuffer
  extends ScalablyTyped.runtime.Instantiable0[SourceBuffer]

