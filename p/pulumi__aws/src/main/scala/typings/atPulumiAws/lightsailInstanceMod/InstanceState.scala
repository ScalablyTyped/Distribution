package typings.atPulumiAws.lightsailInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceState extends js.Object {
  /**
    * The ARN of the Lightsail instance (matches `id`).
    * * `availability_zone`
    * * `blueprint_id`
    * * `bundle_id`
    * * `key_pair_name`
    * * `user_data`
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Availability Zone in which to create your
    * instance (see list below)
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID for a virtual private server image
    * (see list below)
    */
  val blueprintId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The bundle of specification information (see list below)
    */
  val bundleId: js.UndefOr[Input[String]] = js.undefined
  val cpuCount: js.UndefOr[Input[Double]] = js.undefined
  val createdAt: js.UndefOr[Input[String]] = js.undefined
  val ipv6Address: js.UndefOr[Input[String]] = js.undefined
  val isStaticIp: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The name of your key pair. Created in the
    * Lightsail console (cannot use `aws_key_pair` at this time)
    */
  val keyPairName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the Lightsail Instance
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  val privateIpAddress: js.UndefOr[Input[String]] = js.undefined
  val publicIpAddress: js.UndefOr[Input[String]] = js.undefined
  val ramSize: js.UndefOr[Input[Double]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * launch script to configure server with additional user data
    */
  val userData: js.UndefOr[Input[String]] = js.undefined
  val username: js.UndefOr[Input[String]] = js.undefined
}

object InstanceState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    availabilityZone: Input[String] = null,
    blueprintId: Input[String] = null,
    bundleId: Input[String] = null,
    cpuCount: Input[Double] = null,
    createdAt: Input[String] = null,
    ipv6Address: Input[String] = null,
    isStaticIp: Input[Boolean] = null,
    keyPairName: Input[String] = null,
    name: Input[String] = null,
    privateIpAddress: Input[String] = null,
    publicIpAddress: Input[String] = null,
    ramSize: Input[Double] = null,
    tags: Input[StringDictionary[_]] = null,
    userData: Input[String] = null,
    username: Input[String] = null
  ): InstanceState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (blueprintId != null) __obj.updateDynamic("blueprintId")(blueprintId.asInstanceOf[js.Any])
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    if (cpuCount != null) __obj.updateDynamic("cpuCount")(cpuCount.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (ipv6Address != null) __obj.updateDynamic("ipv6Address")(ipv6Address.asInstanceOf[js.Any])
    if (isStaticIp != null) __obj.updateDynamic("isStaticIp")(isStaticIp.asInstanceOf[js.Any])
    if (keyPairName != null) __obj.updateDynamic("keyPairName")(keyPairName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress.asInstanceOf[js.Any])
    if (publicIpAddress != null) __obj.updateDynamic("publicIpAddress")(publicIpAddress.asInstanceOf[js.Any])
    if (ramSize != null) __obj.updateDynamic("ramSize")(ramSize.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceState]
  }
}

