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
  /**
    * Returns encoding's name, lowercased.
    */
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  /**
    * Returns true if error mode is "fatal", and false otherwise.
    */
  /* CompleteClass */
  override val fatal: scala.Boolean = js.native
  /**
    * Returns true if ignore BOM flag is set, and false otherwise.
    */
  /* CompleteClass */
  override val ignoreBOM: scala.Boolean = js.native
  /**
    * Returns a readable stream whose chunks are strings resulting from running encoding's decoder on the chunks written to writable.
    */
  /* CompleteClass */
  override val readable: ReadableStream[_] = js.native
  /**
    * Returns a writable stream which accepts BufferSource chunks and runs them through encoding's decoder before making them available to readable.
    * 
    * Typically this will be used via the pipeThrough() method on a ReadableStream source.
    * 
    * ```
    * var decoder = new TextDecoderStream(encoding);
    * byteReadable
    *   .pipeThrough(decoder)
    *   .pipeTo(textWritable);
    * ```
    * 
    * If the error mode is "fatal" and encoding's decoder returns error, both readable and writable will be errored with a TypeError.
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

