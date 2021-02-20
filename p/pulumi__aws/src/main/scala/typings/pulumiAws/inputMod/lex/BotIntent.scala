package typings.pulumiAws.inputMod.lex

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BotIntent extends StObject {
  
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
  implicit class BotIntentMutableBuilder[Self <: BotIntent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntentName(value: Input[String]): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentVersion(value: Input[String]): Self = StObject.set(x, "intentVersion", value.asInstanceOf[js.Any])
  }
}
