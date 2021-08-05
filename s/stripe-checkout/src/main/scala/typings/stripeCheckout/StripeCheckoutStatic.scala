package typings.stripeCheckout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeCheckoutStatic extends StObject {
  
  def configure(options: StripeCheckoutOptions): StripeCheckoutHandler
}
object StripeCheckoutStatic {
  
  inline def apply(configure: StripeCheckoutOptions => StripeCheckoutHandler): StripeCheckoutStatic = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
    __obj.asInstanceOf[StripeCheckoutStatic]
  }
  
  extension [Self <: StripeCheckoutStatic](x: Self) {
    
    inline def setConfigure(value: StripeCheckoutOptions => StripeCheckoutHandler): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
  }
}
