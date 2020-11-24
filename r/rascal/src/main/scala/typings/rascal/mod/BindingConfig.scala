package typings.rascal.mod

import typings.rascal.rascalStrings.exchange
import typings.rascal.rascalStrings.queue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingConfig extends js.Object {
  
  var bindingKey: js.UndefOr[String] = js.native
  
  var bindingKeys: js.UndefOr[js.Array[String]] = js.native
  
  var destination: js.UndefOr[String] = js.native
  
  var destinationType: js.UndefOr[queue | exchange] = js.native
  
  var options: js.UndefOr[js.Any] = js.native
  
  var source: js.UndefOr[String] = js.native
}
object BindingConfig {
  
  @scala.inline
  def apply(): BindingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingConfig]
  }
  
  @scala.inline
  implicit class BindingConfigOps[Self <: BindingConfig] (val x: Self) extends AnyVal {
    
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
    def setBindingKey(value: String): Self = this.set("bindingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindingKey: Self = this.set("bindingKey", js.undefined)
    
    @scala.inline
    def setBindingKeysVarargs(value: String*): Self = this.set("bindingKeys", js.Array(value :_*))
    
    @scala.inline
    def setBindingKeys(value: js.Array[String]): Self = this.set("bindingKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindingKeys: Self = this.set("bindingKeys", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setDestinationType(value: queue | exchange): Self = this.set("destinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationType: Self = this.set("destinationType", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
