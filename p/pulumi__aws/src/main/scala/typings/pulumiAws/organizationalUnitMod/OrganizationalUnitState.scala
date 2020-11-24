package typings.pulumiAws.organizationalUnitMod

import typings.pulumiAws.inputMod.organizations.OrganizationalUnitAccount
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationalUnitState extends js.Object {
  
  /**
    * List of child accounts for this Organizational Unit. Does not return account information for child Organizational Units. All elements have these attributes:
    */
  val accounts: js.UndefOr[Input[js.Array[Input[OrganizationalUnitAccount]]]] = js.native
  
  /**
    * ARN of the organizational unit
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name for the organizational unit
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * ID of the parent organizational unit, which may be the root
    */
  val parentId: js.UndefOr[Input[String]] = js.native
}
object OrganizationalUnitState {
  
  @scala.inline
  def apply(): OrganizationalUnitState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationalUnitState]
  }
  
  @scala.inline
  implicit class OrganizationalUnitStateOps[Self <: OrganizationalUnitState] (val x: Self) extends AnyVal {
    
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
    def setAccountsVarargs(value: Input[OrganizationalUnitAccount]*): Self = this.set("accounts", js.Array(value :_*))
    
    @scala.inline
    def setAccounts(value: Input[js.Array[Input[OrganizationalUnitAccount]]]): Self = this.set("accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccounts: Self = this.set("accounts", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentId(value: Input[String]): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
  }
}
