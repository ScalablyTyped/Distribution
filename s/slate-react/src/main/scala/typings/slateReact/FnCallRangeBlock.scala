package typings.slateReact

import typings.slate.mod.Block
import typings.slate.mod.BlockJSON
import typings.slate.mod.BlockProperties
import typings.slate.mod.Editor
import typings.slate.mod.RangeType
import typings.slate.mod.RangeTypeJSON
import typings.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeBlock extends js.Object {
  def apply(range: RangeTypeJSON, block: String): Editor = js.native
  def apply(range: RangeTypeJSON, block: Block): Editor = js.native
  def apply(range: RangeTypeJSON, block: BlockJSON): Editor = js.native
  def apply(range: RangeTypeJSON, block: BlockProperties): Editor = js.native
  def apply(range: RangeTypeProperties, block: String): Editor = js.native
  def apply(range: RangeTypeProperties, block: Block): Editor = js.native
  def apply(range: RangeTypeProperties, block: BlockJSON): Editor = js.native
  def apply(range: RangeTypeProperties, block: BlockProperties): Editor = js.native
  def apply(range: RangeType, block: String): Editor = js.native
  def apply(range: RangeType, block: Block): Editor = js.native
  def apply(range: RangeType, block: BlockJSON): Editor = js.native
  def apply(range: RangeType, block: BlockProperties): Editor = js.native
}

