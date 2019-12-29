package typings.reactDashImgix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashImgixMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod.ImgHTMLAttributes
  import typings.react.reactMod.SourceHTMLAttributes
  import typings.std.HTMLImageElement
  import typings.std.HTMLSourceElement

  type Imgix = Component[SharedImigixAndSourceProps, js.Object, js.Any]
  type ImgixHTMLAttributes = ImgHTMLAttributes[HTMLImageElement] | SourceHTMLAttributes[HTMLSourceElement]
  type ImgixParamType = String | Double | Boolean
  type ImigixParams = AdjustmentParams with AutomaticParams with BlendingParams with BorderAndPaddingParams with ColorPaletteParams with FaceDetectionParams with FillParams with FocalPointCropParams with FormatParams with MaskImageParams with NoiseReductionParams with PDFParams with PixelDensityParams with RotationParams with SizeParams with StylizeParams with TextParams with TrimParams with TypesettingEndpointParams with WatermarkParams
}
