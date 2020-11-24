package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationOverride extends js.Object {
  
  /**
    * Specifies how the rule or notification was configured during the scan.
    */
  var configuration: ReportingConfiguration = js.native
  
  /**
    * A reference used to locate the descriptor whose configuration was overridden.
    */
  var descriptor: ReportingDescriptorReference = js.native
  
  /**
    * Key/value pairs that provide additional information about the configuration override.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}
object ConfigurationOverride {
  
  @scala.inline
  def apply(configuration: ReportingConfiguration, descriptor: ReportingDescriptorReference): ConfigurationOverride = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOverride]
  }
  
  @scala.inline
  implicit class ConfigurationOverrideOps[Self <: ConfigurationOverride] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: ReportingConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptor(value: ReportingDescriptorReference): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
