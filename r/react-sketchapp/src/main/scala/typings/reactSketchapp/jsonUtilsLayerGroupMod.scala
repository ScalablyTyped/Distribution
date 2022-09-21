package typings.reactSketchapp

import typings.reactSketchapp.moduleTypesMod.ResizeConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonUtilsLayerGroupMod {
  
  @JSImport("react-sketchapp/lib/module/jsonUtils/layerGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def layerGroup(x: Double, y: Double, width: Double, height: Double, opacity: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def layerGroup(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    opacity: Double,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("layerGroup")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
}
