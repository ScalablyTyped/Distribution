package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.anon.All
import typings.recurlyRecurlyJs.anon.Braintree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configureMod {
  
  type Configure = js.Function1[/* recurlyConfig */ RecurlyOptions | String, Unit]
  
  @js.native
  trait RecurlyOptions extends StObject {
    
    var cors: js.UndefOr[Boolean] = js.native
    
    var currency: js.UndefOr[String] = js.native
    
    /**
      * @deprecated Use {@link https://developers.recurly.com/reference/recurly-js/index.html#elements|Elements} instead.
      */
    var fields: js.UndefOr[All] = js.native
    
    var fraud: js.UndefOr[Braintree] = js.native
    
    var publicKey: String = js.native
    
    var required: js.UndefOr[js.Array[String]] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object RecurlyOptions {
    
    @scala.inline
    def apply(publicKey: String): RecurlyOptions = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecurlyOptions]
    }
    
    @scala.inline
    implicit class RecurlyOptionsMutableBuilder[Self <: RecurlyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCors(value: Boolean): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      @scala.inline
      def setFields(value: All): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFraud(value: Braintree): Self = StObject.set(x, "fraud", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFraudUndefined: Self = StObject.set(x, "fraud", js.undefined)
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
