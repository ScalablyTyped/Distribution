package typings.quickPicker

import typings.quickPicker.mod.PickerDisplayType
import typings.quickPicker.mod.PickerMode
import typings.quickPicker.mod.PickerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quickPickerStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with PickerDisplayType
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait calendar
    extends StObject
       with PickerDisplayType
  inline def calendar: calendar = "calendar".asInstanceOf[calendar]
  
  @js.native
  sealed trait clock
    extends StObject
       with PickerDisplayType
  inline def clock: clock = "clock".asInstanceOf[clock]
  
  @js.native
  sealed trait countdown
    extends StObject
       with PickerMode
  inline def countdown: countdown = "countdown".asInstanceOf[countdown]
  
  @js.native
  sealed trait date
    extends StObject
       with PickerMode
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait datetime
    extends StObject
       with PickerMode
  inline def datetime: datetime = "datetime".asInstanceOf[datetime]
  
  @js.native
  sealed trait normal
    extends StObject
       with PickerType
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait spinner
    extends StObject
       with PickerDisplayType
  inline def spinner: spinner = "spinner".asInstanceOf[spinner]
  
  @js.native
  sealed trait time
    extends StObject
       with PickerMode
       with PickerType
  inline def time: time = "time".asInstanceOf[time]
}
