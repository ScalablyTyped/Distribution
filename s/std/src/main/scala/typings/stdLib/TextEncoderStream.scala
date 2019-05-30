package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEncoderStream
  extends TextEncoderCommon
     with GenericTransformStream

@JSGlobal("TextEncoderStream")
@js.native
class TextEncoderStreamCls () extends TextEncoderStream {
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  /* CompleteClass */
  override val readable: ReadableStream[_] = js.native
  /**
    * Returns a writable stream which accepts string chunks and runs them through UTF-8's encoder before making them available to readable.
    * Typically this will be used via the pipeThrough() method on a ReadableStream source.
    * textReadable
    * .pipeThrough(new TextEncoderStream())
    * .pipeTo(byteWritable);
    */
  /* CompleteClass */
  override val writable: WritableStream[_] = js.native
}

@JSGlobal("TextEncoderStream")
@js.native
object TextEncoderStream
  extends org.scalablytyped.runtime.Instantiable0[TextEncoderStream]

