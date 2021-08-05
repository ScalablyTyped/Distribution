package typings.rcVirtualList

import typings.rcVirtualList.interfaceMod.RenderFunc
import typings.rcVirtualList.interfaceMod.SharedConfig
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useChildrenMod {
  
  @JSImport("rc-virtual-list/es/hooks/useChildren", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](
    list: js.Array[T],
    startIndex: Double,
    endIndex: Double,
    setNodeRef: js.Function2[/* item */ T, /* element */ HTMLElement, Unit],
    renderFunc: RenderFunc[T],
    hasGetKey: SharedConfig[T]
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(list.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], endIndex.asInstanceOf[js.Any], setNodeRef.asInstanceOf[js.Any], renderFunc.asInstanceOf[js.Any], hasGetKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
}
