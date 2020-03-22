package typings.slateReact

import typings.immutable.Immutable.List
import typings.slate.mod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathN extends js.Object {
  def apply(path: String): Editor = js.native
  def apply(path: String, n: Double): Editor = js.native
  def apply(path: Double): Editor = js.native
  def apply(path: Double, n: Double): Editor = js.native
  def apply(path: List[Double]): Editor = js.native
  def apply(path: List[Double], n: Double): Editor = js.native
}

