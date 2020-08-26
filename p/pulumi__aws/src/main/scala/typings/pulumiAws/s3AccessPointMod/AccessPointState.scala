package typings.pulumiAws.s3AccessPointMod

import typings.pulumiAws.inputMod.s3.AccessPointPublicAccessBlockConfiguration
import typings.pulumiAws.inputMod.s3.AccessPointVpcConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessPointState extends js.Object {
  /**
    * The AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the provider.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the S3 Access Point.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the bucket that you want to associate this access point with.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  /**
    * The DNS domain name of the S3 Access Point in the format _`name`_-_`accountId`_.s3-accesspoint._region_.amazonaws.com.
    * Note: S3 access points only support secure access by HTTPS. HTTP isn't supported.
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether this access point currently has a policy that allows public access.
    */
  val hasPublicAccessPolicy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name you want to assign to this access point.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates whether this access point allows access from the public Internet. Values are `VPC` (the access point doesn't allow access from the public Internet) and `Internet` (the access point allows access from the public Internet, subject to the access point and bucket access policies).
    */
  val networkOrigin: js.UndefOr[Input[String]] = js.native
  /**
    * A valid JSON document that specifies the policy that you want to apply to this access point.
    */
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
    */
  val publicAccessBlockConfiguration: js.UndefOr[Input[AccessPointPublicAccessBlockConfiguration]] = js.native
  /**
    * Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Detailed below.
    */
  val vpcConfiguration: js.UndefOr[Input[AccessPointVpcConfiguration]] = js.native
}

object AccessPointState {
  @scala.inline
  def apply(): AccessPointState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPointState]
  }
  @scala.inline
  implicit class AccessPointStateOps[Self <: AccessPointState] (val x: Self) extends AnyVal {
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
    def setAccountId(value: Input[String]): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    @scala.inline
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    @scala.inline
    def setHasPublicAccessPolicy(value: Input[Boolean]): Self = this.set("hasPublicAccessPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasPublicAccessPolicy: Self = this.set("hasPublicAccessPolicy", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetworkOrigin(value: Input[String]): Self = this.set("networkOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkOrigin: Self = this.set("networkOrigin", js.undefined)
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setPublicAccessBlockConfiguration(value: Input[AccessPointPublicAccessBlockConfiguration]): Self = this.set("publicAccessBlockConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicAccessBlockConfiguration: Self = this.set("publicAccessBlockConfiguration", js.undefined)
    @scala.inline
    def setVpcConfiguration(value: Input[AccessPointVpcConfiguration]): Self = this.set("vpcConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfiguration: Self = this.set("vpcConfiguration", js.undefined)
  }
  
}

