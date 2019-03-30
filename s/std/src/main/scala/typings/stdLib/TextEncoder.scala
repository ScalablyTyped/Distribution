package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TextEncoder takes a stream of code points as input and emits a stream of bytes. For a more scalable, non-native library, see StringView – a C-like representation of strings based on typed arrays. */
@js.native
trait TextEncoder extends js.Object {
  /**
    * Returns "utf-8".
    */
  val encoding: java.lang.String = js.native
  /**
    * Returns the result of running UTF-8's encoder.
    */
  def encode(): Uint8Array = js.native
  def encode(input: java.lang.String): Uint8Array = js.native
}

@JSGlobal("TextEncoder")
@js.native
class TextEncoderCls () extends TextEncoder

@JSGlobal("TextEncoder")
@js.native
object TextEncoder
  extends org.scalablytyped.runtime.Instantiable0[TextEncoder]

