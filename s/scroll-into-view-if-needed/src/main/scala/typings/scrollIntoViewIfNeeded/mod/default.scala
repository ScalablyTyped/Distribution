package typings.scrollIntoViewIfNeeded.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scroll-into-view-if-needed", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(target: Element): Unit = js.native
  def apply(target: Element, options: Boolean): Unit = js.native
  def apply(target: Element, options: Options[_]): Unit = js.native
  def apply[T](target: Element, options: CustomBehaviorOptions[T]): T = js.native
}

