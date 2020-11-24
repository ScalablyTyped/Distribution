package typings.pulumiAws.userPoolDomainMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolDomainState extends js.Object {
  
  /**
    * The AWS account ID for the user pool owner.
    */
  val awsAccountId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The URL of the CloudFront distribution. This is required to generate the ALIAS `aws.route53.Record`
    */
  val cloudfrontDistributionArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The domain string.
    */
  val domain: js.UndefOr[Input[String]] = js.native
  
  /**
    * The S3 bucket where the static files for this domain are stored.
    */
  val s3Bucket: js.UndefOr[Input[String]] = js.native
  
  /**
    * The user pool ID.
    */
  val userPoolId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The app version.
    */
  val version: js.UndefOr[Input[String]] = js.native
}
object UserPoolDomainState {
  
  @scala.inline
  def apply(): UserPoolDomainState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolDomainState]
  }
  
  @scala.inline
  implicit class UserPoolDomainStateOps[Self <: UserPoolDomainState] (val x: Self) extends AnyVal {
    
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
    def setAwsAccountId(value: Input[String]): Self = this.set("awsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsAccountId: Self = this.set("awsAccountId", js.undefined)
    
    @scala.inline
    def setCertificateArn(value: Input[String]): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    
    @scala.inline
    def setCloudfrontDistributionArn(value: Input[String]): Self = this.set("cloudfrontDistributionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudfrontDistributionArn: Self = this.set("cloudfrontDistributionArn", js.undefined)
    
    @scala.inline
    def setDomain(value: Input[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setS3Bucket(value: Input[String]): Self = this.set("s3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Bucket: Self = this.set("s3Bucket", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: Input[String]): Self = this.set("userPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPoolId: Self = this.set("userPoolId", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
