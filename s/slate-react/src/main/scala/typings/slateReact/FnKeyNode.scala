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
trait FnKeyNode extends js.Object {
  def apply(key: String, node: Block): Editor = js.native
  def apply(key: String, node: Document): Editor = js.native
  def apply(key: String, node: Inline): Editor = js.native
  def apply(key: String, node: Node): Controller = js.native
  def apply(key: String, node: Text): Editor = js.native
}

