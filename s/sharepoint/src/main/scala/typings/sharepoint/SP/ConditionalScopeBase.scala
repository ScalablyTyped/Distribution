package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalScopeBase extends StObject {
  
  def customFromJson(initValue: js.Any): Boolean
  
  def fromJson(initValue: js.Any): Unit
  
  def get_testResult(): Boolean
  
  def startIfFalse(): js.Any
  
  def startIfTrue(): js.Any
  
  def startScope(): js.Any
}
object ConditionalScopeBase {
  
  inline def apply(
    customFromJson: js.Any => Boolean,
    fromJson: js.Any => Unit,
    get_testResult: () => Boolean,
    startIfFalse: () => js.Any,
    startIfTrue: () => js.Any,
    startScope: () => js.Any
  ): ConditionalScopeBase = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), fromJson = js.Any.fromFunction1(fromJson), get_testResult = js.Any.fromFunction0(get_testResult), startIfFalse = js.Any.fromFunction0(startIfFalse), startIfTrue = js.Any.fromFunction0(startIfTrue), startScope = js.Any.fromFunction0(startScope))
    __obj.asInstanceOf[ConditionalScopeBase]
  }
  
  extension [Self <: ConditionalScopeBase](x: Self) {
    
    inline def setCustomFromJson(value: js.Any => Boolean): Self = StObject.set(x, "customFromJson", js.Any.fromFunction1(value))
    
    inline def setFromJson(value: js.Any => Unit): Self = StObject.set(x, "fromJson", js.Any.fromFunction1(value))
    
    inline def setGet_testResult(value: () => Boolean): Self = StObject.set(x, "get_testResult", js.Any.fromFunction0(value))
    
    inline def setStartIfFalse(value: () => js.Any): Self = StObject.set(x, "startIfFalse", js.Any.fromFunction0(value))
    
    inline def setStartIfTrue(value: () => js.Any): Self = StObject.set(x, "startIfTrue", js.Any.fromFunction0(value))
    
    inline def setStartScope(value: () => js.Any): Self = StObject.set(x, "startScope", js.Any.fromFunction0(value))
  }
}
