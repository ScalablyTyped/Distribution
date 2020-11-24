package typings.pulumiAws.usagePlanKeyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsagePlanKeyState extends js.Object {
  
  /**
    * The identifier of the API key resource.
    */
  val keyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of the API key resource. Currently, the valid key type is API_KEY.
    */
  val keyType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of a usage plan key.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Id of the usage plan resource representing to associate the key to.
    */
  val usagePlanId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The value of a usage plan key.
    */
  val value: js.UndefOr[Input[String]] = js.native
}
object UsagePlanKeyState {
  
  @scala.inline
  def apply(): UsagePlanKeyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsagePlanKeyState]
  }
  
  @scala.inline
  implicit class UsagePlanKeyStateOps[Self <: UsagePlanKeyState] (val x: Self) extends AnyVal {
    
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
    def setKeyId(value: Input[String]): Self = this.set("keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
    
    @scala.inline
    def setKeyType(value: Input[String]): Self = this.set("keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyType: Self = this.set("keyType", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUsagePlanId(value: Input[String]): Self = this.set("usagePlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsagePlanId: Self = this.set("usagePlanId", js.undefined)
    
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
