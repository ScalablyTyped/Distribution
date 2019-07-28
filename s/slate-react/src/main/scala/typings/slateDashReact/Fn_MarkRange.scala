package typings.slateDashReact

import typings.slate.slateMod.Editor
import typings.slate.slateMod.Mark
import typings.slate.slateMod.MarkProperties
import typings.slate.slateMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_MarkRange extends js.Object {
  def apply(range: Range, mark: String): Editor = js.native
  def apply(range: Range, mark: Mark): Editor = js.native
  def apply(range: Range, mark: MarkProperties): Editor = js.native
}

