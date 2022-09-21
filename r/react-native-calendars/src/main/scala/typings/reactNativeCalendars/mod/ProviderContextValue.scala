package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderContextValue extends StObject {
  
  var date: String
  
  var prevDate: String
  
  def setDate(date: String, updateSource: UpdateSource): Unit
  
  def setDisabled(disabled: Boolean): Unit
  
  var updateSource: UpdateSource
}
object ProviderContextValue {
  
  inline def apply(
    date: String,
    prevDate: String,
    setDate: (String, UpdateSource) => Unit,
    setDisabled: Boolean => Unit,
    updateSource: UpdateSource
  ): ProviderContextValue = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], prevDate = prevDate.asInstanceOf[js.Any], setDate = js.Any.fromFunction2(setDate), setDisabled = js.Any.fromFunction1(setDisabled), updateSource = updateSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderContextValue]
  }
  
  extension [Self <: ProviderContextValue](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setPrevDate(value: String): Self = StObject.set(x, "prevDate", value.asInstanceOf[js.Any])
    
    inline def setSetDate(value: (String, UpdateSource) => Unit): Self = StObject.set(x, "setDate", js.Any.fromFunction2(value))
    
    inline def setSetDisabled(value: Boolean => Unit): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
    
    inline def setUpdateSource(value: UpdateSource): Self = StObject.set(x, "updateSource", value.asInstanceOf[js.Any])
  }
}
