package typings
package streamDashEachLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stream-each", JSImport.Namespace)
@js.native
object streamDashEachMod extends js.Object {
  def apply(
    stream: nodeLib.NodeJSNs.ReadableStream,
    iterator: js.Function2[
      /* data */ nodeLib.Buffer | java.lang.String, 
      /* next */ js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit], 
      scala.Unit
    ],
    cb: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
}

