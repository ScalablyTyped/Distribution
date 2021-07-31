package typings.rcVirtualList

import typings.rcVirtualList.interfaceMod.GetKey
import typings.rcVirtualList.listMod.ScrollTo
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useScrollToMod {
  
  @JSImport("rc-virtual-list/es/hooks/useScrollTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](
    containerRef: RefObject[HTMLDivElement],
    data: js.Array[T],
    heights: typings.rcVirtualList.cacheMapMod.default,
    itemHeight: Double,
    getKey: GetKey[T],
    collectHeight: js.Function0[Unit],
    syncScrollTop: js.Function1[/* newTop */ Double, Unit],
    triggerFlash: js.Function0[Unit]
  ): ScrollTo = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(containerRef.asInstanceOf[js.Any], data.asInstanceOf[js.Any], heights.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], getKey.asInstanceOf[js.Any], collectHeight.asInstanceOf[js.Any], syncScrollTop.asInstanceOf[js.Any], triggerFlash.asInstanceOf[js.Any])).asInstanceOf[ScrollTo]
}
