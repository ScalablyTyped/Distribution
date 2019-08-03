package typings.slateDashReact

import typings.slate.slateMod.Block
import typings.slate.slateMod.Controller
import typings.slate.slateMod.Document
import typings.slate.slateMod.Editor
import typings.slate.slateMod.Inline
import typings.slate.slateMod.Node
import typings.slate.slateMod.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_KeyNode extends js.Object {
  def apply(key: String, node: Block): Editor = js.native
  def apply(key: String, node: Document): Editor = js.native
  def apply(key: String, node: Inline): Editor = js.native
  def apply(key: String, node: Node): Controller = js.native
  def apply(key: String, node: Text): Editor = js.native
}

