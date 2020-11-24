package typings.pulumiAws.stackSetInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackSetInstanceArgs extends js.Object {
  
  /**
    * Target AWS Account ID to create a Stack based on the StackSet. Defaults to current account.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of input parameters to override from the StackSet for this Instance.
    */
  val parameterOverrides: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Target AWS Region to create a Stack based on the StackSet. Defaults to current region.
    */
  val region: js.UndefOr[Input[String]] = js.native
  
  /**
    * During resource destroy, remove Instance from StackSet while keeping the Stack and its associated resources. Must be enabled in the state _before_ destroy operation to take effect. You cannot reassociate a retained Stack or add an existing, saved Stack to a new StackSet. Defaults to `false`.
    */
  val retainStack: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Name of the StackSet.
    */
  val stackSetName: Input[String] = js.native
}
object StackSetInstanceArgs {
  
  @scala.inline
  def apply(stackSetName: Input[String]): StackSetInstanceArgs = {
    val __obj = js.Dynamic.literal(stackSetName = stackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSetInstanceArgs]
  }
  
  @scala.inline
  implicit class StackSetInstanceArgsOps[Self <: StackSetInstanceArgs] (val x: Self) extends AnyVal {
    
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
    def setStackSetName(value: Input[String]): Self = this.set("stackSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountId(value: Input[String]): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setParameterOverrides(value: Input[StringDictionary[Input[String]]]): Self = this.set("parameterOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterOverrides: Self = this.set("parameterOverrides", js.undefined)
    
    @scala.inline
    def setRegion(value: Input[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setRetainStack(value: Input[Boolean]): Self = this.set("retainStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetainStack: Self = this.set("retainStack", js.undefined)
  }
}
