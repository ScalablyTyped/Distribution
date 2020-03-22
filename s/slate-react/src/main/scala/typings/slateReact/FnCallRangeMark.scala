package typings.slateReact

import typings.slate.mod.Editor
import typings.slate.mod.Mark
import typings.slate.mod.MarkProperties
import typings.slate.mod.RangeType
import typings.slate.mod.RangeTypeJSON
import typings.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeMark extends js.Object {
  def apply(range: RangeTypeJSON, mark: String): Editor = js.native
  def apply(range: RangeTypeJSON, mark: Mark): Editor = js.native
  def apply(range: RangeTypeJSON, mark: MarkProperties): Editor = js.native
  def apply(range: RangeTypeProperties, mark: String): Editor = js.native
  def apply(range: RangeTypeProperties, mark: Mark): Editor = js.native
  def apply(range: RangeTypeProperties, mark: MarkProperties): Editor = js.native
  def apply(range: RangeType, mark: String): Editor = js.native
  def apply(range: RangeType, mark: Mark): Editor = js.native
  def apply(range: RangeType, mark: MarkProperties): Editor = js.native
}

