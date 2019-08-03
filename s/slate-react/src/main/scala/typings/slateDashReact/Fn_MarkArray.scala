package typings.slateDashReact

import typings.slate.slateMod.Editor
import typings.slate.slateMod.Mark
import typings.slate.slateMod.MarkJSON
import typings.slate.slateMod.MarkProperties
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_MarkArray extends js.Object {
  def apply(mark: js.Array[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
  def apply(mark: Set[String | MarkProperties | MarkJSON | Mark]): Editor = js.native
}

