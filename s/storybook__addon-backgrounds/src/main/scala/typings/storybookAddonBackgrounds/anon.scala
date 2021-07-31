package typings.storybookAddonBackgrounds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Background extends StObject {
    
    var background: String
  }
  object Background {
    
    @scala.inline
    def apply(background: String): Background = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any])
      __obj.asInstanceOf[Background]
    }
    
    @scala.inline
    implicit class BackgroundMutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    }
  }
  
  trait CellAmount extends StObject {
    
    var cellAmount: Double
    
    var cellSize: Double
    
    var opacity: Double
  }
  object CellAmount {
    
    @scala.inline
    def apply(cellAmount: Double, cellSize: Double, opacity: Double): CellAmount = {
      val __obj = js.Dynamic.literal(cellAmount = cellAmount.asInstanceOf[js.Any], cellSize = cellSize.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellAmount]
    }
    
    @scala.inline
    implicit class CellAmountMutableBuilder[Self <: CellAmount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellAmount(value: Double): Self = StObject.set(x, "cellAmount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellSize(value: Double): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    }
  }
  
  trait Grid extends StObject {
    
    var grid: CellAmount
    
    var values: js.Array[Name]
  }
  object Grid {
    
    @scala.inline
    def apply(grid: CellAmount, values: js.Array[Name]): Grid = {
      val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Grid]
    }
    
    @scala.inline
    implicit class GridMutableBuilder[Self <: Grid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrid(value: CellAmount): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[Name]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Name*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var value: String
  }
  object Name {
    
    @scala.inline
    def apply(name: String, value: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
