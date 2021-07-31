package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prompt extends StObject {
  
  var echo: js.UndefOr[Boolean] = js.undefined
  
  var prompt: String
}
object Prompt {
  
  @scala.inline
  def apply(prompt: String): Prompt = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prompt]
  }
  
  @scala.inline
  implicit class PromptMutableBuilder[Self <: Prompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEcho(value: Boolean): Self = StObject.set(x, "echo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoUndefined: Self = StObject.set(x, "echo", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
  }
}
