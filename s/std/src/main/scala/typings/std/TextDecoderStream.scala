package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDecoderStream
  extends TextDecoderCommon
     with GenericTransformStream

@JSGlobal("TextDecoderStream")
@js.native
class TextDecoderStreamCls () extends TextDecoderStream {
  def this(label: java.lang.String) = this()
  def this(label: java.lang.String, options: TextDecoderOptions) = this()
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  /* CompleteClass */
  override val fatal: scala.Boolean = js.native
  /* CompleteClass */
  override val ignoreBOM: scala.Boolean = js.native
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

@JSGlobal("TextDecoderStream")
@js.native
object TextDecoderStream
  extends Instantiable0[TextDecoderStream]
     with Instantiable1[/* label */ java.lang.String, TextDecoderStream]
     with Instantiable2[/* label */ java.lang.String, /* options */ TextDecoderOptions, TextDecoderStream]

