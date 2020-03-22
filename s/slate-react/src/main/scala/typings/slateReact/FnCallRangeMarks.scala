package typings.slateReact

import typings.immutable.Immutable.Set_
import typings.slate.mod.Editor
import typings.slate.mod.Mark
import typings.slate.mod.MarkJSON
import typings.slate.mod.MarkProperties
import typings.slate.mod.RangeType
import typings.slate.mod.RangeTypeJSON
import typings.slate.mod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallRangeMarks extends js.Object {
  def apply(range: RangeTypeJSON, marks: js.Array[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeTypeJSON, marks: Set_[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeTypeProperties, marks: js.Array[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeTypeProperties, marks: Set_[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeType, marks: js.Array[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeType, marks: Set_[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
}

