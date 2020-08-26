package typings.pulumiAws.lightsailInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
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
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * launch script to configure server with additional user data
    */
  val userData: js.UndefOr[Input[String]] = js.native
  val username: js.UndefOr[Input[String]] = js.native
}

object InstanceState {
  @scala.inline
  def apply(): InstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceState]
  }
  @scala.inline
  implicit class InstanceStateOps[Self <: InstanceState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setBlueprintId(value: Input[String]): Self = this.set("blueprintId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlueprintId: Self = this.set("blueprintId", js.undefined)
    @scala.inline
    def setBundleId(value: Input[String]): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    @scala.inline
    def setCpuCount(value: Input[Double]): Self = this.set("cpuCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuCount: Self = this.set("cpuCount", js.undefined)
    @scala.inline
    def setCreatedAt(value: Input[String]): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setIpv6Address(value: Input[String]): Self = this.set("ipv6Address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6Address: Self = this.set("ipv6Address", js.undefined)
    @scala.inline
    def setIsStaticIp(value: Input[Boolean]): Self = this.set("isStaticIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStaticIp: Self = this.set("isStaticIp", js.undefined)
    @scala.inline
    def setKeyPairName(value: Input[String]): Self = this.set("keyPairName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPairName: Self = this.set("keyPairName", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: Input[String]): Self = this.set("privateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("privateIpAddress", js.undefined)
    @scala.inline
    def setPublicIpAddress(value: Input[String]): Self = this.set("publicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIpAddress: Self = this.set("publicIpAddress", js.undefined)
    @scala.inline
    def setRamSize(value: Input[Double]): Self = this.set("ramSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRamSize: Self = this.set("ramSize", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUserData(value: Input[String]): Self = this.set("userData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
    @scala.inline
    def setUsername(value: Input[String]): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

