package typings.pulumiAws.outputMod.lex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotIntent extends StObject {
  
  /**
    * The name of the intent. Must be less than or equal to 100 characters in length.
    */
  var intentName: String
  
  /**
    * The version of the intent. Must be less than or equal to 64 characters in length.
    */
  var intentVersion: String
}
object BotIntent {
  
  @scala.inline
  def apply(intentName: String, intentVersion: String): BotIntent = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], intentVersion = intentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotIntent]
  }
  
  @scala.inline
  implicit class BotIntentMutableBuilder[Self <: BotIntent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntentName(value: String): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentVersion(value: String): Self = StObject.set(x, "intentVersion", value.asInstanceOf[js.Any])
  }
}
