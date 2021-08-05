package typings.serverless.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prompt extends StObject {
  
  var prompt: js.UndefOr[String] = js.undefined
  
  var redirect: js.UndefOr[Boolean] = js.undefined
}
object Prompt {
  
  inline def apply(): Prompt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prompt]
  }
  
  extension [Self <: Prompt](x: Self) {
    
    inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    inline def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
  }
}
