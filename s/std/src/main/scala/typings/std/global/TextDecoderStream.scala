package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.BufferSource
import typings.std.TextDecoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextDecoderStream")
@js.native
class TextDecoderStream ()
  extends typings.std.TextDecoderStream {
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
  override val readable: typings.std.ReadableStream[_] = js.native
  /* CompleteClass */
  @JSName("readable")
  override val readable_TextDecoderStream: typings.std.ReadableStream[java.lang.String] = js.native
  /**
    * Returns a writable stream which accepts [AllowShared] BufferSource chunks and runs them through encoding's decoder before making them available to readable.
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
  override val writable: typings.std.WritableStream[_] = js.native
  /* CompleteClass */
  @JSName("writable")
  override val writable_TextDecoderStream: typings.std.WritableStream[BufferSource] = js.native
}

@JSGlobal("TextDecoderStream")
@js.native
object TextDecoderStream
  extends Instantiable0[typings.std.TextDecoderStream]
     with Instantiable1[/* label */ java.lang.String, typings.std.TextDecoderStream]
     with Instantiable2[
      /* label */ java.lang.String, 
      /* options */ TextDecoderOptions, 
      typings.std.TextDecoderStream
    ]

