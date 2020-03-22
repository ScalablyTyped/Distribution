package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEncoderStream
  extends GenericTransformStream
     with TextEncoderCommon {
  @JSName("readable")
  val readable_TextEncoderStream: ReadableStream[Uint8Array]
  @JSName("writable")
  val writable_TextEncoderStream: WritableStream[java.lang.String]
}

@JSGlobal("TextEncoderStream")
@js.native
object TextEncoderStream extends Instantiable0[TextEncoderStream]

