package typings.reactDom

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/node-stream", JSImport.Namespace)
@js.native
object nodeStreamMod extends js.Object {
  val version: String = js.native
  def renderToStaticStream(element: ReactElement): js.Any = js.native
  def renderToStream(element: ReactElement): js.Any = js.native
}

