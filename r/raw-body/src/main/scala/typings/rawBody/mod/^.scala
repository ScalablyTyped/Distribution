package typings.rawBody.mod

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.rawBody.AnonEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raw-body", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(stream: Readable): js.Promise[Buffer] = js.native
  /**
    * Gets the entire buffer of a stream either as a `Buffer` or a string.
    * Validates the stream's length against an expected length and maximum
    * limit. Ideal for parsing request bodies.
    */
  def apply(stream: Readable, callback: js.Function2[/* err */ RawBodyError, /* body */ Buffer, Unit]): Unit = js.native
  def apply(stream: Readable, options: (Options with AnonEncoding) | Encoding | Options): js.Promise[String] = js.native
  def apply(
    stream: Readable,
    options: (Options with AnonEncoding) | Encoding | Options,
    callback: js.Function2[/* err */ RawBodyError, (/* body */ Buffer) | (/* body */ String), Unit]
  ): Unit = js.native
}

