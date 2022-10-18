package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.lib3dSecureMod.RiskOptions
import typings.recurlyRecurlyJs.lib3dSecureMod.ThreeDSecureEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreeDSecure extends StObject {
  
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-recurlythreedsecure|ThreeDSecure}
    */
  def ThreeDSecure(riskOptions: RiskOptions): ThreeDSecureEmitter
  /**
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-recurlythreedsecure|ThreeDSecure}
    */
  @JSName("ThreeDSecure")
  var ThreeDSecure_Original: typings.recurlyRecurlyJs.lib3dSecureMod.ThreeDSecure
}
object ThreeDSecure {
  
  inline def apply(ThreeDSecure: /* riskOptions */ RiskOptions => ThreeDSecureEmitter): ThreeDSecure = {
    val __obj = js.Dynamic.literal(ThreeDSecure = js.Any.fromFunction1(ThreeDSecure))
    __obj.asInstanceOf[ThreeDSecure]
  }
  
  extension [Self <: ThreeDSecure](x: Self) {
    
    inline def setThreeDSecure(value: /* riskOptions */ RiskOptions => ThreeDSecureEmitter): Self = StObject.set(x, "ThreeDSecure", js.Any.fromFunction1(value))
  }
}
