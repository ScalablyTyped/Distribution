package typings.screenfull

import typings.screenfull.screenfullBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait IsEnabled extends StObject {
    
    var isEnabled: `false` = js.native
  }
  object IsEnabled {
    
    @scala.inline
    def apply(isEnabled: `false`): IsEnabled = {
      val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsEnabled]
    }
    
    @scala.inline
    implicit class IsEnabledMutableBuilder[Self <: IsEnabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsEnabled(value: `false`): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    }
  }
}
