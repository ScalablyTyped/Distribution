package typings.sharp.mod

import typings.sharp.sharpStrings.contain
import typings.sharp.sharpStrings.cover
import typings.sharp.sharpStrings.cubic
import typings.sharp.sharpStrings.fill
import typings.sharp.sharpStrings.inside
import typings.sharp.sharpStrings.lanczos2
import typings.sharp.sharpStrings.lanczos3
import typings.sharp.sharpStrings.mitchell
import typings.sharp.sharpStrings.nearest
import typings.sharp.sharpStrings.outside
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeOptions extends StObject {
  
  /** Background colour when using a fit of contain, parsed by the color module, defaults to black without transparency. (optional, default {r:0,g:0,b:0,alpha:1}) */
  var background: js.UndefOr[Color] = js.undefined
  
  /** Take greater advantage of the JPEG and WebP shrink-on-load feature, which can lead to a slight moiré pattern on some images. (optional, default true) */
  var fastShrinkOnLoad: js.UndefOr[Boolean] = js.undefined
  
  /** How the image should be resized to fit both provided dimensions, one of cover, contain, fill, inside or outside. (optional, default 'cover') */
  var fit: js.UndefOr[contain | cover | fill | inside | outside] = js.undefined
  
  /** Alternative means of specifying height. If both are present this take priority. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** The kernel to use for image reduction. (optional, default 'lanczos3') */
  var kernel: js.UndefOr[nearest | cubic | mitchell | lanczos2 | lanczos3] = js.undefined
  
  /** Position, gravity or strategy to use when fit is cover or contain. (optional, default 'centre') */
  var position: js.UndefOr[Double | String] = js.undefined
  
  /** Alternative means of specifying width. If both are present this take priority. */
  var width: js.UndefOr[Double] = js.undefined
  
  /** Do not enlarge if the width or height are already less than the specified dimensions, equivalent to GraphicsMagick's > geometry option. (optional, default false) */
  var withoutEnlargement: js.UndefOr[Boolean] = js.undefined
  
  /** Do not reduce if the width or height are already greater than the specified dimensions, equivalent to GraphicsMagick's < geometry option. (optional, default false) */
  var withoutReduction: js.UndefOr[Boolean] = js.undefined
}
object ResizeOptions {
  
  inline def apply(): ResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeOptions]
  }
  
  extension [Self <: ResizeOptions](x: Self) {
    
    inline def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setFastShrinkOnLoad(value: Boolean): Self = StObject.set(x, "fastShrinkOnLoad", value.asInstanceOf[js.Any])
    
    inline def setFastShrinkOnLoadUndefined: Self = StObject.set(x, "fastShrinkOnLoad", js.undefined)
    
    inline def setFit(value: contain | cover | fill | inside | outside): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setKernel(value: nearest | cubic | mitchell | lanczos2 | lanczos3): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
    
    inline def setKernelUndefined: Self = StObject.set(x, "kernel", js.undefined)
    
    inline def setPosition(value: Double | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWithoutEnlargement(value: Boolean): Self = StObject.set(x, "withoutEnlargement", value.asInstanceOf[js.Any])
    
    inline def setWithoutEnlargementUndefined: Self = StObject.set(x, "withoutEnlargement", js.undefined)
    
    inline def setWithoutReduction(value: Boolean): Self = StObject.set(x, "withoutReduction", value.asInstanceOf[js.Any])
    
    inline def setWithoutReductionUndefined: Self = StObject.set(x, "withoutReduction", js.undefined)
  }
}
