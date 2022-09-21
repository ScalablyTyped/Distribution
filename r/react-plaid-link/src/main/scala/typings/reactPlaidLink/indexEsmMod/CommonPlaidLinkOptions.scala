package typings.reactPlaidLink.indexEsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonPlaidLinkOptions extends StObject {
  
  // A callback that is called during a user's flow in Link.
  // See all values for eventName here https://plaid.com/docs/link/web/#link-web-onevent-eventName
  var onEvent: js.UndefOr[PlaidLinkOnEvent] = js.undefined
  
  // A callback that is called when a user has specifically exited Link flow
  var onExit: js.UndefOr[PlaidLinkOnExit] = js.undefined
  
  // A callback that is called when the Link module has finished loading.
  // Calls to plaidLinkHandler.open() prior to the onLoad callback will be
  // delayed until the module is fully loaded.
  var onLoad: js.UndefOr[PlaidLinkOnLoad] = js.undefined
  
  // A function that is called when a user has successfully connecter an Item.
  // The function should expect two arguments, the public_key and a metadata object
  var onSuccess: PlaidLinkOnSuccess
}
object CommonPlaidLinkOptions {
  
  inline def apply(onSuccess: (/* public_token */ String, /* metadata */ PlaidLinkOnSuccessMetadata) => Unit): CommonPlaidLinkOptions = {
    val __obj = js.Dynamic.literal(onSuccess = js.Any.fromFunction2(onSuccess))
    __obj.asInstanceOf[CommonPlaidLinkOptions]
  }
  
  extension [Self <: CommonPlaidLinkOptions](x: Self) {
    
    inline def setOnEvent(
      value: (/* eventName */ PlaidLinkStableEvent | String, /* metadata */ PlaidLinkOnEventMetadata) => Unit
    ): Self = StObject.set(x, "onEvent", js.Any.fromFunction2(value))
    
    inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
    
    inline def setOnExit(value: (/* error */ Null | PlaidLinkError, /* metadata */ PlaidLinkOnExitMetadata) => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction2(value))
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnSuccess(value: (/* public_token */ String, /* metadata */ PlaidLinkOnSuccessMetadata) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2(value))
  }
}
