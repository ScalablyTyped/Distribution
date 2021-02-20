package typings.pulumiAws.inputMod.ecs

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefinitionProxyConfiguration extends StObject {
  
  /**
    * The name of the container that will serve as the App Mesh proxy.
    */
  var containerName: Input[String] = js.native
  
  /**
    * The set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified a key-value mapping.
    */
  var properties: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The proxy type. The default value is `APPMESH`. The only supported value is `APPMESH`.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}
object TaskDefinitionProxyConfiguration {
  
  @scala.inline
  def apply(containerName: Input[String]): TaskDefinitionProxyConfiguration = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionProxyConfiguration]
  }
  
  @scala.inline
  implicit class TaskDefinitionProxyConfigurationMutableBuilder[Self <: TaskDefinitionProxyConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: Input[String]): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
