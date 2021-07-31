package typings.smoothie

import typings.smoothie.mod.TimeSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Index extends StObject {
    
    var index: Double
    
    var series: TimeSeries
    
    var value: Double
  }
  object Index {
    
    @scala.inline
    def apply(index: Double, series: TimeSeries, value: Double): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeries(value: TimeSeries): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait LineWidth extends StObject {
    
    var lineWidth: Double
    
    var strokeStyle: String
  }
  object LineWidth {
    
    @scala.inline
    def apply(lineWidth: Double, strokeStyle: String): LineWidth = {
      val __obj = js.Dynamic.literal(lineWidth = lineWidth.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineWidth]
    }
    
    @scala.inline
    implicit class LineWidthMutableBuilder[Self <: LineWidth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    }
  }
}
