package typings.reactTimePicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTimePicker.reactTimePickerStrings.am
    - typings.reactTimePicker.reactTimePickerStrings.pm
  */
  trait AmPmType extends StObject
  object AmPmType {
    
    inline def am: typings.reactTimePicker.reactTimePickerStrings.am = "am".asInstanceOf[typings.reactTimePicker.reactTimePickerStrings.am]
    
    inline def pm: typings.reactTimePicker.reactTimePickerStrings.pm = "pm".asInstanceOf[typings.reactTimePicker.reactTimePickerStrings.pm]
  }
  
  type ClassName = js.UndefOr[String | Null | (js.Array[js.UndefOr[String | Null]])]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactTimePicker.reactTimePickerStrings.hour
    - typings.reactTimePicker.reactTimePickerStrings.minute
    - typings.reactTimePicker.reactTimePickerStrings.second
  */
  trait Detail extends StObject
  object Detail {
    
    inline def hour: typings.reactTimePicker.reactTimePickerStrings.hour = "hour".asInstanceOf[typings.reactTimePicker.reactTimePickerStrings.hour]
    
    inline def minute: typings.reactTimePicker.reactTimePickerStrings.minute = "minute".asInstanceOf[typings.reactTimePicker.reactTimePickerStrings.minute]
    
    inline def second: typings.reactTimePicker.reactTimePickerStrings.second = "second".asInstanceOf[typings.reactTimePicker.reactTimePickerStrings.second]
  }
  
  type LooseValue = LooseValuePiece | (js.Tuple2[LooseValuePiece, LooseValuePiece])
  
  type LooseValuePiece = String | js.Date | Null
  
  type Value = String | Null
}
