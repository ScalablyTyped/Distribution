package typings.slateDashReact

import typings.immutable.immutableMod.List
import typings.immutable.immutableMod.Set
import typings.slate.slateMod.Editor
import typings.slate.slateMod.Mark
import typings.slate.slateMod.MarkJSON
import typings.slate.slateMod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_LengthMarks extends js.Object {
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    marks: js.Array[String | MarkProperties | MarkJSON | Mark]
  ): Editor = js.native
  def apply(
    path: List[Double],
    offset: Double,
    length: Double,
    marks: Set[String | MarkProperties | MarkJSON | Mark]
  ): Editor = js.native
}

