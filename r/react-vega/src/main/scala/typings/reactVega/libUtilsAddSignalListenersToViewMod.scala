package typings.reactVega

import typings.reactVega.libTypesMod.SignalListeners
import typings.reactVega.libTypesMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsAddSignalListenersToViewMod {
  
  @JSImport("react-vega/lib/utils/addSignalListenersToView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(view: View, signalListeners: SignalListeners): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(view.asInstanceOf[js.Any], signalListeners.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
