package typings.reactLeafletCore

import typings.leaflet.mod.GridLayerOptions
import typings.leaflet.mod.GridLayer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridLayerMod {
  
  @JSImport("@react-leaflet/core/lib/grid-layer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateGridLayer[E /* <: GridLayer_ */, P /* <: GridLayerOptions */](layer: E, props: P, prevProps: P): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateGridLayer")(layer.asInstanceOf[js.Any], props.asInstanceOf[js.Any], prevProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
