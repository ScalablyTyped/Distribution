package typings.screenfull

import typings.screenfull.screenfullBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsEnabled extends StObject {
    
    var isEnabled: `false`
  }
  object IsEnabled {
    
    @scala.inline
    def apply(): IsEnabled = {
      val __obj = js.Dynamic.literal(isEnabled = false)
      __obj.asInstanceOf[IsEnabled]
    }
    
    @scala.inline
    implicit class IsEnabledMutableBuilder[Self <: IsEnabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsEnabled(value: `false`): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    }
  }
}
