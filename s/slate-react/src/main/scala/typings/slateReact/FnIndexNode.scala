package typings.slateReact

import typings.immutable.Immutable.List
import typings.slate.mod.Block
import typings.slate.mod.Controller
import typings.slate.mod.Document
import typings.slate.mod.Editor
import typings.slate.mod.Inline
import typings.slate.mod.Node
import typings.slate.mod.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnIndexNode extends js.Object {
  def apply(path: List[Double], index: Double, node: Block): Editor = js.native
  def apply(path: List[Double], index: Double, node: Document): Editor = js.native
  def apply(path: List[Double], index: Double, node: Inline): Editor = js.native
  def apply(path: List[Double], index: Double, node: Node): Controller = js.native
  def apply(path: List[Double], index: Double, node: Text): Editor = js.native
}

