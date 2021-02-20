package typings.psl

import typings.psl.pslStrings.DOMAIN_TOO_LONG
import typings.psl.pslStrings.DOMAIN_TOO_SHORT
import typings.psl.pslStrings.LABEL_ENDS_WITH_DASH
import typings.psl.pslStrings.LABEL_INVALID_CHARS
import typings.psl.pslStrings.LABEL_STARTS_WITH_DASH
import typings.psl.pslStrings.LABEL_TOO_LONG
import typings.psl.pslStrings.LABEL_TOO_SHORT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Code extends StObject {
    
    var code: DOMAIN_TOO_SHORT | DOMAIN_TOO_LONG | LABEL_STARTS_WITH_DASH | LABEL_ENDS_WITH_DASH | LABEL_TOO_LONG | LABEL_TOO_SHORT | LABEL_INVALID_CHARS = js.native
    
    var message: String = js.native
  }
  object Code {
    
    @scala.inline
    def apply(
      code: DOMAIN_TOO_SHORT | DOMAIN_TOO_LONG | LABEL_STARTS_WITH_DASH | LABEL_ENDS_WITH_DASH | LABEL_TOO_LONG | LABEL_TOO_SHORT | LABEL_INVALID_CHARS,
      message: String
    ): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(
        value: DOMAIN_TOO_SHORT | DOMAIN_TOO_LONG | LABEL_STARTS_WITH_DASH | LABEL_ENDS_WITH_DASH | LABEL_TOO_LONG | LABEL_TOO_SHORT | LABEL_INVALID_CHARS
      ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
