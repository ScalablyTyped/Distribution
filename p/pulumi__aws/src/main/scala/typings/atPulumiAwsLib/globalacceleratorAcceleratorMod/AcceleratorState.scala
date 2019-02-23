package typings
package atPulumiAwsLib.globalacceleratorAcceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorState extends js.Object {
  /**
    * The attributes of the accelerator. Fields documented below.
    */
  val attributes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FlowLogsEnabledFlowLogsS3Bucket]
  ] = js.undefined
  /**
    * Indicates whether the accelerator is enabled. The value is true or false. The default value is true.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The value for the address type must be `IPV4`.
    */
  val ipAddressType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * IP address set associated with the accelerator.
    */
  val ipSets: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_IpAddressesIpFamily]]
    ]
  ] = js.undefined
  /**
    * The name of the accelerator.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

