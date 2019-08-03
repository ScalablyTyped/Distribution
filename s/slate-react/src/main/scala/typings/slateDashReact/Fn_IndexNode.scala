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
trait Fn_IndexNode extends js.Object {
  def apply(path: List[Double], index: Double, node: Block): Editor = js.native
  def apply(path: List[Double], index: Double, node: Document): Editor = js.native
  def apply(path: List[Double], index: Double, node: Inline): Editor = js.native
  def apply(path: List[Double], index: Double, node: Node): Controller = js.native
  def apply(path: List[Double], index: Double, node: Text): Editor = js.native
}

