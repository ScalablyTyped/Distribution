package typings.ssimJs

import typings.ssimJs.ssimJsBooleans.`false`
import typings.ssimJs.ssimJsStrings.bezkrovny
import typings.ssimJs.ssimJsStrings.fast
import typings.ssimJs.ssimJsStrings.integer
import typings.ssimJs.ssimJsStrings.original
import typings.ssimJs.ssimJsStrings.weber
import typings.ssimJs.typesMod.ImageMatrix
import typings.ssimJs.typesMod.Matrix
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Data extends StObject {
    
    var data: js.Array[_] = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: js.Array[_], height: Double, width: Double): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[_]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DataHeight extends StObject {
    
    var data: Int32Array = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object DataHeight {
    
    @scala.inline
    def apply(data: Int32Array, height: Double, width: Double): DataHeight = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataHeight]
    }
    
    @scala.inline
    implicit class DataHeightMutableBuilder[Self <: DataHeight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Int32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Height extends ImageMatrix {
    
    var data: Uint8Array | Int8Array | Uint32Array | Int32Array | Uint16Array = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Height {
    
    @scala.inline
    def apply(
      data: Uint8Array | Int8Array | Uint32Array | Int32Array | Uint16Array,
      height: Double,
      width: Double
    ): Height = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Uint8Array | Int8Array | Uint32Array | Int32Array | Uint16Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Mssim extends StObject {
    
    var mssim: Double = js.native
    
    var performance: Double = js.native
    
    var ssim_map: Matrix = js.native
  }
  object Mssim {
    
    @scala.inline
    def apply(mssim: Double, performance: Double, ssim_map: Matrix): Mssim = {
      val __obj = js.Dynamic.literal(mssim = mssim.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], ssim_map = ssim_map.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mssim]
    }
    
    @scala.inline
    implicit class MssimMutableBuilder[Self <: Mssim] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMssim(value: Double): Self = StObject.set(x, "mssim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerformance(value: Double): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsim_map(value: Matrix): Self = StObject.set(x, "ssim_map", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<ssim.js.ssim.js/dist/types.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var bitDepth: js.UndefOr[Double] = js.native
    
    var downsample: js.UndefOr[original | fast | `false`] = js.native
    
    var k1: js.UndefOr[Double] = js.native
    
    var k2: js.UndefOr[Double] = js.native
    
    var maxSize: js.UndefOr[Double] = js.native
    
    var rgb2grayVersion: js.UndefOr[original | integer] = js.native
    
    var ssim: js.UndefOr[fast | original | bezkrovny | weber] = js.native
    
    var windowSize: js.UndefOr[Double] = js.native
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitDepth(value: Double): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitDepthUndefined: Self = StObject.set(x, "bitDepth", js.undefined)
      
      @scala.inline
      def setDownsample(value: original | fast | `false`): Self = StObject.set(x, "downsample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownsampleUndefined: Self = StObject.set(x, "downsample", js.undefined)
      
      @scala.inline
      def setK1(value: Double): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK1Undefined: Self = StObject.set(x, "k1", js.undefined)
      
      @scala.inline
      def setK2(value: Double): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK2Undefined: Self = StObject.set(x, "k2", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setRgb2grayVersion(value: original | integer): Self = StObject.set(x, "rgb2grayVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRgb2grayVersionUndefined: Self = StObject.set(x, "rgb2grayVersion", js.undefined)
      
      @scala.inline
      def setSsim(value: fast | original | bezkrovny | weber): Self = StObject.set(x, "ssim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSsimUndefined: Self = StObject.set(x, "ssim", js.undefined)
      
      @scala.inline
      def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
    }
  }
  
  @js.native
  trait Width extends StObject {
    
    var data: Int32Array = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Width {
    
    @scala.inline
    def apply(data: Int32Array, height: Double, width: Double): Width = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    @scala.inline
    implicit class WidthMutableBuilder[Self <: Width] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Int32Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
