package typings
package streamDashToDashPromiseLib

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
  def apply(stream: nodeLib.NodeJSNs.ReadableStream): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Return s promise which resolves when the input stream ends
    * @param stream The input stream
    */
  def apply(stream: nodeLib.NodeJSNs.WritableStream): js.Promise[scala.Unit] = js.native
}

