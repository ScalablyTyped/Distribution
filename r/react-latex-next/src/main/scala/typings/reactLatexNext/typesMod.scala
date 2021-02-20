package typings.reactLatexNext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Delimiter extends StObject {
    
    var display: Boolean = js.native
    
    var left: String = js.native
    
    var right: String = js.native
  }
  object Delimiter {
    
    @scala.inline
    def apply(display: Boolean, left: String, right: String): Delimiter = {
      val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delimiter]
    }
    
    @scala.inline
    implicit class DelimiterMutableBuilder[Self <: Delimiter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KatexData extends StObject {
    
    var data: String = js.native
    
    var display: js.UndefOr[Boolean] = js.native
    
    var rawData: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
  }
  object KatexData {
    
    @scala.inline
    def apply(data: String, `type`: String): KatexData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KatexData]
    }
    
    @scala.inline
    implicit class KatexDataMutableBuilder[Self <: KatexData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setRawData(value: String): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawDataUndefined: Self = StObject.set(x, "rawData", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
