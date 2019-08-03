package typings.slateDashReact

import typings.slate.slateMod.Block
import typings.slate.slateMod.BlockJSON
import typings.slate.slateMod.BlockProperties
import typings.slate.slateMod.Editor
import typings.slate.slateMod.RangeType
import typings.slate.slateMod.RangeTypeJSON
import typings.slate.slateMod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BlockRange extends js.Object {
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

