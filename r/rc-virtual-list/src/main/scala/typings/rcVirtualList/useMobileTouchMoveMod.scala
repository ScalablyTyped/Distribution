package typings.rcVirtualList

import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-virtual-list/es/hooks/useMobileTouchMove", JSImport.Namespace)
@js.native
object useMobileTouchMoveMod extends js.Object {
  
  def default(
    inVirtual: Boolean,
    listRef: RefObject[HTMLDivElement],
    callback: js.Function2[/* offsetY */ Double, /* smoothOffset */ js.UndefOr[Boolean], Boolean]
  ): Unit = js.native
}
