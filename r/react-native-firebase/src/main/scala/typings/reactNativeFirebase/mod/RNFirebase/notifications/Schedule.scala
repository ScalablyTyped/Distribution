package typings.reactNativeFirebase.mod.RNFirebase.notifications

import typings.reactNativeFirebase.reactNativeFirebaseStrings.day
import typings.reactNativeFirebase.reactNativeFirebaseStrings.hour
import typings.reactNativeFirebase.reactNativeFirebaseStrings.minute
import typings.reactNativeFirebase.reactNativeFirebaseStrings.week
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schedule extends StObject {
  
  var fireDate: Double
  
  var repeatInterval: js.UndefOr[minute | hour | day | week] = js.undefined
}
object Schedule {
  
  inline def apply(fireDate: Double): Schedule = {
    val __obj = js.Dynamic.literal(fireDate = fireDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
  
  extension [Self <: Schedule](x: Self) {
    
    inline def setFireDate(value: Double): Self = StObject.set(x, "fireDate", value.asInstanceOf[js.Any])
    
    inline def setRepeatInterval(value: minute | hour | day | week): Self = StObject.set(x, "repeatInterval", value.asInstanceOf[js.Any])
    
    inline def setRepeatIntervalUndefined: Self = StObject.set(x, "repeatInterval", js.undefined)
  }
}
