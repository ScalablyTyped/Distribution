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
trait Fn_KeyParent extends js.Object {
  def apply(key: String, parent: Block): Editor = js.native
  def apply(key: String, parent: Document): Editor = js.native
  def apply(key: String, parent: Inline): Editor = js.native
  def apply(key: String, parent: Node): Controller = js.native
  def apply(key: String, parent: Text): Editor = js.native
}

