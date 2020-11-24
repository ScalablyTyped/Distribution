package typings.reactImgix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Imgix = typings.react.mod.Component[typings.reactImgix.mod.SharedImigixAndSourceProps, js.Object, js.Any]
  
  type ImgixHTMLAttributes = typings.react.mod.ImgHTMLAttributes[typings.std.HTMLImageElement] | typings.react.mod.SourceHTMLAttributes[typings.std.HTMLSourceElement] | (typings.std.Record[java.lang.String, java.lang.String])
  
  type ImgixParamType = java.lang.String | scala.Double | scala.Boolean
  
  type ImigixParams = typings.reactImgix.mod.AdjustmentParams with typings.reactImgix.mod.AutomaticParams with typings.reactImgix.mod.BlendingParams with typings.reactImgix.mod.BorderAndPaddingParams with typings.reactImgix.mod.ColorPaletteParams with typings.reactImgix.mod.FaceDetectionParams with typings.reactImgix.mod.FillParams with typings.reactImgix.mod.FocalPointCropParams with typings.reactImgix.mod.FormatParams with typings.reactImgix.mod.MaskImageParams with typings.reactImgix.mod.NoiseReductionParams with typings.reactImgix.mod.PDFParams with typings.reactImgix.mod.PixelDensityParams with typings.reactImgix.mod.RotationParams with typings.reactImgix.mod.SizeParams with typings.reactImgix.mod.StylizeParams with typings.reactImgix.mod.TextParams with typings.reactImgix.mod.TrimParams with typings.reactImgix.mod.TypesettingEndpointParams with typings.reactImgix.mod.WatermarkParams
}
