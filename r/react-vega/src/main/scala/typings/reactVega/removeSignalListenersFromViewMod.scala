package typings.reactVega

import typings.reactVega.typesMod.SignalListeners
import typings.reactVega.typesMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object removeSignalListenersFromViewMod {
  
  @JSImport("react-vega/lib/utils/removeSignalListenersFromView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(view: View, signalListeners: SignalListeners): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(view.asInstanceOf[js.Any], signalListeners.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
