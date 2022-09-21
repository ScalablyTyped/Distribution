package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TextEncoder takes a stream of code points as input and emits a stream of bytes. For a more scalable, non-native library, see StringView – a C-like representation of strings based on typed arrays. */
@js.native
trait TextEncoder
  extends StObject
     with TextEncoderCommon {
  
  /** Returns the result of running UTF-8's encoder. */
  /* standard dom */
  def encode(): js.typedarray.Uint8Array = js.native
  def encode(input: java.lang.String): js.typedarray.Uint8Array = js.native
  
  /** Runs the UTF-8 encoder on source, stores the result of that operation into destination, and returns the progress made as an object wherein read is the number of converted code units of source and written is the number of bytes modified in destination. */
  /* standard dom */
  def encodeInto(source: java.lang.String, destination: js.typedarray.Uint8Array): TextEncoderEncodeIntoResult = js.native
}
