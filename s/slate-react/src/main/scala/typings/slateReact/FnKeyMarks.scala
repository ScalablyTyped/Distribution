package typings.slateReact

import typings.immutable.Immutable.Set_
import typings.slate.mod.Editor
import typings.slate.mod.Mark
import typings.slate.mod.MarkJSON
import typings.slate.mod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnKeyMarks extends js.Object {
  def apply(key: String, offset: Double, text: String): Editor = js.native
  def apply(
    key: String,
    offset: Double,
    text: String,
    marks: js.Array[String | MarkProperties | MarkJSON | Mark]
  ): Editor = js.native
  def apply(key: String, offset: Double, text: String, marks: Set_[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
}

