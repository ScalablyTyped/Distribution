package typings.rcMotion

import typings.rcMotion.interfaceMod.MotionEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDomMotionEventsMod {
  
  @JSImport("rc-motion/es/hooks/useDomMotionEvents", JSImport.Default)
  @js.native
  def default(callback: js.Function1[/* event */ MotionEvent, Unit]): js.Tuple2[
    js.Function1[/* element */ HTMLElement, Unit], 
    js.Function1[/* element */ HTMLElement, Unit]
  ] = js.native
}
