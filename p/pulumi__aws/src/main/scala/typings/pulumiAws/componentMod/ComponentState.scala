package typings.pulumiAws.componentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentState extends js.Object {
  
  /**
    * (Required) Amazon Resource Name (ARN) of the component.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Change description of the component.
    */
  val changeDescription: js.UndefOr[Input[String]] = js.native
  
  val data: js.UndefOr[Input[String]] = js.native
  
  /**
    * Date the component was created.
    */
  val dateCreated: js.UndefOr[Input[String]] = js.native
  
  /**
    * Description of the component.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Encryption status of the component.
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key used to encrypt the component.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name of the component.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Owner of the component.
    */
  val owner: js.UndefOr[Input[String]] = js.native
  
  /**
    * Platform of the component.
    */
  val platform: js.UndefOr[Input[String]] = js.native
  
  /**
    * Set of Operating Systems (OS) supported by the component.
    */
  val supportedOsVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Key-value map of resource tags for the component.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Type of the component.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
  
  /**
    * S3 URI with data of the component. Exactly one of `data` and `uri` can be specified.
    */
  val uri: js.UndefOr[Input[String]] = js.native
  
  /**
    * Version of the component.
    */
  val version: js.UndefOr[Input[String]] = js.native
}
object ComponentState {
  
  @scala.inline
  def apply(): ComponentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentState]
  }
  
  @scala.inline
  implicit class ComponentStateOps[Self <: ComponentState] (val x: Self) extends AnyVal {
    
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
    def setChangeDescription(value: Input[String]): Self = this.set("changeDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeDescription: Self = this.set("changeDescription", js.undefined)
    
    @scala.inline
    def setData(value: Input[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDateCreated(value: Input[String]): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateCreated: Self = this.set("dateCreated", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Input[Boolean]): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwner(value: Input[String]): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setPlatform(value: Input[String]): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setSupportedOsVersionsVarargs(value: Input[String]*): Self = this.set("supportedOsVersions", js.Array(value :_*))
    
    @scala.inline
    def setSupportedOsVersions(value: Input[js.Array[Input[String]]]): Self = this.set("supportedOsVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedOsVersions: Self = this.set("supportedOsVersions", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUri(value: Input[String]): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
