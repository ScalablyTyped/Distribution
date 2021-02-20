package typings.rcVirtualList

import typings.rcVirtualList.interfaceMod.GetKey
import typings.rcVirtualList.listMod.ScrollTo
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useScrollToMod {
  
  @JSImport("rc-virtual-list/es/hooks/useScrollTo", JSImport.Default)
  @js.native
  def default[T](
    containerRef: RefObject[HTMLDivElement],
    data: js.Array[T],
    heights: typings.rcVirtualList.cacheMapMod.default,
    itemHeight: Double,
    getKey: GetKey[T],
    collectHeight: js.Function0[Unit],
    syncScrollTop: js.Function1[/* newTop */ Double, Unit],
    triggerFlash: js.Function0[Unit]
  ): ScrollTo = js.native
}
