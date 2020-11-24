package typings.pulumiAws.activationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivationArgs extends js.Object {
  
  /**
    * The description of the resource that you want to register.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * UTC timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time. This provider will only perform drift detection of its value when present in a configuration.
    */
  val expirationDate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IAM Role to attach to the managed instance.
    */
  val iamRole: Input[String] = js.native
  
  /**
    * The default name of the registered managed instance.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum number of managed instances you want to register. The default value is 1 instance.
    */
  val registrationLimit: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A map of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ActivationArgs {
  
  @scala.inline
  def apply(iamRole: Input[String]): ActivationArgs = {
    val __obj = js.Dynamic.literal(iamRole = iamRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationArgs]
  }
  
  @scala.inline
  implicit class ActivationArgsOps[Self <: ActivationArgs] (val x: Self) extends AnyVal {
    
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
    def setIamRole(value: Input[String]): Self = this.set("iamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: Input[String]): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRegistrationLimit(value: Input[Double]): Self = this.set("registrationLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistrationLimit: Self = this.set("registrationLimit", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
