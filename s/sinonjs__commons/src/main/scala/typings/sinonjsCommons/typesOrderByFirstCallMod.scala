package typings.sinonjsCommons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOrderByFirstCallMod {
  
  /**
    * A Sinon proxy object (fake, spy, stub)
    *
    * @typedef {object} SinonProxy
    * @property {Function} getCall - A method that can return the first call
    */
  /**
    * Sorts an array of SinonProxy instances (fake, spy, stub) by their first call
    *
    * @param  {SinonProxy[] | SinonProxy} spies
    * @returns {SinonProxy[]}
    */
  inline def apply(spies: js.Array[SinonProxy]): js.Array[SinonProxy] = ^.asInstanceOf[js.Dynamic].apply(spies.asInstanceOf[js.Any]).asInstanceOf[js.Array[SinonProxy]]
  inline def apply(spies: SinonProxy): js.Array[SinonProxy] = ^.asInstanceOf[js.Dynamic].apply(spies.asInstanceOf[js.Any]).asInstanceOf[js.Array[SinonProxy]]
  
  @JSImport("@sinonjs/commons/types/order-by-first-call", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A Sinon proxy object (fake, spy, stub)
    */
  trait SinonProxy extends StObject {
    
    /**
      * - A method that can return the first call
      */
    var getCall: js.Function
  }
  object SinonProxy {
    
    inline def apply(getCall: js.Function): SinonProxy = {
      val __obj = js.Dynamic.literal(getCall = getCall.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinonProxy]
    }
    
    extension [Self <: SinonProxy](x: Self) {
      
      inline def setGetCall(value: js.Function): Self = StObject.set(x, "getCall", value.asInstanceOf[js.Any])
    }
  }
}
