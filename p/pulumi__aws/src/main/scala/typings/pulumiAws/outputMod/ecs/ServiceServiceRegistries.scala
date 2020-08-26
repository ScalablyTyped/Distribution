package typings.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceServiceRegistries extends js.Object {
  /**
    * The container name value, already specified in the task definition, to be used for your service discovery service.
    */
  var containerName: js.UndefOr[String] = js.native
  /**
    * The port value, already specified in the task definition, to be used for your service discovery service.
    */
  var containerPort: js.UndefOr[Double] = js.native
  /**
    * The port value used if your Service Discovery service specified an SRV record.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * The ARN of the Service Registry. The currently supported service registry is Amazon Route 53 Auto Naming Service(`aws.servicediscovery.Service`). For more information, see [Service](https://docs.aws.amazon.com/Route53/latest/APIReference/API_autonaming_Service.html)
    */
  var registryArn: String = js.native
}

object ServiceServiceRegistries {
  @scala.inline
  def apply(registryArn: String): ServiceServiceRegistries = {
    val __obj = js.Dynamic.literal(registryArn = registryArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceServiceRegistries]
  }
  @scala.inline
  implicit class ServiceServiceRegistriesOps[Self <: ServiceServiceRegistries] (val x: Self) extends AnyVal {
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
    def setRegistryArn(value: String): Self = this.set("registryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerName: Self = this.set("containerName", js.undefined)
    @scala.inline
    def setContainerPort(value: Double): Self = this.set("containerPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerPort: Self = this.set("containerPort", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

