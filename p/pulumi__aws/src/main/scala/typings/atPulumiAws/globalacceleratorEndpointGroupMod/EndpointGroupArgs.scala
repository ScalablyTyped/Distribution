package typings.atPulumiAws.globalacceleratorEndpointGroupMod

import typings.atPulumiAws.typesInputMod.globalaccelerator.EndpointGroupEndpointConfiguration
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointGroupArgs extends js.Object {
  /**
    * The list of endpoint objects. Fields documented below.
    */
  val endpointConfigurations: js.UndefOr[Input[js.Array[Input[EndpointGroupEndpointConfiguration]]]] = js.undefined
  val endpointGroupRegion: js.UndefOr[Input[String]] = js.undefined
  /**
    * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
    */
  val healthCheckIntervalSeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (/).
    */
  val healthCheckPath: js.UndefOr[Input[String]] = js.undefined
  /**
    * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
    */
  val healthCheckPort: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
    */
  val healthCheckProtocol: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  val listenerArn: Input[String]
  /**
    * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
    */
  val thresholdCount: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
    */
  val trafficDialPercentage: js.UndefOr[Input[Double]] = js.undefined
}

object EndpointGroupArgs {
  @scala.inline
  def apply(
    listenerArn: Input[String],
    endpointConfigurations: Input[js.Array[Input[EndpointGroupEndpointConfiguration]]] = null,
    endpointGroupRegion: Input[String] = null,
    healthCheckIntervalSeconds: Input[Double] = null,
    healthCheckPath: Input[String] = null,
    healthCheckPort: Input[Double] = null,
    healthCheckProtocol: Input[String] = null,
    thresholdCount: Input[Double] = null,
    trafficDialPercentage: Input[Double] = null
  ): EndpointGroupArgs = {
    val __obj = js.Dynamic.literal(listenerArn = listenerArn.asInstanceOf[js.Any])
    if (endpointConfigurations != null) __obj.updateDynamic("endpointConfigurations")(endpointConfigurations.asInstanceOf[js.Any])
    if (endpointGroupRegion != null) __obj.updateDynamic("endpointGroupRegion")(endpointGroupRegion.asInstanceOf[js.Any])
    if (healthCheckIntervalSeconds != null) __obj.updateDynamic("healthCheckIntervalSeconds")(healthCheckIntervalSeconds.asInstanceOf[js.Any])
    if (healthCheckPath != null) __obj.updateDynamic("healthCheckPath")(healthCheckPath.asInstanceOf[js.Any])
    if (healthCheckPort != null) __obj.updateDynamic("healthCheckPort")(healthCheckPort.asInstanceOf[js.Any])
    if (healthCheckProtocol != null) __obj.updateDynamic("healthCheckProtocol")(healthCheckProtocol.asInstanceOf[js.Any])
    if (thresholdCount != null) __obj.updateDynamic("thresholdCount")(thresholdCount.asInstanceOf[js.Any])
    if (trafficDialPercentage != null) __obj.updateDynamic("trafficDialPercentage")(trafficDialPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointGroupArgs]
  }
}

