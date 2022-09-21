package typings.ssh2.mod

import typings.ssh2.ssh2Strings.`keyboard-interactive`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardInteractiveAuthMethod
  extends StObject
     with AuthMethod
     with AnyAuthMethod {
  
  /**
    * This works exactly the same way as a 'keyboard-interactive' client event handler
    */
  def prompt(
    name: String,
    instructions: String,
    lang: String,
    prompts: js.Array[Prompt],
    finish: KeyboardInteractiveCallback
  ): Unit
  
  @JSName("type")
  var type_KeyboardInteractiveAuthMethod: `keyboard-interactive`
}
object KeyboardInteractiveAuthMethod {
  
  inline def apply(
    prompt: (String, String, String, js.Array[Prompt], KeyboardInteractiveCallback) => Unit,
    username: String
  ): KeyboardInteractiveAuthMethod = {
    val __obj = js.Dynamic.literal(prompt = js.Any.fromFunction5(prompt), username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("keyboard-interactive")
    __obj.asInstanceOf[KeyboardInteractiveAuthMethod]
  }
  
  extension [Self <: KeyboardInteractiveAuthMethod](x: Self) {
    
    inline def setPrompt(value: (String, String, String, js.Array[Prompt], KeyboardInteractiveCallback) => Unit): Self = StObject.set(x, "prompt", js.Any.fromFunction5(value))
    
    inline def setType(value: `keyboard-interactive`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
