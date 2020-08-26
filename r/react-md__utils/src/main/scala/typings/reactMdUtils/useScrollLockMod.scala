package typings.reactMdUtils

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/wia-aria/useScrollLock", JSImport.Namespace)
@js.native
object useScrollLockMod extends js.Object {
  val DATA_RMD_NOSCROLL: /* "data-rmd-noscroll" */ String = js.native
  def default(enabled: Boolean): Unit = js.native
  def default(enabled: Boolean, selectorOrElement: String): Unit = js.native
  def default(enabled: Boolean, selectorOrElement: js.Function0[HTMLElement]): Unit = js.native
  def default(enabled: Boolean, selectorOrElement: HTMLElement): Unit = js.native
  def disable(element: HTMLElement): Unit = js.native
  def enable(element: HTMLElement): Unit = js.native
}

