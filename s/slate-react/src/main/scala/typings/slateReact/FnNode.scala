package typings.slateReact

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
trait FnNode extends js.Object {
  def apply(node: Block): Editor = js.native
  def apply(node: Document): Editor = js.native
  def apply(node: Inline): Editor = js.native
  def apply(node: Node): Controller = js.native
  def apply(node: Text): Editor = js.native
}

