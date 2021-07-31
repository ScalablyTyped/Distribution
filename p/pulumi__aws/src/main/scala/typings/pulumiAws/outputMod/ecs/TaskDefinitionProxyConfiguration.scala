package typings.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefinitionProxyConfiguration extends StObject {
  
  /**
    * The name of the container that will serve as the App Mesh proxy.
    */
  var containerName: String
  
  /**
    * The set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified a key-value mapping.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object TaskDefinitionProxyConfiguration {
  
  @scala.inline
  def apply(containerName: String): TaskDefinitionProxyConfiguration = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionProxyConfiguration]
  }
  
  @scala.inline
  implicit class TaskDefinitionProxyConfigurationMutableBuilder[Self <: TaskDefinitionProxyConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
