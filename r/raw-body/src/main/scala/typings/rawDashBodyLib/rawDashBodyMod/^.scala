package typings
package rawDashBodyLib.rawDashBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raw-body", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(stream: nodeLib.streamMod.Readable): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Gets the entire buffer of a stream either as a `Buffer` or a string.
    * Validates the stream's length against an expected length and maximum
    * limit. Ideal for parsing request bodies.
    */
  def apply(
    stream: nodeLib.streamMod.Readable,
    callback: js.Function2[/* err */ RawBodyError, /* body */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def apply(
    stream: nodeLib.streamMod.Readable,
    options: (Options with rawDashBodyLib.Anon_Encoding) | Encoding
  ): js.Promise[java.lang.String] = js.native
  def apply(
    stream: nodeLib.streamMod.Readable,
    options: (Options with rawDashBodyLib.Anon_Encoding) | Encoding,
    callback: js.Function2[/* err */ RawBodyError, /* body */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def apply(stream: nodeLib.streamMod.Readable, options: Options): js.Promise[nodeLib.Buffer] = js.native
  def apply(
    stream: nodeLib.streamMod.Readable,
    options: Options,
    callback: js.Function2[/* err */ RawBodyError, /* body */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
}

