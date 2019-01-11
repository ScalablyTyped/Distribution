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
    callback: js.Function2[
      /* err */ rawDashBodyLib.rawDashBodyMod.getRawBodyNs.RawBodyError, 
      /* body */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(
    stream: nodeLib.streamMod.Readable,
    options: (rawDashBodyLib.rawDashBodyMod.getRawBodyNs.Options with rawDashBodyLib.Anon_Encoding) | rawDashBodyLib.rawDashBodyMod.getRawBodyNs.Encoding
  ): js.Promise[java.lang.String] = js.native
  def apply(
    stream: nodeLib.streamMod.Readable,
    options: (rawDashBodyLib.rawDashBodyMod.getRawBodyNs.Options with rawDashBodyLib.Anon_Encoding) | rawDashBodyLib.rawDashBodyMod.getRawBodyNs.Encoding,
    callback: js.Function2[
      /* err */ rawDashBodyLib.rawDashBodyMod.getRawBodyNs.RawBodyError, 
      /* body */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def apply(stream: nodeLib.streamMod.Readable, options: rawDashBodyLib.rawDashBodyMod.getRawBodyNs.Options): js.Promise[nodeLib.Buffer] = js.native
  def apply(
    stream: nodeLib.streamMod.Readable,
    options: rawDashBodyLib.rawDashBodyMod.getRawBodyNs.Options,
    callback: js.Function2[
      /* err */ rawDashBodyLib.rawDashBodyMod.getRawBodyNs.RawBodyError, 
      /* body */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

