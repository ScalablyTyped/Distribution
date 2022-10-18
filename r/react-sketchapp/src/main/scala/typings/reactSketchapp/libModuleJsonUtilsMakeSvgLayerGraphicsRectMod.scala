package typings.reactSketchapp

import typings.reactSketchapp.libModuleJsonUtilsMakeSvgLayerGraphicsTypesMod.Point
import typings.reactSketchapp.libModuleJsonUtilsMakeSvgLayerGraphicsTypesMod.Size
import typings.reactSketchapp.reactSketchappStrings.contain
import typings.reactSketchapp.reactSketchappStrings.cover
import typings.reactSketchapp.reactSketchappStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleJsonUtilsMakeSvgLayerGraphicsRectMod {
  
  @JSImport("react-sketchapp/lib/module/jsonUtils/makeSvgLayer/graphics/rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeBoundingRectFromCommands(commands: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeBoundingRectFromCommands")(commands.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def makeBoundingRectFromPoints(points: js.Array[Point]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeBoundingRectFromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def resize(source: Size, destination: Size, resizingMode: cover | contain | stretch): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], resizingMode.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def scaleRect(
    rect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    scale: Double
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleRect")(rect.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def unionRects(
    rects: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any)*
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unionRects")(rects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
}
