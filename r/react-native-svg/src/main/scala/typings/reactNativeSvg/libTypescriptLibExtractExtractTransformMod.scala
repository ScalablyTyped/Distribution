package typings.reactNativeSvg

import typings.reactNative.mod.MatrixTransform
import typings.reactNative.mod.PerpectiveTransform
import typings.reactNative.mod.RotateTransform
import typings.reactNative.mod.RotateXTransform
import typings.reactNative.mod.RotateYTransform
import typings.reactNative.mod.RotateZTransform
import typings.reactNative.mod.ScaleTransform
import typings.reactNative.mod.ScaleXTransform
import typings.reactNative.mod.ScaleYTransform
import typings.reactNative.mod.SkewXTransform
import typings.reactNative.mod.SkewYTransform
import typings.reactNative.mod.TranslateXTransform
import typings.reactNative.mod.TranslateYTransform
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.ColumnMajorTransformMatrix
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.TransformProps
import typings.reactNativeSvg.libTypescriptLibExtractTypesMod.TransformedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptLibExtractExtractTransformMod {
  
  @JSImport("react-native-svg/lib/typescript/lib/extract/extractTransform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TransformProps): ColumnMajorTransformMatrix | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ColumnMajorTransformMatrix | Null]
  
  inline def default_transform(
    props: js.UndefOr[
      ColumnMajorTransformMatrix | String | (/* import warning: importer.ImportType#apply Failed type conversion: react-native.react-native.TransformsStyle['transform'] */ js.Any)
    ]
  ): ColumnMajorTransformMatrix | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ColumnMajorTransformMatrix | Null]
  
  inline def props2transform(): TransformedProps | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("props2transform")().asInstanceOf[TransformedProps | Null]
  inline def props2transform(props: TransformProps): TransformedProps | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("props2transform")(props.asInstanceOf[js.Any]).asInstanceOf[TransformedProps | Null]
  
  inline def transformToMatrix(): ColumnMajorTransformMatrix | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformToMatrix")().asInstanceOf[ColumnMajorTransformMatrix | Null]
  inline def transformToMatrix(props: Null, transform: String): ColumnMajorTransformMatrix | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformToMatrix")(props.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[ColumnMajorTransformMatrix | Null]
  inline def transformToMatrix(props: Null, transform: ColumnMajorTransformMatrix): ColumnMajorTransformMatrix | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformToMatrix")(props.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[ColumnMajorTransformMatrix | Null]
  inline def transformToMatrix(props: TransformedProps): ColumnMajorTransformMatrix | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformToMatrix")(props.asInstanceOf[js.Any]).asInstanceOf[ColumnMajorTransformMatrix | Null]
  inline def transformToMatrix(props: TransformedProps, transform: String): ColumnMajorTransformMatrix | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformToMatrix")(props.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[ColumnMajorTransformMatrix | Null]
  inline def transformToMatrix(props: TransformedProps, transform: ColumnMajorTransformMatrix): ColumnMajorTransformMatrix | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformToMatrix")(props.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[ColumnMajorTransformMatrix | Null]
  
  inline def transformToMatrix_transform(
    props: Null,
    transform: /* import warning: importer.ImportType#apply Failed type conversion: react-native.react-native.TransformsStyle['transform'] */ js.Any
  ): ColumnMajorTransformMatrix | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformToMatrix")(props.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[ColumnMajorTransformMatrix | Null]
  inline def transformToMatrix_transform(
    props: TransformedProps,
    transform: /* import warning: importer.ImportType#apply Failed type conversion: react-native.react-native.TransformsStyle['transform'] */ js.Any
  ): ColumnMajorTransformMatrix | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformToMatrix")(props.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[ColumnMajorTransformMatrix | Null]
  
  inline def transformsArrayToProps(): TransformProps = ^.asInstanceOf[js.Dynamic].applyDynamic("transformsArrayToProps")().asInstanceOf[TransformProps]
  inline def transformsArrayToProps(
    transformObjectsArray: js.Array[
      PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform | MatrixTransform
    ]
  ): TransformProps = ^.asInstanceOf[js.Dynamic].applyDynamic("transformsArrayToProps")(transformObjectsArray.asInstanceOf[js.Any]).asInstanceOf[TransformProps]
}
