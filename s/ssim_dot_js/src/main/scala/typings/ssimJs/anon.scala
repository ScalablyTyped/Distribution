package typings.ssimJs

import typings.ssimJs.distTypesMod.ImageMatrix
import typings.ssimJs.distTypesMod.Matrix
import typings.ssimJs.ssimJsBooleans.`false`
import typings.ssimJs.ssimJsStrings.bezkrovny
import typings.ssimJs.ssimJsStrings.fast
import typings.ssimJs.ssimJsStrings.integer
import typings.ssimJs.ssimJsStrings.original
import typings.ssimJs.ssimJsStrings.weber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.Array[Any]
    
    var height: Double
    
    var width: Double
  }
  object Data {
    
    inline def apply(data: js.Array[Any], height: Double, width: Double): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataHeight extends StObject {
    
    var data: js.typedarray.Int32Array
    
    var height: Double
    
    var width: Double
  }
  object DataHeight {
    
    inline def apply(data: js.typedarray.Int32Array, height: Double, width: Double): DataHeight = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataHeight]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataHeight] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Int32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height
    extends StObject
       with ImageMatrix {
    
    var data: js.typedarray.Uint8Array | js.typedarray.Int8Array | js.typedarray.Uint32Array | js.typedarray.Int32Array | js.typedarray.Uint16Array
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(
      data: js.typedarray.Uint8Array | js.typedarray.Int8Array | js.typedarray.Uint32Array | js.typedarray.Int32Array | js.typedarray.Uint16Array,
      height: Double,
      width: Double
    ): Height = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setData(
        value: js.typedarray.Uint8Array | js.typedarray.Int8Array | js.typedarray.Uint32Array | js.typedarray.Int32Array | js.typedarray.Uint16Array
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mssim extends StObject {
    
    var mssim: Double
    
    var performance: Double
    
    var ssim_map: Matrix
  }
  object Mssim {
    
    inline def apply(mssim: Double, performance: Double, ssim_map: Matrix): Mssim = {
      val __obj = js.Dynamic.literal(mssim = mssim.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], ssim_map = ssim_map.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mssim]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mssim] (val x: Self) extends AnyVal {
      
      inline def setMssim(value: Double): Self = StObject.set(x, "mssim", value.asInstanceOf[js.Any])
      
      inline def setPerformance(value: Double): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setSsim_map(value: Matrix): Self = StObject.set(x, "ssim_map", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<ssim.js.ssim.js/dist/types.Options> */
  trait PartialOptions extends StObject {
    
    var bitDepth: js.UndefOr[Double] = js.undefined
    
    var downsample: js.UndefOr[original | fast | `false`] = js.undefined
    
    var k1: js.UndefOr[Double] = js.undefined
    
    var k2: js.UndefOr[Double] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var rgb2grayVersion: js.UndefOr[original | integer] = js.undefined
    
    var ssim: js.UndefOr[fast | original | bezkrovny | weber] = js.undefined
    
    var windowSize: js.UndefOr[Double] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      inline def setBitDepth(value: Double): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      inline def setBitDepthUndefined: Self = StObject.set(x, "bitDepth", js.undefined)
      
      inline def setDownsample(value: original | fast | `false`): Self = StObject.set(x, "downsample", value.asInstanceOf[js.Any])
      
      inline def setDownsampleUndefined: Self = StObject.set(x, "downsample", js.undefined)
      
      inline def setK1(value: Double): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      inline def setK1Undefined: Self = StObject.set(x, "k1", js.undefined)
      
      inline def setK2(value: Double): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
      
      inline def setK2Undefined: Self = StObject.set(x, "k2", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setRgb2grayVersion(value: original | integer): Self = StObject.set(x, "rgb2grayVersion", value.asInstanceOf[js.Any])
      
      inline def setRgb2grayVersionUndefined: Self = StObject.set(x, "rgb2grayVersion", js.undefined)
      
      inline def setSsim(value: fast | original | bezkrovny | weber): Self = StObject.set(x, "ssim", value.asInstanceOf[js.Any])
      
      inline def setSsimUndefined: Self = StObject.set(x, "ssim", js.undefined)
      
      inline def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
      
      inline def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
    }
  }
  
  trait Width extends StObject {
    
    var data: js.typedarray.Int32Array
    
    var height: Double
    
    var width: Double
  }
  object Width {
    
    inline def apply(data: js.typedarray.Int32Array, height: Double, width: Double): Width = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Int32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
