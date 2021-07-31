package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationOverride extends StObject {
  
  /**
    * Specifies how the rule or notification was configured during the scan.
    */
  var configuration: ReportingConfiguration
  
  /**
    * A reference used to locate the descriptor whose configuration was overridden.
    */
  var descriptor: ReportingDescriptorReference
  
  /**
    * Key/value pairs that provide additional information about the configuration override.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}
object ConfigurationOverride {
  
  @scala.inline
  def apply(configuration: ReportingConfiguration, descriptor: ReportingDescriptorReference): ConfigurationOverride = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationOverride]
  }
  
  @scala.inline
  implicit class ConfigurationOverrideMutableBuilder[Self <: ConfigurationOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: ReportingConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptor(value: ReportingDescriptorReference): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
