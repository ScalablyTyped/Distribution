package typings.reactDatePicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedTypesMod {
  
  type ClassName = js.UndefOr[String | Null | (js.Array[js.UndefOr[String | Null]])]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDatePicker.reactDatePickerStrings.century
    - typings.reactDatePicker.reactDatePickerStrings.decade
    - typings.reactDatePicker.reactDatePickerStrings.year
    - typings.reactDatePicker.reactDatePickerStrings.month
  */
  trait Detail extends StObject
  object Detail {
    
    inline def century: typings.reactDatePicker.reactDatePickerStrings.century = "century".asInstanceOf[typings.reactDatePicker.reactDatePickerStrings.century]
    
    inline def decade: typings.reactDatePicker.reactDatePickerStrings.decade = "decade".asInstanceOf[typings.reactDatePicker.reactDatePickerStrings.decade]
    
    inline def month: typings.reactDatePicker.reactDatePickerStrings.month = "month".asInstanceOf[typings.reactDatePicker.reactDatePickerStrings.month]
    
    inline def year: typings.reactDatePicker.reactDatePickerStrings.year = "year".asInstanceOf[typings.reactDatePicker.reactDatePickerStrings.year]
  }
  
  type LooseValue = LooseValuePiece | (js.Tuple2[LooseValuePiece, LooseValuePiece])
  
  type LooseValuePiece = String | js.Date | Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDatePicker.reactDatePickerStrings.century
    - typings.reactDatePicker.reactDatePickerStrings.decade
    - typings.reactDatePicker.reactDatePickerStrings.year
    - typings.reactDatePicker.reactDatePickerStrings.month
    - typings.reactDatePicker.reactDatePickerStrings.day
  */
  trait RangeType extends StObject
  object RangeType {
    
    inline def century: typings.reactDatePicker.reactDatePickerStrings.century = "century".asInstanceOf[typings.reactDatePicker.reactDatePickerStrings.century]
    
    inline def day: typings.reactDatePicker.reactDatePickerStrings.day = "day".asInstanceOf[typings.reactDatePicker.reactDatePickerStrings.day]
    
    inline def decade: typings.reactDatePicker.reactDatePickerStrings.decade = "decade".asInstanceOf[typings.reactDatePicker.reactDatePickerStrings.decade]
    
    inline def month: typings.reactDatePicker.reactDatePickerStrings.month = "month".asInstanceOf[typings.reactDatePicker.reactDatePickerStrings.month]
    
    inline def year: typings.reactDatePicker.reactDatePickerStrings.year = "year".asInstanceOf[typings.reactDatePicker.reactDatePickerStrings.year]
  }
  
  type Value = ValuePiece | (js.Tuple2[ValuePiece, ValuePiece])
  
  type ValuePiece = js.Date | Null
}
