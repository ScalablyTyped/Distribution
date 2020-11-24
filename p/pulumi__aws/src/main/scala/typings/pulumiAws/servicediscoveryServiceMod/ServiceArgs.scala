package typings.pulumiAws.servicediscoveryServiceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.servicediscovery.ServiceDnsConfig
import typings.pulumiAws.inputMod.servicediscovery.ServiceHealthCheckConfig
import typings.pulumiAws.inputMod.servicediscovery.ServiceHealthCheckCustomConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceArgs extends js.Object {
  
  /**
    * The description of the service.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
    */
  val dnsConfig: js.UndefOr[Input[ServiceDnsConfig]] = js.native
  
  /**
    * A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
    */
  val healthCheckConfig: js.UndefOr[Input[ServiceHealthCheckConfig]] = js.native
  
  /**
    * A complex type that contains settings for ECS managed health checks.
    */
  val healthCheckCustomConfig: js.UndefOr[Input[ServiceHealthCheckCustomConfig]] = js.native
  
  /**
    * The name of the service.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the namespace to use for DNS configuration.
    */
  val namespaceId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the service.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ServiceArgs {
  
  @scala.inline
  def apply(): ServiceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceArgs]
  }
  
  @scala.inline
  implicit class ServiceArgsOps[Self <: ServiceArgs] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDnsConfig(value: Input[ServiceDnsConfig]): Self = this.set("dnsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsConfig: Self = this.set("dnsConfig", js.undefined)
    
    @scala.inline
    def setHealthCheckConfig(value: Input[ServiceHealthCheckConfig]): Self = this.set("healthCheckConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckConfig: Self = this.set("healthCheckConfig", js.undefined)
    
    @scala.inline
    def setHealthCheckCustomConfig(value: Input[ServiceHealthCheckCustomConfig]): Self = this.set("healthCheckCustomConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckCustomConfig: Self = this.set("healthCheckCustomConfig", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamespaceId(value: Input[String]): Self = this.set("namespaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceId: Self = this.set("namespaceId", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
