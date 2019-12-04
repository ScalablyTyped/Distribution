package typings.slateDashReact

import typings.immutable.Immutable.Set
import typings.slate.slateMod.Editor
import typings.slate.slateMod.Mark
import typings.slate.slateMod.MarkJSON
import typings.slate.slateMod.MarkProperties
import typings.slate.slateMod.RangeType
import typings.slate.slateMod.RangeTypeJSON
import typings.slate.slateMod.RangeTypeProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Marks extends js.Object {
  def apply(range: RangeTypeJSON, marks: js.Array[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeTypeJSON, marks: Set[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeTypeProperties, marks: js.Array[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeTypeProperties, marks: Set[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeType, marks: js.Array[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(range: RangeType, marks: Set[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
}

