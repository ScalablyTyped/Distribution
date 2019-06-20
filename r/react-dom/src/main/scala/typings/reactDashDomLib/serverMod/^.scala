package typings
package reactDashDomLib.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: java.lang.String = js.native
  def renderToNodeStream(element: reactLib.reactMod.ReactElement): reactDashDomLib.serverMod.Global.NodeJSNs.ReadableStream = js.native
  def renderToStaticMarkup(element: reactLib.reactMod.ReactElement): java.lang.String = js.native
  def renderToStaticNodeStream(element: reactLib.reactMod.ReactElement): reactDashDomLib.serverMod.Global.NodeJSNs.ReadableStream = js.native
  def renderToString(element: reactLib.reactMod.ReactElement): java.lang.String = js.native
}

