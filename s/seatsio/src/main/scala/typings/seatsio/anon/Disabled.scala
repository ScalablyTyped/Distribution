package typings.seatsio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disabled extends js.Object {
  
  var disabled: js.Array[String] = js.native
  
  var enabled: js.Array[String] = js.native
  
  var readOnly: js.Array[String] = js.native
}
object Disabled {
  
  @scala.inline
  def apply(disabled: js.Array[String], enabled: js.Array[String], readOnly: js.Array[String]): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  
  @scala.inline
  implicit class DisabledOps[Self <: Disabled] (val x: Self) extends AnyVal {
    
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
    def setDisabledVarargs(value: String*): Self = this.set("disabled", js.Array(value :_*))
    
    @scala.inline
    def setDisabled(value: js.Array[String]): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledVarargs(value: String*): Self = this.set("enabled", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: js.Array[String]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyVarargs(value: String*): Self = this.set("readOnly", js.Array(value :_*))
    
    @scala.inline
    def setReadOnly(value: js.Array[String]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
  }
}
