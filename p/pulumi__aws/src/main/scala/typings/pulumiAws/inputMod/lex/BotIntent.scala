package typings.pulumiAws.inputMod.lex

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BotIntent extends js.Object {
  
  /**
    * The name of the intent. Must be less than or equal to 100 characters in length.
    */
  var intentName: Input[String] = js.native
  
  /**
    * The version of the intent. Must be less than or equal to 64 characters in length.
    */
  var intentVersion: Input[String] = js.native
}
object BotIntent {
  
  @scala.inline
  def apply(intentName: Input[String], intentVersion: Input[String]): BotIntent = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], intentVersion = intentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotIntent]
  }
  
  @scala.inline
  implicit class BotIntentOps[Self <: BotIntent] (val x: Self) extends AnyVal {
    
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
    def setIntentName(value: Input[String]): Self = this.set("intentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentVersion(value: Input[String]): Self = this.set("intentVersion", value.asInstanceOf[js.Any])
  }
}
