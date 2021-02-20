package typings.slug

import typings.slug.mod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Pretty extends StObject {
    
    var pretty: Mode = js.native
    
    var rfc3986: Mode = js.native
  }
  object Pretty {
    
    @scala.inline
    def apply(pretty: Mode, rfc3986: Mode): Pretty = {
      val __obj = js.Dynamic.literal(pretty = pretty.asInstanceOf[js.Any], rfc3986 = rfc3986.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pretty]
    }
    
    @scala.inline
    implicit class PrettyMutableBuilder[Self <: Pretty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPretty(value: Mode): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRfc3986(value: Mode): Self = StObject.set(x, "rfc3986", value.asInstanceOf[js.Any])
    }
  }
}
