package typings.reactDashDom.reactDashDomMod

import typings.react.reactMod.ReactInstance
import typings.std.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom", "findDOMNode")
@js.native
object findDOMNode extends js.Object {
  def apply(): Element | Null | Text = js.native
  def apply(instance: ReactInstance): Element | Null | Text = js.native
}

