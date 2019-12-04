package typings.slateDashReact

import typings.immutable.Immutable.List
import typings.immutable.Immutable.Set
import typings.slate.slateMod.Editor
import typings.slate.slateMod.Mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_LengthMarksOffset extends js.Object {
  def apply(path: List[Double], offset: Double, length: Double, text: String): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, text: String, marks: js.Array[Mark]): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, text: String, marks: Set[Mark]): Editor = js.native
}

