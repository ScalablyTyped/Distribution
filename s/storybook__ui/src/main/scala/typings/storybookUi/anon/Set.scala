package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set extends StObject {
  
  def set(v: Double): Unit = js.native
  
  var value: typings.storybookUi.storybookUiNumbers.`1` = js.native
}
object Set {
  
  @scala.inline
  def apply(set: Double => Unit, value: typings.storybookUi.storybookUiNumbers.`1`): Set = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Set]
  }
  
  @scala.inline
  implicit class SetMutableBuilder[Self <: Set] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSet(value: Double => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: typings.storybookUi.storybookUiNumbers.`1`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
