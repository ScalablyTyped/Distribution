package typings.pulumiAws.glacierVaultMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.glacier.VaultNotification
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VaultState extends js.Object {
  
  /**
    * The policy document. This is a JSON formatted string.
    * The heredoc syntax or `file` function is helpful here. Use the [Glacier Developer Guide](https://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html) for more information on Glacier Vault Policy
    */
  val accessPolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the vault.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The URI of the vault that was created.
    */
  val location: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the Vault. Names can be between 1 and 255 characters long and the valid characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The notifications for the Vault. Fields documented below.
    */
  val notifications: js.UndefOr[Input[js.Array[Input[VaultNotification]]]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object VaultState {
  
  @scala.inline
  def apply(): VaultState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VaultState]
  }
  
  @scala.inline
  implicit class VaultStateOps[Self <: VaultState] (val x: Self) extends AnyVal {
    
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
    def setAccessPolicy(value: Input[String]): Self = this.set("accessPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessPolicy: Self = this.set("accessPolicy", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setLocation(value: Input[String]): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotificationsVarargs(value: Input[VaultNotification]*): Self = this.set("notifications", js.Array(value :_*))
    
    @scala.inline
    def setNotifications(value: Input[js.Array[Input[VaultNotification]]]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifications: Self = this.set("notifications", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
