package typings
package streamDashToDashStringLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-to-string", JSImport.Namespace)
@js.native
object streamDashToDashStringMod extends js.Object {
  def apply(stream: nodeLib.NodeJSNs.ReadableStream): stdLib.Promise[java.lang.String] = js.native
  def apply(stream: nodeLib.NodeJSNs.ReadableStream, cb: streamDashToDashStringLib.Callback): stdLib.Promise[java.lang.String] = js.native
  def apply(stream: nodeLib.NodeJSNs.ReadableStream, enc: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def apply(
    stream: nodeLib.NodeJSNs.ReadableStream,
    enc: java.lang.String,
    cb: streamDashToDashStringLib.Callback
  ): stdLib.Promise[java.lang.String] = js.native
}

