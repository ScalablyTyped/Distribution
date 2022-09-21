package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A decoder for a specific method, that is a specific character encoding, like utf-8, iso-8859-2, koi8, cp1261, gbk, etc. A decoder takes a stream of bytes as input and emits a stream of code points. For a more scalable, non-native library, see StringView – a C-like representation of strings based on typed arrays. */
@js.native
trait TextDecoder
  extends StObject
     with TextDecoderCommon {
  
  /**
    * Returns the result of running encoding's decoder. The method can be invoked zero or more times with options's stream set to true, and then once without options's stream (or set to false), to process a fragmented input. If the invocation without options's stream (or set to false) has no input, it's clearest to omit both arguments.
    *
    * ```
    * var string = "", decoder = new TextDecoder(encoding), buffer;
    * while(buffer = next_chunk()) {
    *   string += decoder.decode(buffer, {stream:true});
    * }
    * string += decoder.decode(); // end-of-queue
    * ```
    *
    * If the error mode is "fatal" and encoding's decoder returns error, throws a TypeError.
    */
  /* standard dom */
  def decode(): java.lang.String = js.native
  def decode(input: Unit, options: TextDecodeOptions): java.lang.String = js.native
  def decode(input: BufferSource): java.lang.String = js.native
  def decode(input: BufferSource, options: TextDecodeOptions): java.lang.String = js.native
}
