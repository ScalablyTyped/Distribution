package typings.reactLeafletCore

import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.Control_
import typings.reactLeafletCore.libElementMod.ElementHook
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libControlMod {
  
  @JSImport("@react-leaflet/core/lib/control", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createControlHook[E /* <: Control_ */, P /* <: ControlOptions */](useElement: ElementHook[E, P]): js.Function1[/* props */ P, ReturnType[ElementHook[E, P]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createControlHook")(useElement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ P, ReturnType[ElementHook[E, P]]]]
}
