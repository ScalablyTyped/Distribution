package typings.serverless.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prompt extends StObject {
  
  var prompt: js.UndefOr[String] = js.native
  
  var redirect: js.UndefOr[Boolean] = js.native
}
object Prompt {
  
  @scala.inline
  def apply(): Prompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prompt]
  }
  
  @scala.inline
  implicit class PromptMutableBuilder[Self <: Prompt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    @scala.inline
    def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
  }
}
