package typings.reactTimePicker

import typings.reactTimePicker.distCjsSharedTypesMod.AmPmType
import typings.reactTimePicker.distCjsSharedTypesMod.Detail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactTimePickerStrings {
  
  @js.native
  sealed trait am
    extends StObject
       with AmPmType
  inline def am: am = "am".asInstanceOf[am]
  
  @js.native
  sealed trait hour
    extends StObject
       with Detail
  inline def hour: hour = "hour".asInstanceOf[hour]
  
  @js.native
  sealed trait max extends StObject
  inline def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait min extends StObject
  inline def min: min = "min".asInstanceOf[min]
  
  @js.native
  sealed trait minute
    extends StObject
       with Detail
  inline def minute: minute = "minute".asInstanceOf[minute]
  
  @js.native
  sealed trait name extends StObject
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait nameForClass extends StObject
  inline def nameForClass: nameForClass = "nameForClass".asInstanceOf[nameForClass]
  
  @js.native
  sealed trait pm
    extends StObject
       with AmPmType
  inline def pm: pm = "pm".asInstanceOf[pm]
  
  @js.native
  sealed trait second
    extends StObject
       with Detail
  inline def second: second = "second".asInstanceOf[second]
  
  @js.native
  sealed trait value extends StObject
  inline def value: value = "value".asInstanceOf[value]
}
