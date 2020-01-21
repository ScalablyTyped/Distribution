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
trait FnKeyParent extends js.Object {
  def apply(key: String, parent: Block): Editor = js.native
  def apply(key: String, parent: Document): Editor = js.native
  def apply(key: String, parent: Inline): Editor = js.native
  def apply(key: String, parent: Node): Controller = js.native
  def apply(key: String, parent: Text): Editor = js.native
}

