package typings.reactSketchapp

import typings.reactSketchapp.anon.PickanyisClosedpoints
import typings.reactSketchapp.libTypesMod.ResizeConstraints
import typings.reactSketchapp.libTypesMod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonUtilsShapeLayersMod {
  
  @JSImport("react-sketchapp/lib/jsonUtils/shapeLayers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeHorizontalBorder(x: Double, y: Double, length: Double, thickness: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeHorizontalBorder")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], length.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeHorizontalBorder(x: Double, y: Double, length: Double, thickness: Double, color: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeHorizontalBorder")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], length.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeHorizontalBorder(x: Double, y: Double, length: Double, thickness: Double, color: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeHorizontalBorder")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], length.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeHorizontalPath(): PickanyisClosedpoints = ^.asInstanceOf[js.Dynamic].applyDynamic("makeHorizontalPath")().asInstanceOf[PickanyisClosedpoints]
  
  inline def makeRectPath(): PickanyisClosedpoints = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRectPath")().asInstanceOf[PickanyisClosedpoints]
  inline def makeRectPath(radii: Radii): PickanyisClosedpoints = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRectPath")(radii.asInstanceOf[js.Any]).asInstanceOf[PickanyisClosedpoints]
  
  inline def makeRectShapeLayer(x: Double, y: Double, width: Double, height: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRectShapeLayer")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeRectShapeLayer(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    radii: Unit,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRectShapeLayer")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], radii.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeRectShapeLayer(x: Double, y: Double, width: Double, height: Double, radii: Radii): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRectShapeLayer")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], radii.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeRectShapeLayer(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    radii: Radii,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRectShapeLayer")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], radii.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: Unit,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: Unit,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]],
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: Unit,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]],
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ],
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: Unit,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]],
    fills: Unit,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: Unit,
    shadows: Null,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: Unit,
    shadows: Null,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ],
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: Unit,
    shadows: Null,
    fills: Unit,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: Unit,
    shadows: Unit,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: Unit,
    shadows: Unit,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ],
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: Unit,
    shadows: Unit,
    fills: Unit,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: ViewStyle
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: ViewStyle,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: ViewStyle,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]],
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: ViewStyle,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]],
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ],
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: ViewStyle,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]],
    fills: Unit,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: ViewStyle,
    shadows: Null,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: ViewStyle,
    shadows: Null,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ],
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: ViewStyle,
    shadows: Null,
    fills: Unit,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: ViewStyle,
    shadows: Unit,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: ViewStyle,
    shadows: Unit,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ],
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SymbolMaster */ Any
    ],
    style: ViewStyle,
    shadows: Unit,
    fills: Unit,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: Unit,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: Unit,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]],
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: Unit,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]],
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ],
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: Unit,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]],
    fills: Unit,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: Unit,
    shadows: Null,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: Unit,
    shadows: Null,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ],
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: Unit,
    shadows: Null,
    fills: Unit,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: Unit,
    shadows: Unit,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: Unit,
    shadows: Unit,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ],
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: Unit,
    shadows: Unit,
    fills: Unit,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: ViewStyle
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: ViewStyle,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: ViewStyle,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]],
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: ViewStyle,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]],
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ],
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: ViewStyle,
    shadows: js.Array[js.UndefOr[ViewStyle | Null]],
    fills: Unit,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: ViewStyle,
    shadows: Null,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: ViewStyle,
    shadows: Null,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ],
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: ViewStyle,
    shadows: Null,
    fills: Unit,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: ViewStyle,
    shadows: Unit,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: ViewStyle,
    shadows: Unit,
    fills: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Fill */ Any
    ],
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapeGroup(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    layers: Unit,
    style: ViewStyle,
    shadows: Unit,
    fills: Unit,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapeGroup")(frame.asInstanceOf[js.Any], layers.asInstanceOf[js.Any], style.asInstanceOf[js.Any], shadows.asInstanceOf[js.Any], fills.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeShapePath(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    path: PickanyisClosedpoints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapePath")(frame.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeShapePath(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    path: PickanyisClosedpoints,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeShapePath")(frame.asInstanceOf[js.Any], path.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeVerticalBorder(x: Double, y: Double, length: Double, thickness: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeVerticalBorder")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], length.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeVerticalBorder(x: Double, y: Double, length: Double, thickness: Double, color: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeVerticalBorder")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], length.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeVerticalBorder(x: Double, y: Double, length: Double, thickness: Double, color: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeVerticalBorder")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], length.asInstanceOf[js.Any], thickness.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeVerticalPath(): PickanyisClosedpoints = ^.asInstanceOf[js.Dynamic].applyDynamic("makeVerticalPath")().asInstanceOf[PickanyisClosedpoints]
  
  type Radii = js.Array[Double | Null]
}
