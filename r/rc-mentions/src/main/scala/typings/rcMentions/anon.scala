package typings.rcMentions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<rc-mentions.rc-mentions/es/Mentions.MentionsState> */
  trait PartialMentionsState extends StObject {
    
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    var isFocus: js.UndefOr[Boolean] = js.undefined
    
    var measureLocation: js.UndefOr[Double] = js.undefined
    
    var measurePrefix: js.UndefOr[String] = js.undefined
    
    var measureText: js.UndefOr[String | Null] = js.undefined
    
    var measuring: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object PartialMentionsState {
    
    inline def apply(): PartialMentionsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMentionsState]
    }
    
    extension [Self <: PartialMentionsState](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setIsFocus(value: Boolean): Self = StObject.set(x, "isFocus", value.asInstanceOf[js.Any])
      
      inline def setIsFocusUndefined: Self = StObject.set(x, "isFocus", js.undefined)
      
      inline def setMeasureLocation(value: Double): Self = StObject.set(x, "measureLocation", value.asInstanceOf[js.Any])
      
      inline def setMeasureLocationUndefined: Self = StObject.set(x, "measureLocation", js.undefined)
      
      inline def setMeasurePrefix(value: String): Self = StObject.set(x, "measurePrefix", value.asInstanceOf[js.Any])
      
      inline def setMeasurePrefixUndefined: Self = StObject.set(x, "measurePrefix", js.undefined)
      
      inline def setMeasureText(value: String): Self = StObject.set(x, "measureText", value.asInstanceOf[js.Any])
      
      inline def setMeasureTextNull: Self = StObject.set(x, "measureText", null)
      
      inline def setMeasureTextUndefined: Self = StObject.set(x, "measureText", js.undefined)
      
      inline def setMeasuring(value: Boolean): Self = StObject.set(x, "measuring", value.asInstanceOf[js.Any])
      
      inline def setMeasuringUndefined: Self = StObject.set(x, "measuring", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SelectionLocation extends StObject {
    
    var selectionLocation: Double
    
    var text: String
  }
  object SelectionLocation {
    
    inline def apply(selectionLocation: Double, text: String): SelectionLocation = {
      val __obj = js.Dynamic.literal(selectionLocation = selectionLocation.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionLocation]
    }
    
    extension [Self <: SelectionLocation](x: Self) {
      
      inline def setSelectionLocation(value: Double): Self = StObject.set(x, "selectionLocation", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
