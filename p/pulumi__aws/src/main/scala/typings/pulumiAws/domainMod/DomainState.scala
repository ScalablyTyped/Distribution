package typings.pulumiAws.domainMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainState extends js.Object {
  
  /**
    * The ARN of Domain.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The total size of all assets in the domain.
    */
  val assetSizeBytes: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A timestamp that represents the date and time the domain was created in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
    */
  val createdTime: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the domain to create. All domain names in an AWS Region that are in the same AWS account must be unique. The domain name is used as the prefix in DNS hostnames. Do not use sensitive information in a domain name because it is publicly discoverable.
    */
  val domain: js.UndefOr[Input[String]] = js.native
  
  /**
    * The encryption key for the domain. This is used to encrypt content stored in a domain. The KMS Key Amazon Resource Name (ARN).
    */
  val encryptionKey: js.UndefOr[Input[String]] = js.native
  
  /**
    * The AWS account ID that owns the domain.
    */
  val owner: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of repositories in the domain.
    */
  val repositoryCount: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Key-value map of resource tags.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object DomainState {
  
  @scala.inline
  def apply(): DomainState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainState]
  }
  
  @scala.inline
  implicit class DomainStateOps[Self <: DomainState] (val x: Self) extends AnyVal {
    
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
    def setAssetSizeBytes(value: Input[Double]): Self = this.set("assetSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetSizeBytes: Self = this.set("assetSizeBytes", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: Input[String]): Self = this.set("createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTime: Self = this.set("createdTime", js.undefined)
    
    @scala.inline
    def setDomain(value: Input[String]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: Input[String]): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
    
    @scala.inline
    def setOwner(value: Input[String]): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setRepositoryCount(value: Input[Double]): Self = this.set("repositoryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryCount: Self = this.set("repositoryCount", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
