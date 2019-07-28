package typings.slateDashReact

import typings.immutable.immutableMod.Set
import typings.slate.slateMod.Editor
import typings.slate.slateMod.Mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_KeyMarks extends js.Object {
  def apply(key: String, offset: Double, text: String): Editor = js.native
  def apply(key: String, offset: Double, text: String, marks: js.Array[Mark]): Editor = js.native
  def apply(key: String, offset: Double, text: String, marks: Set[Mark]): Editor = js.native
}

