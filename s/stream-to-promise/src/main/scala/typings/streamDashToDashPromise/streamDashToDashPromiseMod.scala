package typings.streamDashToDashPromise

import typings.node.Buffer
import typings.node.NodeJSNs.ReadableStream
import typings.node.NodeJSNs.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-to-promise", JSImport.Namespace)
@js.native
object streamDashToDashPromiseMod extends js.Object {
  /**
    * Return a promise which resolves when the input stream ends
    * @param stream The input stream
    * @returns A promise containing the stream output as a buffer
    */
  def apply(stream: ReadableStream): js.Promise[Buffer] = js.native
  /**
    * Return s promise which resolves when the input stream ends
    * @param stream The input stream
    */
  def apply(stream: WritableStream): js.Promise[Unit] = js.native
}

