package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.anon.ClientAuthorization
import typings.recurlyRecurlyJs.anon.Description
import typings.recurlyRecurlyJs.anon.DisplayName
import typings.recurlyRecurlyJs.libEmitterMod.Emitter
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaypalMod {
  
  trait BraintreeConfig
    extends StObject
       with PayPalConfig {
    
    var braintree: ClientAuthorization
  }
  object BraintreeConfig {
    
    inline def apply(braintree: ClientAuthorization): BraintreeConfig = {
      val __obj = js.Dynamic.literal(braintree = braintree.asInstanceOf[js.Any])
      __obj.asInstanceOf[BraintreeConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BraintreeConfig] (val x: Self) extends AnyVal {
      
      inline def setBraintree(value: ClientAuthorization): Self = StObject.set(x, "braintree", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectConfig
    extends StObject
       with PayPalConfig {
    
    var display: js.UndefOr[DisplayName] = js.undefined
  }
  object DirectConfig {
    
    inline def apply(): DirectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectConfig] (val x: Self) extends AnyVal {
      
      inline def setDisplay(value: DisplayName): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    }
  }
  
  type PayPal = js.Function1[/* config */ js.UndefOr[PayPalConfig], PayPalInstance]
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.libPaypalMod.BraintreeConfig
    - typings.recurlyRecurlyJs.libPaypalMod.DirectConfig
  */
  trait PayPalConfig extends StObject
  object PayPalConfig {
    
    inline def BraintreeConfig(braintree: ClientAuthorization): typings.recurlyRecurlyJs.libPaypalMod.BraintreeConfig = {
      val __obj = js.Dynamic.literal(braintree = braintree.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.recurlyRecurlyJs.libPaypalMod.BraintreeConfig]
    }
    
    inline def DirectConfig(): typings.recurlyRecurlyJs.libPaypalMod.DirectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.recurlyRecurlyJs.libPaypalMod.DirectConfig]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.cancel
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready
  */
  trait PayPalEvent extends StObject
  object PayPalEvent {
    
    inline def cancel: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.cancel = "cancel".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.cancel]
    
    inline def error: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error = "error".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.error]
    
    inline def ready: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready = "ready".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready]
    
    inline def token: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token = "token".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.token]
  }
  
  @js.native
  trait PayPalInstance
    extends StObject
       with Emitter[PayPalEvent] {
    
    def destroy(): Unit = js.native
    @JSName("destroy")
    var destroy_Original: VoidFunction = js.native
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-paypalstart|PayPal.start}
      */
    def start(): Unit = js.native
    def start(payPalStartOptions: PayPalStartOptions): Unit = js.native
  }
  
  trait PayPalStartOptions extends StObject {
    
    var options: Description
  }
  object PayPalStartOptions {
    
    inline def apply(options: Description): PayPalStartOptions = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalStartOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PayPalStartOptions] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: Description): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
