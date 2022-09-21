package typings.reactImgpro

import typings.react.mod.Component
import typings.reactImgpro.anon.Blue
import typings.reactImgpro.anon.Degree
import typings.reactImgpro.anon.Height
import typings.reactImgpro.anon.Horizontal
import typings.reactImgpro.mod.ReactImgpro.ProcessImageProps
import typings.reactImgpro.reactImgproStrings.horizontal_center
import typings.reactImgpro.reactImgproStrings.horizontal_left
import typings.reactImgpro.reactImgproStrings.horizontal_right
import typings.reactImgpro.reactImgproStrings.vertical_bottom
import typings.reactImgpro.reactImgproStrings.vertical_middle
import typings.reactImgpro.reactImgproStrings.vertical_top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-imgpro", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ProcessImageProps, js.Object, Any]
  
  object ReactImgpro {
    
    /* Rewritten from type alias, can be one of: 
      - typings.reactImgpro.reactImgproStrings.neighbor
      - typings.reactImgpro.reactImgproStrings.bilinear
      - typings.reactImgpro.reactImgproStrings.bicubic
      - typings.reactImgpro.reactImgproStrings.hermite
      - typings.reactImgpro.reactImgproStrings.bezier
    */
    trait Mode extends StObject
    object Mode {
      
      inline def bezier: typings.reactImgpro.reactImgproStrings.bezier = "bezier".asInstanceOf[typings.reactImgpro.reactImgproStrings.bezier]
      
      inline def bicubic: typings.reactImgpro.reactImgproStrings.bicubic = "bicubic".asInstanceOf[typings.reactImgpro.reactImgproStrings.bicubic]
      
      inline def bilinear: typings.reactImgpro.reactImgproStrings.bilinear = "bilinear".asInstanceOf[typings.reactImgpro.reactImgproStrings.bilinear]
      
      inline def hermite: typings.reactImgpro.reactImgproStrings.hermite = "hermite".asInstanceOf[typings.reactImgpro.reactImgproStrings.hermite]
      
      inline def neighbor: typings.reactImgpro.reactImgproStrings.neighbor = "neighbor".asInstanceOf[typings.reactImgpro.reactImgproStrings.neighbor]
    }
    
    type ProcessImage = Component[ProcessImageProps, js.Object, Any]
    
    trait ProcessImageProps extends StObject {
      
      /* should be 0 - 1 */
      var blur: js.UndefOr[Double] = js.undefined
      
      var brightness: js.UndefOr[Double] = js.undefined
      
      var colors: js.UndefOr[Blue] = js.undefined
      
      var contain: js.UndefOr[Size] = js.undefined
      
      /* should be -1 to 1 */
      var contrast: js.UndefOr[Double] = js.undefined
      
      /* should be 0 - 100 */
      var cover: js.UndefOr[Size] = js.undefined
      
      var customCdn: js.UndefOr[String] = js.undefined
      
      var disableRerender: js.UndefOr[Boolean] = js.undefined
      
      var disableWebWorker: js.UndefOr[Boolean] = js.undefined
      
      var dither565: js.UndefOr[Boolean] = js.undefined
      
      /* should be -1 to 1 */
      var fade: js.UndefOr[Double] = js.undefined
      
      var flip: js.UndefOr[Horizontal] = js.undefined
      
      var greyscale: js.UndefOr[Boolean] = js.undefined
      
      var image: String
      
      var invert: js.UndefOr[Boolean] = js.undefined
      
      var normalize: js.UndefOr[Boolean] = js.undefined
      
      def onProcessFinish(): Unit
      
      /* should be 0 - 1 */
      var opacity: js.UndefOr[Double] = js.undefined
      
      var opaque: js.UndefOr[Boolean] = js.undefined
      
      /* should be 0 - 100 */
      var posterize: js.UndefOr[Double] = js.undefined
      
      var quality: js.UndefOr[Double] = js.undefined
      
      var resize: js.UndefOr[Shape] = js.undefined
      
      var rotate: js.UndefOr[Degree] = js.undefined
      
      var scale: js.UndefOr[Boolean] = js.undefined
      
      var scaleToFitImage: js.UndefOr[Height] = js.undefined
      
      var sepia: js.UndefOr[Boolean] = js.undefined
      
      var storage: js.UndefOr[Boolean] = js.undefined
    }
    object ProcessImageProps {
      
      inline def apply(image: String, onProcessFinish: () => Unit): ProcessImageProps = {
        val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], onProcessFinish = js.Any.fromFunction0(onProcessFinish))
        __obj.asInstanceOf[ProcessImageProps]
      }
      
      extension [Self <: ProcessImageProps](x: Self) {
        
        inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
        
        inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
        
        inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
        
        inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
        
        inline def setColors(value: Blue): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
        
        inline def setContain(value: Size): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
        
        inline def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
        
        inline def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
        
        inline def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
        
        inline def setCover(value: Size): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
        
        inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
        
        inline def setCustomCdn(value: String): Self = StObject.set(x, "customCdn", value.asInstanceOf[js.Any])
        
        inline def setCustomCdnUndefined: Self = StObject.set(x, "customCdn", js.undefined)
        
        inline def setDisableRerender(value: Boolean): Self = StObject.set(x, "disableRerender", value.asInstanceOf[js.Any])
        
        inline def setDisableRerenderUndefined: Self = StObject.set(x, "disableRerender", js.undefined)
        
        inline def setDisableWebWorker(value: Boolean): Self = StObject.set(x, "disableWebWorker", value.asInstanceOf[js.Any])
        
        inline def setDisableWebWorkerUndefined: Self = StObject.set(x, "disableWebWorker", js.undefined)
        
        inline def setDither565(value: Boolean): Self = StObject.set(x, "dither565", value.asInstanceOf[js.Any])
        
        inline def setDither565Undefined: Self = StObject.set(x, "dither565", js.undefined)
        
        inline def setFade(value: Double): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
        
        inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
        
        inline def setFlip(value: Horizontal): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
        
        inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
        
        inline def setGreyscale(value: Boolean): Self = StObject.set(x, "greyscale", value.asInstanceOf[js.Any])
        
        inline def setGreyscaleUndefined: Self = StObject.set(x, "greyscale", js.undefined)
        
        inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
        
        inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
        
        inline def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
        
        inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
        
        inline def setOnProcessFinish(value: () => Unit): Self = StObject.set(x, "onProcessFinish", js.Any.fromFunction0(value))
        
        inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
        
        inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
        
        inline def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
        
        inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
        
        inline def setPosterize(value: Double): Self = StObject.set(x, "posterize", value.asInstanceOf[js.Any])
        
        inline def setPosterizeUndefined: Self = StObject.set(x, "posterize", js.undefined)
        
        inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
        
        inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
        
        inline def setResize(value: Shape): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
        
        inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
        
        inline def setRotate(value: Degree): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
        
        inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
        
        inline def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
        
        inline def setScaleToFitImage(value: Height): Self = StObject.set(x, "scaleToFitImage", value.asInstanceOf[js.Any])
        
        inline def setScaleToFitImageUndefined: Self = StObject.set(x, "scaleToFitImage", js.undefined)
        
        inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
        
        inline def setSepia(value: Boolean): Self = StObject.set(x, "sepia", value.asInstanceOf[js.Any])
        
        inline def setSepiaUndefined: Self = StObject.set(x, "sepia", js.undefined)
        
        inline def setStorage(value: Boolean): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
        
        inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      }
    }
    
    trait Shape extends StObject {
      
      var height: js.UndefOr[Double] = js.undefined
      
      var mode: js.UndefOr[Mode] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
    }
    object Shape {
      
      inline def apply(): Shape = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Shape]
      }
      
      extension [Self <: Shape](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait Size extends StObject {
      
      var height: Double
      
      var mode: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle
      
      var width: Double
    }
    object Size {
      
      inline def apply(
        height: Double,
        mode: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle,
        width: Double
      ): Size = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[Size]
      }
      
      extension [Self <: Size](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setMode(
          value: horizontal_left | horizontal_center | horizontal_right | vertical_top | vertical_bottom | vertical_middle
        ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
  }
}
