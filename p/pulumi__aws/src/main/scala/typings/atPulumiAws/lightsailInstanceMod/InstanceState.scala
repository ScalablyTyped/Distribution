package typings.atPulumiAws.lightsailInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceState extends js.Object {
  /**
    * The ARN of the Lightsail instance (matches `id`).
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The Availability Zone in which to create your
    * instance (see list below)
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The ID for a virtual private server image
    * (see list below)
    */
  val blueprintId: js.UndefOr[Input[String]] = js.native
  /**
    * The bundle of specification information (see list below)
    */
  val bundleId: js.UndefOr[Input[String]] = js.native
  val cpuCount: js.UndefOr[Input[Double]] = js.native
  /**
    * The timestamp when the instance was created.
    * * `availabilityZone`
    * * `blueprintId`
    * * `bundleId`
    * * `keyPairName`
    * * `userData`
    */
  val createdAt: js.UndefOr[Input[String]] = js.native
  val ipv6Address: js.UndefOr[Input[String]] = js.native
  val isStaticIp: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of your key pair. Created in the
    * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
    */
  val keyPairName: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
    */
  val name: js.UndefOr[Input[String]] = js.native
  val privateIpAddress: js.UndefOr[Input[String]] = js.native
  val publicIpAddress: js.UndefOr[Input[String]] = js.native
  val ramSize: js.UndefOr[Input[Double]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * launch script to configure server with additional user data
    */
  val userData: js.UndefOr[Input[String]] = js.native
  val username: js.UndefOr[Input[String]] = js.native
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

