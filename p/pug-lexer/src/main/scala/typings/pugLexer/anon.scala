package typings.pugLexer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Column {
    
    inline def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait MustEscape extends StObject {
    
    var mustEscape: js.UndefOr[Boolean] = js.undefined
    
    var remainingSource: String
    
    var `val`: js.UndefOr[String] = js.undefined
  }
  object MustEscape {
    
    inline def apply(remainingSource: String): MustEscape = {
      val __obj = js.Dynamic.literal(remainingSource = remainingSource.asInstanceOf[js.Any])
      __obj.asInstanceOf[MustEscape]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MustEscape] (val x: Self) extends AnyVal {
      
      inline def setMustEscape(value: Boolean): Self = StObject.set(x, "mustEscape", value.asInstanceOf[js.Any])
      
      inline def setMustEscapeUndefined: Self = StObject.set(x, "mustEscape", js.undefined)
      
      inline def setRemainingSource(value: String): Self = StObject.set(x, "remainingSource", value.asInstanceOf[js.Any])
      
      inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
      
      inline def setValUndefined: Self = StObject.set(x, "val", js.undefined)
    }
  }
}
