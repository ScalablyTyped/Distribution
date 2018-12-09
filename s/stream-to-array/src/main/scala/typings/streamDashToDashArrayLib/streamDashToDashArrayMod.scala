package typings
package streamDashToDashArrayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-to-array", JSImport.Namespace)
@js.native
object streamDashToDashArrayMod extends js.Object {
  def apply(`this`: nodeLib.NodeJSNs.ReadableStream): js.Promise[js.Array[_]] = js.native
  def apply(
    `this`: nodeLib.NodeJSNs.ReadableStream,
    callback: js.Function2[/* err */ js.Any, /* arr */ js.Array[_], scala.Unit]
  ): js.Promise[js.Array[_]] = js.native
}

