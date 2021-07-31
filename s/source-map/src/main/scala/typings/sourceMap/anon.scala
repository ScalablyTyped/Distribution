package typings.sourceMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined source-map.source-map.MappedPosition & {  bias :number | undefined} */
  trait MappedPositionbiasnumberu extends StObject {
    
    var bias: js.UndefOr[Double] = js.undefined
    
    var column: Double
    
    var line: Double
    
    var name: js.UndefOr[String] = js.undefined
    
    var source: String
  }
  object MappedPositionbiasnumberu {
    
    @scala.inline
    def apply(column: Double, line: Double, source: String): MappedPositionbiasnumberu = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[MappedPositionbiasnumberu]
    }
    
    @scala.inline
    implicit class MappedPositionbiasnumberuMutableBuilder[Self <: MappedPositionbiasnumberu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined source-map.source-map.Position & {  bias :number | undefined} */
  trait Positionbiasnumberundefin extends StObject {
    
    var bias: js.UndefOr[Double] = js.undefined
    
    var column: Double
    
    var line: Double
  }
  object Positionbiasnumberundefin {
    
    @scala.inline
    def apply(column: Double, line: Double): Positionbiasnumberundefin = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Positionbiasnumberundefin]
    }
    
    @scala.inline
    implicit class PositionbiasnumberundefinMutableBuilder[Self <: Positionbiasnumberundefin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
