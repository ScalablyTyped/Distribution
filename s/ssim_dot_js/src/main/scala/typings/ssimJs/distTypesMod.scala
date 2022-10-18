package typings.ssimJs

import typings.ssimJs.ssimJsBooleans.`false`
import typings.ssimJs.ssimJsStrings.bezkrovny
import typings.ssimJs.ssimJsStrings.fast
import typings.ssimJs.ssimJsStrings.integer
import typings.ssimJs.ssimJsStrings.original
import typings.ssimJs.ssimJsStrings.weber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait ImageData
    extends StObject
       with ImageMatrix {
    
    val data: js.typedarray.Uint8ClampedArray
    
    val height: Double
    
    val width: Double
  }
  object ImageData {
    
    inline def apply(data: js.typedarray.Uint8ClampedArray, height: Double, width: Double): ImageData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageData]
    }
    
    extension [Self <: ImageData](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ssimJs.distTypesMod.Matrix
    - typings.ssimJs.distTypesMod.ImageData
    - typings.ssimJs.anon.Height
  */
  trait ImageMatrix extends StObject
  object ImageMatrix {
    
    inline def Height(
      data: js.typedarray.Uint8Array | js.typedarray.Int8Array | js.typedarray.Uint32Array | js.typedarray.Int32Array | js.typedarray.Uint16Array,
      height: Double,
      width: Double
    ): typings.ssimJs.anon.Height = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ssimJs.anon.Height]
    }
    
    inline def ImageData(data: js.typedarray.Uint8ClampedArray, height: Double, width: Double): typings.ssimJs.distTypesMod.ImageData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ssimJs.distTypesMod.ImageData]
    }
    
    inline def Matrix(data: js.Array[Double], height: Double, width: Double): typings.ssimJs.distTypesMod.Matrix = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ssimJs.distTypesMod.Matrix]
    }
  }
  
  type Images = js.Tuple3[ImageData, ImageData, Options]
  
  trait MSSIMMatrix
    extends StObject
       with Matrix {
    
    var mssim: Double
  }
  object MSSIMMatrix {
    
    inline def apply(data: js.Array[Double], height: Double, mssim: Double, width: Double): MSSIMMatrix = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], mssim = mssim.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[MSSIMMatrix]
    }
    
    extension [Self <: MSSIMMatrix](x: Self) {
      
      inline def setMssim(value: Double): Self = StObject.set(x, "mssim", value.asInstanceOf[js.Any])
    }
  }
  
  type Matrices = js.Tuple3[Matrix, Matrix, Options]
  
  trait Matrix
    extends StObject
       with ImageMatrix {
    
    var data: js.Array[Double]
    
    var height: Double
    
    var width: Double
  }
  object Matrix {
    
    inline def apply(data: js.Array[Double], height: Double, width: Double): Matrix = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matrix]
    }
    
    extension [Self <: Matrix](x: Self) {
      
      inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var bitDepth: Double
    
    var downsample: original | fast | `false`
    
    var k1: Double
    
    var k2: Double
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var rgb2grayVersion: original | integer
    
    var ssim: fast | original | bezkrovny | weber
    
    var windowSize: Double
  }
  object Options {
    
    inline def apply(
      bitDepth: Double,
      downsample: original | fast | `false`,
      k1: Double,
      k2: Double,
      rgb2grayVersion: original | integer,
      ssim: fast | original | bezkrovny | weber,
      windowSize: Double
    ): Options = {
      val __obj = js.Dynamic.literal(bitDepth = bitDepth.asInstanceOf[js.Any], downsample = downsample.asInstanceOf[js.Any], k1 = k1.asInstanceOf[js.Any], k2 = k2.asInstanceOf[js.Any], rgb2grayVersion = rgb2grayVersion.asInstanceOf[js.Any], ssim = ssim.asInstanceOf[js.Any], windowSize = windowSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBitDepth(value: Double): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      inline def setDownsample(value: original | fast | `false`): Self = StObject.set(x, "downsample", value.asInstanceOf[js.Any])
      
      inline def setK1(value: Double): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      inline def setK2(value: Double): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setRgb2grayVersion(value: original | integer): Self = StObject.set(x, "rgb2grayVersion", value.asInstanceOf[js.Any])
      
      inline def setSsim(value: fast | original | bezkrovny | weber): Self = StObject.set(x, "ssim", value.asInstanceOf[js.Any])
      
      inline def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ssimJs.ssimJsStrings.full
    - typings.ssimJs.ssimJsStrings.same
    - typings.ssimJs.ssimJsStrings.valid
  */
  trait Shape extends StObject
  object Shape {
    
    inline def full: typings.ssimJs.ssimJsStrings.full = "full".asInstanceOf[typings.ssimJs.ssimJsStrings.full]
    
    inline def same: typings.ssimJs.ssimJsStrings.same = "same".asInstanceOf[typings.ssimJs.ssimJsStrings.same]
    
    inline def valid: typings.ssimJs.ssimJsStrings.valid = "valid".asInstanceOf[typings.ssimJs.ssimJsStrings.valid]
  }
}
