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
trait FnInlineRange extends js.Object {
  def apply(range: RangeTypeJSON, `inline`: Inline): Editor = js.native
  def apply(range: RangeTypeJSON, `inline`: InlineJSON): Editor = js.native
  def apply(range: RangeTypeJSON, `inline`: InlineProperties): Editor = js.native
  def apply(range: RangeTypeProperties, `inline`: Inline): Editor = js.native
  def apply(range: RangeTypeProperties, `inline`: InlineJSON): Editor = js.native
  def apply(range: RangeTypeProperties, `inline`: InlineProperties): Editor = js.native
  def apply(range: RangeType, `inline`: Inline): Editor = js.native
  def apply(range: RangeType, `inline`: InlineJSON): Editor = js.native
  def apply(range: RangeType, `inline`: InlineProperties): Editor = js.native
}

