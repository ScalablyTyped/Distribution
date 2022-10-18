package typings.sipJs

import typings.sipJs.libApiSubscriptionDelegateMod.SubscriptionDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiSubscriptionOptionsMod {
  
  trait SubscriptionOptions extends StObject {
    
    var delegate: js.UndefOr[SubscriptionDelegate] = js.undefined
  }
  object SubscriptionOptions {
    
    inline def apply(): SubscriptionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionOptions]
    }
    
    extension [Self <: SubscriptionOptions](x: Self) {
      
      inline def setDelegate(value: SubscriptionDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    }
  }
}
