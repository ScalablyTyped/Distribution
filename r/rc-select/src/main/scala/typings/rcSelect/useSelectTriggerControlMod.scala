package typings.rcSelect

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSelectTriggerControlMod {
  
  @JSImport("rc-select/lib/hooks/useSelectTriggerControl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    elements: js.Function0[js.Array[js.UndefOr[HTMLElement]]],
    open: Boolean,
    triggerOpen: js.Function1[/* open */ Boolean, Unit],
    customizedTrigger: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elements.asInstanceOf[js.Any], open.asInstanceOf[js.Any], triggerOpen.asInstanceOf[js.Any], customizedTrigger.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
