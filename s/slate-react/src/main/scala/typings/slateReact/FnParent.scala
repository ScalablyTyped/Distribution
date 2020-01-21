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
trait FnParent extends js.Object {
  def apply(path: List[Double], parent: Block): Editor = js.native
  def apply(path: List[Double], parent: Document): Editor = js.native
  def apply(path: List[Double], parent: Inline): Editor = js.native
  def apply(path: List[Double], parent: Node): Controller = js.native
  def apply(path: List[Double], parent: Text): Editor = js.native
}

