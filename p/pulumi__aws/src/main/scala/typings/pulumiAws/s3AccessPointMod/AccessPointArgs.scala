package typings.pulumiAws.s3AccessPointMod

import typings.pulumiAws.inputMod.s3.AccessPointPublicAccessBlockConfiguration
import typings.pulumiAws.inputMod.s3.AccessPointVpcConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessPointArgs extends js.Object {
  
  /**
    * The AWS account ID for the owner of the bucket for which you want to create an access point. Defaults to automatically determined account ID of the provider.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of an AWS Partition S3 Bucket or the Amazon Resource Name (ARN) of S3 on Outposts Bucket that you want to associate this access point with.
    */
  val bucket: Input[String] = js.native
  
  /**
    * The name you want to assign to this access point.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A valid JSON document that specifies the policy that you want to apply to this access point.
    */
  val policy: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. Detailed below.
    */
  val publicAccessBlockConfiguration: js.UndefOr[Input[AccessPointPublicAccessBlockConfiguration]] = js.native
  
  /**
    * Configuration block to restrict access to this access point to requests from the specified Virtual Private Cloud (VPC). Required for S3 on Outposts. Detailed below.
    */
  val vpcConfiguration: js.UndefOr[Input[AccessPointVpcConfiguration]] = js.native
}
object AccessPointArgs {
  
  @scala.inline
  def apply(bucket: Input[String]): AccessPointArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPointArgs]
  }
  
  @scala.inline
  implicit class AccessPointArgsOps[Self <: AccessPointArgs] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountId(value: Input[String]): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
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
