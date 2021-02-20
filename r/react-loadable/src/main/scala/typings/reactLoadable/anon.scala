package typings.reactLoadable

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Default[Props] extends StObject {
    
    var default: ComponentType[Props] = js.native
  }
  object Default {
    
    @scala.inline
    def apply[Props](default: ComponentType[Props]): Default[Props] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default[Props]]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default[_], Props] (val x: Self with Default[Props]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: ComponentType[Props]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
}
