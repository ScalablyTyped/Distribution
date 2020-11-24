package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set extends js.Object {
  
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
  implicit class SetOps[Self <: Set] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSet(value: Double => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: typings.storybookUi.storybookUiNumbers.`1`): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
