package typings.slateReact

import typings.slate.mod.Editor
import typings.slate.mod.Mark
import typings.slate.mod.MarkJSON
import typings.slate.mod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallMarkNewMark extends js.Object {
  def apply(mark: String, newMark: String): Editor = js.native
  def apply(mark: String, newMark: Mark): Editor = js.native
  def apply(mark: String, newMark: MarkJSON): Editor = js.native
  def apply(mark: String, newMark: MarkProperties): Editor = js.native
  def apply(mark: MarkJSON, newMark: String): Editor = js.native
  def apply(mark: MarkJSON, newMark: Mark): Editor = js.native
  def apply(mark: MarkJSON, newMark: MarkJSON): Editor = js.native
  def apply(mark: MarkJSON, newMark: MarkProperties): Editor = js.native
  def apply(mark: MarkProperties, newMark: String): Editor = js.native
  def apply(mark: MarkProperties, newMark: Mark): Editor = js.native
  def apply(mark: MarkProperties, newMark: MarkJSON): Editor = js.native
  def apply(mark: MarkProperties, newMark: MarkProperties): Editor = js.native
  def apply(mark: Mark, newMark: String): Editor = js.native
  def apply(mark: Mark, newMark: Mark): Editor = js.native
  def apply(mark: Mark, newMark: MarkJSON): Editor = js.native
  def apply(mark: Mark, newMark: MarkProperties): Editor = js.native
}

