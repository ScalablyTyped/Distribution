package typings.slateReact

import typings.slate.mod.Block
import typings.slate.mod.BlockJSON
import typings.slate.mod.BlockProperties
import typings.slate.mod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallBlock extends js.Object {
  def apply(block: String): Editor = js.native
  def apply(block: Block): Editor = js.native
  def apply(block: BlockJSON): Editor = js.native
  def apply(block: BlockProperties): Editor = js.native
}

