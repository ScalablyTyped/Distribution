package typings.signalr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    def supportsKeepAlive(): Boolean = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, supportsKeepAlive: () => Boolean): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], supportsKeepAlive = js.Any.fromFunction0(supportsKeepAlive))
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsKeepAlive(value: () => Boolean): Self = StObject.set(x, "supportsKeepAlive", js.Any.fromFunction0(value))
    }
  }
}
