package typings.pulumiAws.outputMod.cfg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemediationConfigurationParameter extends js.Object {
  
  /**
    * The name of the attribute.
    */
  var name: String = js.native
  
  /**
    * The value is dynamic and changes at run-time.
    */
  var resourceValue: js.UndefOr[String] = js.native
  
  /**
    * The value is static and does not change at run-time.
    */
  var staticValue: js.UndefOr[String] = js.native
}
object RemediationConfigurationParameter {
  
  @scala.inline
  def apply(name: String): RemediationConfigurationParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemediationConfigurationParameter]
  }
  
  @scala.inline
  implicit class RemediationConfigurationParameterOps[Self <: RemediationConfigurationParameter] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceValue(value: String): Self = this.set("resourceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceValue: Self = this.set("resourceValue", js.undefined)
    
    @scala.inline
    def setStaticValue(value: String): Self = this.set("staticValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticValue: Self = this.set("staticValue", js.undefined)
  }
}
