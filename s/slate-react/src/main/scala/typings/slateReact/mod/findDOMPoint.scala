package typings.slateReact.mod

import typings.slate.mod.Point
import typings.slateReact.AnonNode
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "findDOMPoint")
@js.native
object findDOMPoint extends js.Object {
  def apply(point: Point): AnonNode | Null = js.native
  def apply(point: Point, win: Window_): AnonNode | Null = js.native
}

