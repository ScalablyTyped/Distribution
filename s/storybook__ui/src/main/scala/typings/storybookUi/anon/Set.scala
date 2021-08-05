package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Set extends StObject {
  
  def set(v: Double): Unit
  
  var value: typings.storybookUi.storybookUiNumbers.`1`
}
object Set {
  
  inline def apply(set: Double => Unit): Set = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set), value = 1)
    __obj.asInstanceOf[Set]
  }
  
  extension [Self <: Set](x: Self) {
    
    inline def setSet(value: Double => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    inline def setValue(value: typings.storybookUi.storybookUiNumbers.`1`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
