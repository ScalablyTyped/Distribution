package typings.rcVirtualList.useFrameWheelMod

import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-virtual-list/es/hooks/useFrameWheel", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(
    inVirtual: Boolean,
    isScrollAtTop: Boolean,
    isScrollAtBottom: Boolean,
    onWheelDelta: js.Function1[/* offset */ Double, Unit]
  ): js.Tuple2[
    js.Function1[/* e */ WheelEvent, Unit], 
    js.Function1[/* e */ FireFoxDOMMouseScrollEvent, Unit]
  ] = js.native
}
