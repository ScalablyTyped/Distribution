package typings.reactDom.serverMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/server", "renderToString")
@js.native
object renderToString extends js.Object {
  def apply(element: ReactElement): String = js.native
}

