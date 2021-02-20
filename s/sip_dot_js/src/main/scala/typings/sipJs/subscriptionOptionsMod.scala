package typings.sipJs

import typings.sipJs.subscriptionDelegateMod.SubscriptionDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionOptionsMod {
  
  @js.native
  trait SubscriptionOptions extends StObject {
    
    var delegate: js.UndefOr[SubscriptionDelegate] = js.native
  }
  object SubscriptionOptions {
    
    @scala.inline
    def apply(): SubscriptionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionOptions]
    }
    
    @scala.inline
    implicit class SubscriptionOptionsMutableBuilder[Self <: SubscriptionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelegate(value: SubscriptionDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    }
  }
}
