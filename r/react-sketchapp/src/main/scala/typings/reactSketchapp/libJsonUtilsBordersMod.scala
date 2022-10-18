package typings.reactSketchapp

import typings.reactSketchapp.anon.BorderOptions
import typings.reactSketchapp.libTypesMod.LayoutInfo
import typings.reactSketchapp.libTypesMod.ViewStyle
import typings.reactSketchapp.reactSketchappStrings.dashed
import typings.reactSketchapp.reactSketchappStrings.dotted
import typings.reactSketchapp.reactSketchappStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonUtilsBordersMod {
  
  @JSImport("react-sketchapp/lib/jsonUtils/borders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/jsonUtils/borders", "DEFAULT_BORDER_STYLE")
  @js.native
  val DEFAULT_BORDER_STYLE: /* "solid" */ String = js.native
  
  inline def createBorders(
    content: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.ShapeGroup */ Any,
    layout: LayoutInfo
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.ShapeGroup */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBorders")(content.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.ShapeGroup */ Any
  ]]
  inline def createBorders(
    content: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.ShapeGroup */ Any,
    layout: LayoutInfo,
    style: ViewStyle
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.ShapeGroup */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBorders")(content.asInstanceOf[js.Any], layout.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.ShapeGroup */ Any
  ]]
  
  inline def createUniformBorder(
    width: Double,
    color: js.UndefOr[String | Double | Null],
    style: js.UndefOr[dashed | dotted | solid | Null],
    position: js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.BorderPosition */ Any
    ],
    lineCapStyle: js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.LineCapStyle */ Any
    ],
    lineJoinStyle: js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.LineJoinStyle */ Any
    ]
  ): BorderOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("createUniformBorder")(width.asInstanceOf[js.Any], color.asInstanceOf[js.Any], style.asInstanceOf[js.Any], position.asInstanceOf[js.Any], lineCapStyle.asInstanceOf[js.Any], lineJoinStyle.asInstanceOf[js.Any])).asInstanceOf[BorderOptions]
}
