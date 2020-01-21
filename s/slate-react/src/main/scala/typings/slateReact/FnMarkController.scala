package typings.slateReact

import typings.slate.mod.Editor
import typings.slate.mod.Mark
import typings.slate.mod.MarkJSON
import typings.slate.mod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnMarkController extends js.Object {
  def apply(mark: String): Editor = js.native
  def apply(mark: Mark): Editor = js.native
  def apply(mark: MarkJSON): Editor = js.native
  def apply(mark: MarkProperties): Editor = js.native
}

