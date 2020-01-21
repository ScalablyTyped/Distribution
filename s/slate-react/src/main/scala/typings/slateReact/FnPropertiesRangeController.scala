package typings.slateReact

import typings.slate.mod.Editor
import typings.slate.mod.Inline
import typings.slate.mod.InlineJSON
import typings.slate.mod.InlineProperties
import typings.slate.mod.RangeType
import typings.slate.mod.RangeTypeJSON
import typings.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnPropertiesRangeController extends js.Object {
  def apply(range: RangeTypeJSON, properties: String): Editor = js.native
  def apply(range: RangeTypeJSON, properties: Inline): Editor = js.native
  def apply(range: RangeTypeJSON, properties: InlineJSON): Editor = js.native
  def apply(range: RangeTypeJSON, properties: InlineProperties): Editor = js.native
  def apply(range: RangeTypeProperties, properties: String): Editor = js.native
  def apply(range: RangeTypeProperties, properties: Inline): Editor = js.native
  def apply(range: RangeTypeProperties, properties: InlineJSON): Editor = js.native
  def apply(range: RangeTypeProperties, properties: InlineProperties): Editor = js.native
  def apply(range: RangeType, properties: String): Editor = js.native
  def apply(range: RangeType, properties: Inline): Editor = js.native
  def apply(range: RangeType, properties: InlineJSON): Editor = js.native
  def apply(range: RangeType, properties: InlineProperties): Editor = js.native
}

