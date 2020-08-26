package typings.rcTabs

import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tabs/es/hooks/useTouchMove", JSImport.Namespace)
@js.native
object useTouchMoveMod extends js.Object {
  def default(
    ref: RefObject[HTMLDivElement],
    onOffset: js.Function2[/* offsetX */ Double, /* offsetY */ Double, Boolean]
  ): Unit = js.native
  def isMobile(): Boolean = js.native
}

