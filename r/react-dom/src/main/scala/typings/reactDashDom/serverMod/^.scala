package typings.reactDashDom.serverMod

import typings.react.reactMod.ReactElement
import typings.reactDashDom.serverMod.Global.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def renderToNodeStream(element: ReactElement): ReadableStream = js.native
  def renderToStaticMarkup(element: ReactElement): String = js.native
  def renderToStaticNodeStream(element: ReactElement): ReadableStream = js.native
  def renderToString(element: ReactElement): String = js.native
}

