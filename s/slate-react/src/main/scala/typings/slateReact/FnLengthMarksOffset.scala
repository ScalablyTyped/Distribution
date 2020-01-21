package typings.slateReact

import typings.immutable.Immutable.List
import typings.immutable.Immutable.Set_
import typings.slate.mod.Editor
import typings.slate.mod.Mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnLengthMarksOffset extends js.Object {
  def apply(path: List[Double], offset: Double, length: Double, text: String): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, text: String, marks: js.Array[Mark]): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, text: String, marks: Set_[Mark]): Editor = js.native
}

