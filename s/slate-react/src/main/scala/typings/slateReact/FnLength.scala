package typings.slateReact

import typings.immutable.Immutable.List
import typings.slate.mod.Editor
import typings.slate.mod.Mark
import typings.slate.mod.MarkJSON
import typings.slate.mod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnLength extends js.Object {
  def apply(path: List[Double], offset: Double, length: Double, mark: String): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, mark: Mark): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, mark: MarkJSON): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, mark: MarkProperties): Editor = js.native
}

