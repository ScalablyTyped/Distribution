package typings.reactMosaicComponent

import typings.reactMosaicComponent.anon.Bottom
import typings.reactMosaicComponent.libTypesMod.MosaicDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilBoundingBoxMod {
  
  trait BoundingBox extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object BoundingBox {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): BoundingBox = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundingBox]
    }
    
    @JSImport("react-mosaic-component/lib/util/BoundingBox", "BoundingBox")
    @js.native
    val ^ : js.Any = js.native
    
    inline def asStyles(param0: BoundingBox): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("asStyles")(param0.asInstanceOf[js.Any]).asInstanceOf[Styles]
    
    inline def empty(): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Bottom]
    
    inline def getAbsoluteSplitPercentage(boundingBox: BoundingBox, relativeSplitPercentage: Double, direction: MosaicDirection): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getAbsoluteSplitPercentage")(boundingBox.asInstanceOf[js.Any], relativeSplitPercentage.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getRelativeSplitPercentage(boundingBox: BoundingBox, absoluteSplitPercentage: Double, direction: MosaicDirection): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeSplitPercentage")(boundingBox.asInstanceOf[js.Any], absoluteSplitPercentage.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def split(boundingBox: BoundingBox, relativeSplitPercentage: Double, direction: MosaicDirection): Split_ = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(boundingBox.asInstanceOf[js.Any], relativeSplitPercentage.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Split_]
    
    extension [Self <: BoundingBox](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
    
    trait Split_ extends StObject {
      
      var first: BoundingBox
      
      var second: BoundingBox
    }
    object Split_ {
      
      inline def apply(first: BoundingBox, second: BoundingBox): Split_ = {
        val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
        __obj.asInstanceOf[Split_]
      }
      
      extension [Self <: Split_](x: Self) {
        
        inline def setFirst(value: BoundingBox): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
        
        inline def setSecond(value: BoundingBox): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      }
    }
    
    trait Styles extends StObject {
      
      var bottom: String
      
      var left: String
      
      var right: String
      
      var top: String
    }
    object Styles {
      
      inline def apply(bottom: String, left: String, right: String, top: String): Styles = {
        val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
        __obj.asInstanceOf[Styles]
      }
      
      extension [Self <: Styles](x: Self) {
        
        inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      }
    }
  }
}
