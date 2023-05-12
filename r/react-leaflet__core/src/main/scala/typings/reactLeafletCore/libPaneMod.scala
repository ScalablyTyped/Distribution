package typings.reactLeafletCore

import typings.leaflet.mod.LayerOptions
import typings.reactLeafletCore.libContextMod.LeafletContextInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaneMod {
  
  @JSImport("@react-leaflet/core/lib/pane", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withPane[P /* <: LayerOptions */](props: P, context: LeafletContextInterface): P = (^.asInstanceOf[js.Dynamic].applyDynamic("withPane")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[P]
}
