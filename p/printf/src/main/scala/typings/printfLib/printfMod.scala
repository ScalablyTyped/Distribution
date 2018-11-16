package typings
package printfLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("printf", JSImport.Namespace)
@js.native
object printfMod extends js.Object {
  def apply(format: java.lang.String, args: js.Any*): java.lang.String = js.native
  def apply(writeStream: nodeLib.NodeJSNs.WritableStream, format: java.lang.String, args: js.Any*): scala.Unit = js.native
}

