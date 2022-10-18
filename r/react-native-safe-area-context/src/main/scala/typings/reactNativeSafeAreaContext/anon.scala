package typings.reactNativeSafeAreaContext

import typings.reactNative.librariesTypesCodegenTypesMod.Double
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Frame extends StObject {
    
    var frame: Height
    
    var insets: Bottom
  }
  object Frame {
    
    inline def apply(frame: Height, insets: Bottom): Frame = {
      val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Frame]
    }
    
    extension [Self <: Frame](x: Self) {
      
      inline def setFrame(value: Height): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setInsets(value: Bottom): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitialWindowMetrics extends StObject {
    
    var initialWindowMetrics: js.UndefOr[Frame] = js.undefined
  }
  object InitialWindowMetrics {
    
    inline def apply(): InitialWindowMetrics = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitialWindowMetrics]
    }
    
    extension [Self <: InitialWindowMetrics](x: Self) {
      
      inline def setInitialWindowMetrics(value: Frame): Self = StObject.set(x, "initialWindowMetrics", value.asInstanceOf[js.Any])
      
      inline def setInitialWindowMetricsUndefined: Self = StObject.set(x, "initialWindowMetrics", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  top :react-native.react-native/Libraries/Types/CodegenTypes.Double,   right :react-native.react-native/Libraries/Types/CodegenTypes.Double,   bottom :react-native.react-native/Libraries/Types/CodegenTypes.Double,   left :react-native.react-native/Libraries/Types/CodegenTypes.Double}> */
  trait ReadonlytopDoublerightDou extends StObject {
    
    val bottom: Double
    
    val left: Double
    
    val right: Double
    
    val top: Double
  }
  object ReadonlytopDoublerightDou {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): ReadonlytopDoublerightDou = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlytopDoublerightDou]
    }
    
    extension [Self <: ReadonlytopDoublerightDou](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  x :react-native.react-native/Libraries/Types/CodegenTypes.Double,   y :react-native.react-native/Libraries/Types/CodegenTypes.Double,   width :react-native.react-native/Libraries/Types/CodegenTypes.Double,   height :react-native.react-native/Libraries/Types/CodegenTypes.Double}> */
  trait ReadonlyxDoubleyDoublewid extends StObject {
    
    val height: Double
    
    val width: Double
    
    val x: Double
    
    val y: Double
  }
  object ReadonlyxDoubleyDoublewid {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): ReadonlyxDoubleyDoublewid = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyxDoubleyDoublewid]
    }
    
    extension [Self <: ReadonlyxDoubleyDoublewid](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
