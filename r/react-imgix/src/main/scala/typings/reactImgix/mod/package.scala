package typings.reactImgix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def Background: typings.react.mod.FunctionComponent[typings.react.mod.PropsWithChildren[typings.reactImgix.mod.BackgroundProps]] = typings.reactImgix.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Background").asInstanceOf[typings.react.mod.FunctionComponent[typings.react.mod.PropsWithChildren[typings.reactImgix.mod.BackgroundProps]]]
  
  type Imgix = typings.react.mod.Component[typings.reactImgix.mod.SharedImigixAndSourceProps, js.Object, js.Any]
  
  type ImgixHTMLAttributes = typings.react.mod.ImgHTMLAttributes[typings.std.HTMLImageElement] | typings.react.mod.SourceHTMLAttributes[typings.std.HTMLSourceElement] | (typings.std.Record[java.lang.String, java.lang.String])
  
  type ImgixParamType = java.lang.String | scala.Double | scala.Boolean
  
  type ImigixParams = typings.reactImgix.mod.AdjustmentParams with typings.reactImgix.mod.AutomaticParams with typings.reactImgix.mod.BlendingParams with typings.reactImgix.mod.BorderAndPaddingParams with typings.reactImgix.mod.ColorPaletteParams with typings.reactImgix.mod.FaceDetectionParams with typings.reactImgix.mod.FillParams with typings.reactImgix.mod.FocalPointCropParams with typings.reactImgix.mod.FormatParams with typings.reactImgix.mod.MaskImageParams with typings.reactImgix.mod.NoiseReductionParams with typings.reactImgix.mod.PDFParams with typings.reactImgix.mod.PixelDensityParams with typings.reactImgix.mod.RotationParams with typings.reactImgix.mod.SizeParams with typings.reactImgix.mod.StylizeParams with typings.reactImgix.mod.TextParams with typings.reactImgix.mod.TrimParams with typings.reactImgix.mod.TypesettingEndpointParams with typings.reactImgix.mod.WatermarkParams
  
  @scala.inline
  def buildURL(src: java.lang.String): java.lang.String = typings.reactImgix.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def buildURL(
    src: java.lang.String,
    imgixParams: js.UndefOr[scala.Nothing],
    options: typings.reactImgix.mod.SharedImigixAndSourceProps
  ): java.lang.String = (typings.reactImgix.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def buildURL(src: java.lang.String, imgixParams: typings.reactImgix.mod.ImigixParams): java.lang.String = (typings.reactImgix.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def buildURL(
    src: java.lang.String,
    imgixParams: typings.reactImgix.mod.ImigixParams,
    options: typings.reactImgix.mod.SharedImigixAndSourceProps
  ): java.lang.String = (typings.reactImgix.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
