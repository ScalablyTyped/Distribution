package typings.reactSketchapp

import typings.reactSketchapp.libTypesMod.TextStyle
import typings.reactSketchapp.libTypesMod.ViewStyle
import typings.reactSketchapp.reactSketchappStrings.dashed
import typings.reactSketchapp.reactSketchappStrings.dotted
import typings.reactSketchapp.reactSketchappStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonUtilsStyleMod {
  
  @JSImport("react-sketchapp/lib/jsonUtils/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeBorderOptions(style: dashed | dotted | solid, width: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBorderOptions")(style.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeBorderOptions(
    style: dashed | dotted | solid,
    width: Double,
    lineCapStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.LineCapStyle */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBorderOptions")(style.asInstanceOf[js.Any], width.asInstanceOf[js.Any], lineCapStyle.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeBorderOptions(
    style: dashed | dotted | solid,
    width: Double,
    lineCapStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.LineCapStyle */ Any,
    lineJoinStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.LineJoinStyle */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBorderOptions")(style.asInstanceOf[js.Any], width.asInstanceOf[js.Any], lineCapStyle.asInstanceOf[js.Any], lineJoinStyle.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeBorderOptions(
    style: dashed | dotted | solid,
    width: Double,
    lineCapStyle: Unit,
    lineJoinStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.LineJoinStyle */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBorderOptions")(style.asInstanceOf[js.Any], width.asInstanceOf[js.Any], lineCapStyle.asInstanceOf[js.Any], lineJoinStyle.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeBorderOptions(style: Null, width: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBorderOptions")(style.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeBorderOptions(
    style: Null,
    width: Double,
    lineCapStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.LineCapStyle */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBorderOptions")(style.asInstanceOf[js.Any], width.asInstanceOf[js.Any], lineCapStyle.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeBorderOptions(
    style: Null,
    width: Double,
    lineCapStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.LineCapStyle */ Any,
    lineJoinStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.LineJoinStyle */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBorderOptions")(style.asInstanceOf[js.Any], width.asInstanceOf[js.Any], lineCapStyle.asInstanceOf[js.Any], lineJoinStyle.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeBorderOptions(
    style: Null,
    width: Double,
    lineCapStyle: Unit,
    lineJoinStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.LineJoinStyle */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBorderOptions")(style.asInstanceOf[js.Any], width.asInstanceOf[js.Any], lineCapStyle.asInstanceOf[js.Any], lineJoinStyle.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeBorderOptions(style: Unit, width: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBorderOptions")(style.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeBorderOptions(
    style: Unit,
    width: Double,
    lineCapStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.LineCapStyle */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBorderOptions")(style.asInstanceOf[js.Any], width.asInstanceOf[js.Any], lineCapStyle.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeBorderOptions(
    style: Unit,
    width: Double,
    lineCapStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.LineCapStyle */ Any,
    lineJoinStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.LineJoinStyle */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBorderOptions")(style.asInstanceOf[js.Any], width.asInstanceOf[js.Any], lineCapStyle.asInstanceOf[js.Any], lineJoinStyle.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeBorderOptions(
    style: Unit,
    width: Double,
    lineCapStyle: Unit,
    lineJoinStyle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.LineJoinStyle */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBorderOptions")(style.asInstanceOf[js.Any], width.asInstanceOf[js.Any], lineCapStyle.asInstanceOf[js.Any], lineJoinStyle.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeShadow(style: TextStyle | ViewStyle): /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Shadow */ Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeShadow")(style.asInstanceOf[js.Any]).asInstanceOf[/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Shadow */ Any]
  
  inline def makeStyle(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyle")().asInstanceOf[Any]
  inline def makeStyle(style: TextStyle | ViewStyle): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyle")(style.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def makeStyle(
    style: TextStyle | ViewStyle,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyle")(style.asInstanceOf[js.Any], fills.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeStyle(
    style: TextStyle | ViewStyle,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ],
    shadowsProp: js.Array[js.UndefOr[Null | ViewStyle]]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyle")(style.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], shadowsProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeStyle(style: TextStyle | ViewStyle, fills: Unit, shadowsProp: js.Array[js.UndefOr[Null | ViewStyle]]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyle")(style.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], shadowsProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeStyle(
    style: Unit,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyle")(style.asInstanceOf[js.Any], fills.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeStyle(
    style: Unit,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ],
    shadowsProp: js.Array[js.UndefOr[ViewStyle | Null]]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyle")(style.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], shadowsProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeStyle(style: Unit, fills: Unit, shadowsProp: js.Array[js.UndefOr[ViewStyle | Null]]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyle")(style.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], shadowsProp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseStyle(
    json: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Style */ Any
  ): ViewStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStyle")(json.asInstanceOf[js.Any]).asInstanceOf[ViewStyle]
}
