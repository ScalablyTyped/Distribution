package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecServiceDiscoveryAwsCloudMap extends StObject {
  
  /**
    * A string map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all of the specified key/value pairs will be returned.
    */
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The name of the AWS Cloud Map namespace to use.
    * Use the `aws.servicediscovery.HttpNamespace` resource to configure a Cloud Map namespace. Must be between 1 and 1024 characters in length.
    */
  var namespaceName: String
  
  /**
    * The name of the AWS Cloud Map service to use. Use the `aws.servicediscovery.Service` resource to configure a Cloud Map service. Must be between 1 and 1024 characters in length.
    */
  var serviceName: String
}
object VirtualNodeSpecServiceDiscoveryAwsCloudMap {
  
  @scala.inline
  def apply(namespaceName: String, serviceName: String): VirtualNodeSpecServiceDiscoveryAwsCloudMap = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecServiceDiscoveryAwsCloudMap]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecServiceDiscoveryAwsCloudMapMutableBuilder[Self <: VirtualNodeSpecServiceDiscoveryAwsCloudMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setNamespaceName(value: String): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
