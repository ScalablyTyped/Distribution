package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prompt extends StObject {
  
  var echo: js.UndefOr[Boolean] = js.undefined
  
  var prompt: String
}
object Prompt {
  
  inline def apply(prompt: String): Prompt = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prompt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Prompt] (val x: Self) extends AnyVal {
    
    inline def setEcho(value: Boolean): Self = StObject.set(x, "echo", value.asInstanceOf[js.Any])
    
    inline def setEchoUndefined: Self = StObject.set(x, "echo", js.undefined)
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
  }
}
