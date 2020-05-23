package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a raw buffer of binary data, which is used to store data for the
  * different typed arrays. ArrayBuffers cannot be read from or written to directly,
  * but can be passed to a typed array or DataView Object to interpret the raw
  * buffer as needed.
  */
@js.native
trait ArrayBuffer
  extends BufferSource
     with ArrayBufferLike
     with Transferable {
  /**
    * Read-only. The length of the ArrayBuffer (in bytes).
    */
  val byteLength: Double = js.native
  @JSName(js.Symbol.toStringTag)
  val toStringTag: java.lang.String = js.native
  /**
    * Returns a section of an ArrayBuffer.
    */
  def slice(begin: Double): ArrayBuffer = js.native
  def slice(begin: Double, end: Double): ArrayBuffer = js.native
}

