package typings.slateReact

import typings.slate.mod.Editor
import typings.slate.mod.Mark
import typings.slate.mod.MarkJSON
import typings.slate.mod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnKey extends js.Object {
  def apply(key: String, offset: Double, length: Double, mark: String): Editor = js.native
  def apply(key: String, offset: Double, length: Double, mark: Mark): Editor = js.native
  def apply(key: String, offset: Double, length: Double, mark: MarkJSON): Editor = js.native
  def apply(key: String, offset: Double, length: Double, mark: MarkProperties): Editor = js.native
}

