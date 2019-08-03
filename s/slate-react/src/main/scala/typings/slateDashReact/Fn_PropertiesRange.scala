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
trait Fn_PropertiesRange extends js.Object {
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

