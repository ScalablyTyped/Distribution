package typings.rcTabs

import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTouchMoveMod {
  
  @JSImport("rc-tabs/es/hooks/useTouchMove", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    ref: RefObject[HTMLDivElement],
    onOffset: js.Function2[/* offsetX */ Double, /* offsetY */ Double, Boolean]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], onOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
