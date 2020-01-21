package typings.slateReact

import typings.immutable.Immutable.List
import typings.slate.mod.Controller
import typings.slate.mod.Editor
import typings.slate.mod.InlineProperties
import typings.slate.mod.NodeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnNewProperties extends js.Object {
  def apply(path: List[Double], newProperties: String): Editor = js.native
  def apply(path: List[Double], newProperties: InlineProperties): Controller = js.native
  def apply(path: List[Double], newProperties: NodeProperties): Editor = js.native
}

