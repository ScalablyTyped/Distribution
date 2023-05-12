package typings.reactDatetimePicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDatetimePicker.reactDatetimePickerStrings.am
    - typings.reactDatetimePicker.reactDatetimePickerStrings.pm
  */
  trait AmPmType extends StObject
  object AmPmType {
    
    inline def am: typings.reactDatetimePicker.reactDatetimePickerStrings.am = "am".asInstanceOf[typings.reactDatetimePicker.reactDatetimePickerStrings.am]
    
    inline def pm: typings.reactDatetimePicker.reactDatetimePickerStrings.pm = "pm".asInstanceOf[typings.reactDatetimePicker.reactDatetimePickerStrings.pm]
  }
  
  type ClassName = js.UndefOr[String | Null | (js.Array[js.UndefOr[String | Null]])]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDatetimePicker.reactDatetimePickerStrings.hour
    - typings.reactDatetimePicker.reactDatetimePickerStrings.minute
    - typings.reactDatetimePicker.reactDatetimePickerStrings.second
  */
  trait Detail extends StObject
  object Detail {
    
    inline def hour: typings.reactDatetimePicker.reactDatetimePickerStrings.hour = "hour".asInstanceOf[typings.reactDatetimePicker.reactDatetimePickerStrings.hour]
    
    inline def minute: typings.reactDatetimePicker.reactDatetimePickerStrings.minute = "minute".asInstanceOf[typings.reactDatetimePicker.reactDatetimePickerStrings.minute]
    
    inline def second: typings.reactDatetimePicker.reactDatetimePickerStrings.second = "second".asInstanceOf[typings.reactDatetimePicker.reactDatetimePickerStrings.second]
  }
  
  type LooseValue = LooseValuePiece | (js.Tuple2[LooseValuePiece, LooseValuePiece])
  
  type LooseValuePiece = String | js.Date | Null
  
  type Value = js.Date | Null
}
