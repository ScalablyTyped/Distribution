package typings
package atPulumiAwsLib.globalacceleratorEndpointGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointGroupState extends js.Object {
  /**
    * The list of endpoint objects. Fields documented below.
    */
  val endpointConfigurations: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EndpointIdWeight]]
    ]
  ] = js.undefined
  val endpointGroupRegion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
    */
  val healthCheckIntervalSeconds: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (/).
    */
  val healthCheckPath: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
    */
  val healthCheckPort: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
    */
  val healthCheckProtocol: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  val listenerArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
    */
  val thresholdCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
    */
  val trafficDialPercentage: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object EndpointGroupState {
  @scala.inline
  def apply(
    endpointConfigurations: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EndpointIdWeight]]
    ] = null,
    endpointGroupRegion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    healthCheckIntervalSeconds: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    healthCheckPath: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    healthCheckPort: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    healthCheckProtocol: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    listenerArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    thresholdCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    trafficDialPercentage: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): EndpointGroupState = {
    val __obj = js.Dynamic.literal()
    if (endpointConfigurations != null) __obj.updateDynamic("endpointConfigurations")(endpointConfigurations.asInstanceOf[js.Any])
    if (endpointGroupRegion != null) __obj.updateDynamic("endpointGroupRegion")(endpointGroupRegion.asInstanceOf[js.Any])
    if (healthCheckIntervalSeconds != null) __obj.updateDynamic("healthCheckIntervalSeconds")(healthCheckIntervalSeconds.asInstanceOf[js.Any])
    if (healthCheckPath != null) __obj.updateDynamic("healthCheckPath")(healthCheckPath.asInstanceOf[js.Any])
    if (healthCheckPort != null) __obj.updateDynamic("healthCheckPort")(healthCheckPort.asInstanceOf[js.Any])
    if (healthCheckProtocol != null) __obj.updateDynamic("healthCheckProtocol")(healthCheckProtocol.asInstanceOf[js.Any])
    if (listenerArn != null) __obj.updateDynamic("listenerArn")(listenerArn.asInstanceOf[js.Any])
    if (thresholdCount != null) __obj.updateDynamic("thresholdCount")(thresholdCount.asInstanceOf[js.Any])
    if (trafficDialPercentage != null) __obj.updateDynamic("trafficDialPercentage")(trafficDialPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointGroupState]
  }
}

