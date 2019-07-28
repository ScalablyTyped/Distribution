package typings.reactDashSelect

import typings.react.reactMod.Ref
import typings.reactDashSelect.srcTypesMod.ClassNamesState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_A extends js.Object {
  var className: js.UndefOr[String] = js.native
  /** Whether the input is disabled */
  var isDisabled: js.UndefOr[Boolean] = js.native
  /** Set whether the input should be visible. Does not affect input size. */
  var isHidden: Boolean = js.native
  def cx(a: String, b: ClassNamesState, c: String): String | Unit = js.native
  def cx(a: Null, b: ClassNamesState, c: String): String | Unit = js.native
  /** Reference to the internal element */
  def innerRef(element: Ref[_]): Unit = js.native
}

