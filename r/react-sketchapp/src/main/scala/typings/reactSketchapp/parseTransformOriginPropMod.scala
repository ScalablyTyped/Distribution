package typings.reactSketchapp

import typings.reactSketchapp.moduleTypesMod.LayoutInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseTransformOriginPropMod {
  
  @JSImport("react-sketchapp/lib/module/utils/processTransform/parseTransformOriginProp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseTransformOriginProp(layout: LayoutInfo): js.Tuple3[Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTransformOriginProp")(layout.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, Double, Double]]
  inline def parseTransformOriginProp(layout: LayoutInfo, _origin: String): js.Tuple3[Double, Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTransformOriginProp")(layout.asInstanceOf[js.Any], _origin.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Double, Double, Double]]
}
