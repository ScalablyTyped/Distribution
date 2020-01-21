package typings.pulumiCloud.mod

import typings.pulumiCloud.serviceMod.ServiceArguments
import typings.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", "Service")
@js.native
class ServiceCls protected ()
  extends typings.pulumiCloud.serviceMod.Service {
  /**
    * Construct a new Service, which is one or more managed replicas of a group of one or more Containers.
    *
    * @param name The unique name of the service.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: String, args: ServiceArguments) = this()
  def this(name: String, args: ServiceArguments, opts: ResourceOptions) = this()
}

