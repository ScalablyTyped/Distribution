package typings.pulumiAws.inputMod.lex

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntentFulfillmentActivity extends js.Object {
  
  /**
    * A description of the Lambda function that is run to fulfill the intent.
    * Required if type is CodeHook. Attributes are documented under code_hook.
    */
  var codeHook: js.UndefOr[Input[IntentFulfillmentActivityCodeHook]] = js.native
  
  /**
    * How the intent should be fulfilled, either by running a Lambda function or by
    * returning the slot data to the client application.
    */
  var `type`: Input[String] = js.native
}
object IntentFulfillmentActivity {
  
  @scala.inline
  def apply(`type`: Input[String]): IntentFulfillmentActivity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentFulfillmentActivity]
  }
  
  @scala.inline
  implicit class IntentFulfillmentActivityOps[Self <: IntentFulfillmentActivity] (val x: Self) extends AnyVal {
    
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
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeHook(value: Input[IntentFulfillmentActivityCodeHook]): Self = this.set("codeHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeHook: Self = this.set("codeHook", js.undefined)
  }
}
