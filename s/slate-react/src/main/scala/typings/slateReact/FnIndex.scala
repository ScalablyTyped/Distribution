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
trait FnIndex extends js.Object {
  def apply(key: String, index: Double, node: Block): Editor = js.native
  def apply(key: String, index: Double, node: Document): Editor = js.native
  def apply(key: String, index: Double, node: Inline): Editor = js.native
  def apply(key: String, index: Double, node: Node): Controller = js.native
  def apply(key: String, index: Double, node: Text): Editor = js.native
}

