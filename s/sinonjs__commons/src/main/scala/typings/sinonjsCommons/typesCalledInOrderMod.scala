package typings.sinonjsCommons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCalledInOrderMod {
  
  /**
    * A Sinon proxy object (fake, spy, stub)
    *
    * @typedef {object} SinonProxy
    * @property {Function} calledBefore - A method that determines if this proxy was called before another one
    * @property {string} id - Some id
    * @property {number} callCount - Number of times this proxy has been called
    */
  /**
    * Returns true when the spies have been called in the order they were supplied in
    *
    * @param  {SinonProxy[] | SinonProxy} spies An array of proxies, or several proxies as arguments
    * @returns {boolean} true when spies are called in order, false otherwise
    */
  inline def apply(spies: js.Array[SinonProxy], args: Any*): Boolean = ^.asInstanceOf[js.Dynamic].apply(scala.List(spies.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  inline def apply(spies: SinonProxy, args: Any*): Boolean = ^.asInstanceOf[js.Dynamic].apply(scala.List(spies.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
  
  @JSImport("@sinonjs/commons/types/called-in-order", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A Sinon proxy object (fake, spy, stub)
    */
  trait SinonProxy extends StObject {
    
    /**
      * - Number of times this proxy has been called
      */
    var callCount: Double
    
    /**
      * - A method that determines if this proxy was called before another one
      */
    var calledBefore: js.Function
    
    /**
      * - Some id
      */
    var id: String
  }
  object SinonProxy {
    
    inline def apply(callCount: Double, calledBefore: js.Function, id: String): SinonProxy = {
      val __obj = js.Dynamic.literal(callCount = callCount.asInstanceOf[js.Any], calledBefore = calledBefore.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinonProxy]
    }
    
    extension [Self <: SinonProxy](x: Self) {
      
      inline def setCallCount(value: Double): Self = StObject.set(x, "callCount", value.asInstanceOf[js.Any])
      
      inline def setCalledBefore(value: js.Function): Self = StObject.set(x, "calledBefore", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
