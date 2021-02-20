package typings.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeMod {
  
  @js.native
  trait Runtime extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object Runtime {
    
    @scala.inline
    def apply(): Runtime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Runtime]
    }
    
    @scala.inline
    implicit class RuntimeMutableBuilder[Self <: Runtime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
