package typings.pulumiAws.endpointGroupMod

import typings.pulumiAws.outputMod.globalaccelerator.EndpointGroupEndpointConfiguration
import typings.pulumiAws.outputMod.globalaccelerator.EndpointGroupPortOverride
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/globalaccelerator/endpointGroup", "EndpointGroup")
@js.native
class EndpointGroup protected () extends CustomResource {
  /**
    * Create a EndpointGroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EndpointGroupArgs) = this()
  def this(name: String, args: EndpointGroupArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The list of endpoint objects. Fields documented below.
    */
  val endpointConfigurations: Output_[js.UndefOr[js.Array[EndpointGroupEndpointConfiguration]]] = js.native
  
  /**
    * The name of the AWS Region where the endpoint group is located.
    */
  val endpointGroupRegion: Output_[String] = js.native
  
  /**
    * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
    */
  val healthCheckIntervalSeconds: Output_[js.UndefOr[Double]] = js.native
  
  val healthCheckPath: Output_[String] = js.native
  
  val healthCheckPort: Output_[Double] = js.native
  
  /**
    * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
    */
  val healthCheckProtocol: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  val listenerArn: Output_[String] = js.native
  
  /**
    * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
    */
  val portOverrides: Output_[js.UndefOr[js.Array[EndpointGroupPortOverride]]] = js.native
  
  /**
    * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
    */
  val thresholdCount: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
    */
  val trafficDialPercentage: Output_[js.UndefOr[Double]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/globalaccelerator/endpointGroup", "EndpointGroup")
@js.native
object EndpointGroup extends js.Object {
  
  /**
    * Get an existing EndpointGroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): EndpointGroup = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EndpointGroup = js.native
  def get(name: String, id: Input[ID], state: EndpointGroupState): EndpointGroup = js.native
  def get(name: String, id: Input[ID], state: EndpointGroupState, opts: CustomResourceOptions): EndpointGroup = js.native
  
  /**
    * Returns true if the given object is an instance of EndpointGroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/globalaccelerator/endpointGroup.EndpointGroup */ Boolean = js.native
}
