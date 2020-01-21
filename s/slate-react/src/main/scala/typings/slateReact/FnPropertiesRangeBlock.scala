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
trait FnPropertiesRangeBlock extends js.Object {
  def apply(range: RangeTypeJSON, properties: String): Editor = js.native
  def apply(range: RangeTypeJSON, properties: Block): Editor = js.native
  def apply(range: RangeTypeJSON, properties: BlockJSON): Editor = js.native
  def apply(range: RangeTypeJSON, properties: BlockProperties): Editor = js.native
  def apply(range: RangeTypeProperties, properties: String): Editor = js.native
  def apply(range: RangeTypeProperties, properties: Block): Editor = js.native
  def apply(range: RangeTypeProperties, properties: BlockJSON): Editor = js.native
  def apply(range: RangeTypeProperties, properties: BlockProperties): Editor = js.native
  def apply(range: RangeType, properties: String): Editor = js.native
  def apply(range: RangeType, properties: Block): Editor = js.native
  def apply(range: RangeType, properties: BlockJSON): Editor = js.native
  def apply(range: RangeType, properties: BlockProperties): Editor = js.native
}

