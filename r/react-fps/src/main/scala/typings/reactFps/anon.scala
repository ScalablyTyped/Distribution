package typings.reactFps

import typings.reactFps.buildUseStylesMod.CssProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AvgFps extends StObject {
    
    var avgFps: String
    
    var currentFps: Double
    
    var fps: js.Array[Double]
    
    var maxFps: Any
  }
  object AvgFps {
    
    inline def apply(avgFps: String, currentFps: Double, fps: js.Array[Double], maxFps: Any): AvgFps = {
      val __obj = js.Dynamic.literal(avgFps = avgFps.asInstanceOf[js.Any], currentFps = currentFps.asInstanceOf[js.Any], fps = fps.asInstanceOf[js.Any], maxFps = maxFps.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvgFps]
    }
    
    extension [Self <: AvgFps](x: Self) {
      
      inline def setAvgFps(value: String): Self = StObject.set(x, "avgFps", value.asInstanceOf[js.Any])
      
      inline def setCurrentFps(value: Double): Self = StObject.set(x, "currentFps", value.asInstanceOf[js.Any])
      
      inline def setFps(value: js.Array[Double]): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      inline def setFpsVarargs(value: Double*): Self = StObject.set(x, "fps", js.Array(value*))
      
      inline def setMaxFps(value: Any): Self = StObject.set(x, "maxFps", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackgroundColor extends StObject {
    
    var backgroundColor: String
    
    var bottom: CssProp
    
    var boxSizing: String
    
    var color: String
    
    var fontFamily: String
    
    var fontSize: String
    
    var fontWeight: Double
    
    var height: String
    
    var left: CssProp
    
    var lineHeight: String
    
    var padding: String
    
    var position: String
    
    var right: CssProp
    
    var top: CssProp
    
    var width: String
    
    var zIndex: Double
  }
  object BackgroundColor {
    
    inline def apply(
      backgroundColor: String,
      bottom: CssProp,
      boxSizing: String,
      color: String,
      fontFamily: String,
      fontSize: String,
      fontWeight: Double,
      height: String,
      left: CssProp,
      lineHeight: String,
      padding: String,
      position: String,
      right: CssProp,
      top: CssProp,
      width: String,
      zIndex: Double
    ): BackgroundColor = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], boxSizing = boxSizing.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundColor]
    }
    
    extension [Self <: BackgroundColor](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBottom(value: CssProp): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBoxSizing(value: String): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: CssProp): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRight(value: CssProp): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: CssProp): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait BarStyle extends StObject {
    
    def barStyle(calcHeight: Any, i: Any): BoxSizing
    
    var graphStyle: Bottom
    
    var wrapperStyle: BackgroundColor
  }
  object BarStyle {
    
    inline def apply(barStyle: (Any, Any) => BoxSizing, graphStyle: Bottom, wrapperStyle: BackgroundColor): BarStyle = {
      val __obj = js.Dynamic.literal(barStyle = js.Any.fromFunction2(barStyle), graphStyle = graphStyle.asInstanceOf[js.Any], wrapperStyle = wrapperStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarStyle]
    }
    
    extension [Self <: BarStyle](x: Self) {
      
      inline def setBarStyle(value: (Any, Any) => BoxSizing): Self = StObject.set(x, "barStyle", js.Any.fromFunction2(value))
      
      inline def setGraphStyle(value: Bottom): Self = StObject.set(x, "graphStyle", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyle(value: BackgroundColor): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bottom extends StObject {
    
    var MozBoxSizing: String
    
    var backgroundColor: String
    
    var bottom: String
    
    var boxSizing: String
    
    var height: Double
    
    var left: String
    
    var position: String
    
    var right: String
  }
  object Bottom {
    
    inline def apply(
      MozBoxSizing: String,
      backgroundColor: String,
      bottom: String,
      boxSizing: String,
      height: Double,
      left: String,
      position: String,
      right: String
    ): Bottom = {
      val __obj = js.Dynamic.literal(MozBoxSizing = MozBoxSizing.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], boxSizing = boxSizing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBoxSizing(value: String): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setMozBoxSizing(value: String): Self = StObject.set(x, "MozBoxSizing", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait BoxSizing extends StObject {
    
    var MozBoxSizing: String
    
    var backgroundColor: String
    
    var bottom: String
    
    var boxSizing: String
    
    var height: String
    
    var position: String
    
    var right: String
    
    var width: String
  }
  object BoxSizing {
    
    inline def apply(
      MozBoxSizing: String,
      backgroundColor: String,
      bottom: String,
      boxSizing: String,
      height: String,
      position: String,
      right: String,
      width: String
    ): BoxSizing = {
      val __obj = js.Dynamic.literal(MozBoxSizing = MozBoxSizing.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], boxSizing = boxSizing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxSizing]
    }
    
    extension [Self <: BoxSizing](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBoxSizing(value: String): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMozBoxSizing(value: String): Self = StObject.set(x, "MozBoxSizing", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
