package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextEncoderStream")
@js.native
class TextEncoderStreamCls () extends TextEncoderStream {
  /**
    * Returns "utf-8".
    */
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
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

