package typings.slateDashReact

import typings.immutable.Immutable.List
import typings.slate.slateMod.Editor
import typings.slate.slateMod.Mark
import typings.slate.slateMod.MarkJSON
import typings.slate.slateMod.MarkProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Length extends js.Object {
  def apply(path: List[Double], offset: Double, length: Double, mark: String): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, mark: Mark): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, mark: MarkJSON): Editor = js.native
  def apply(path: List[Double], offset: Double, length: Double, mark: MarkProperties): Editor = js.native
}

