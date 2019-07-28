package typings.slateDashReact

import typings.slate.slateMod.Block
import typings.slate.slateMod.BlockProperties
import typings.slate.slateMod.Editor
import typings.slate.slateMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BlockRange extends js.Object {
  def apply(range: Range, block: String): Editor = js.native
  def apply(range: Range, block: Block): Editor = js.native
  def apply(range: Range, block: BlockProperties): Editor = js.native
}

