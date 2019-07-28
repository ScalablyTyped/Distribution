package typings.slateDashReact

import typings.slate.slateMod.Editor
import typings.slate.slateMod.Mark
import typings.slate.slateMod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_MarkNewMark extends js.Object {
  def apply(mark: String, newMark: String): Editor = js.native
  def apply(mark: String, newMark: Mark): Editor = js.native
  def apply(mark: String, newMark: MarkProperties): Editor = js.native
  def apply(mark: MarkProperties, newMark: String): Editor = js.native
  def apply(mark: MarkProperties, newMark: Mark): Editor = js.native
  def apply(mark: MarkProperties, newMark: MarkProperties): Editor = js.native
  def apply(mark: Mark, newMark: String): Editor = js.native
  def apply(mark: Mark, newMark: Mark): Editor = js.native
  def apply(mark: Mark, newMark: MarkProperties): Editor = js.native
}

