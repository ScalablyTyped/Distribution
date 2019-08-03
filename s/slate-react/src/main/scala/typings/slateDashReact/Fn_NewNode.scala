package typings.slateDashReact

import typings.immutable.immutableMod.List
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
trait Fn_NewNode extends js.Object {
  def apply(path: List[Double], newNode: Block): Editor = js.native
  def apply(path: List[Double], newNode: Document): Editor = js.native
  def apply(path: List[Double], newNode: Inline): Editor = js.native
  def apply(path: List[Double], newNode: Node): Controller = js.native
  def apply(path: List[Double], newNode: Text): Editor = js.native
}

