package typings.pulumiAws.inputMod.appmesh

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecServiceDiscoveryAwsCloudMap extends js.Object {
  
  /**
    * A string map that contains attributes with values that you can use to filter instances by any custom attribute that you specified when you registered the instance. Only instances that match all of the specified key/value pairs will be returned.
    */
  var attributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The name of the AWS Cloud Map namespace to use.
    * Use the `aws.servicediscovery.HttpNamespace` resource to configure a Cloud Map namespace. Must be between 1 and 1024 characters in length.
    */
  var namespaceName: Input[String] = js.native
  
  /**
    * The name of the AWS Cloud Map service to use. Use the `aws.servicediscovery.Service` resource to configure a Cloud Map service. Must be between 1 and 1024 characters in length.
    */
  var serviceName: Input[String] = js.native
}
object VirtualNodeSpecServiceDiscoveryAwsCloudMap {
  
  @scala.inline
  def apply(namespaceName: Input[String], serviceName: Input[String]): VirtualNodeSpecServiceDiscoveryAwsCloudMap = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecServiceDiscoveryAwsCloudMap]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecServiceDiscoveryAwsCloudMapOps[Self <: VirtualNodeSpecServiceDiscoveryAwsCloudMap] (val x: Self) extends AnyVal {
    
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
    def setNamespaceName(value: Input[String]): Self = this.set("namespaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: Input[String]): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: Input[StringDictionary[Input[String]]]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
  }
}
