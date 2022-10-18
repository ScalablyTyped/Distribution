package typings.reactSketchapp

import typings.reactSketchapp.libModuleJsonUtilsMakeSvgLayerGraphicsTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleJsonUtilsMakeSvgLayerGraphicsPointMod {
  
  @JSImport("react-sketchapp/lib/module/jsonUtils/makeSvgLayer/graphics/point", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizePointInRect(
    point: Point,
    rect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any
  ): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizePointInRect")(point.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Point]
}
