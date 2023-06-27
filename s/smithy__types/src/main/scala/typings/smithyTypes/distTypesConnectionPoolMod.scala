package typings.smithyTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConnectionPoolMod {
  
  trait CacheKey extends StObject {
    
    var destination: String
  }
  object CacheKey {
    
    inline def apply(destination: String): CacheKey = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheKey] (val x: Self) extends AnyVal {
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConnectionPool[T] extends StObject {
    
    /**
      * Removes the connection from the pool, and destroys it.
      */
    def destroy(connection: T): Unit = js.native
    
    /**
      * Implements the iterable protocol and allows arrays to be consumed
      * by most syntaxes expecting iterables, such as the spread syntax
      * and for...of loops
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[js.Iterator[T]] = js.native
    
    /**
      * Release the connection back to the pool making it potentially
      * re-usable by other requests.
      */
    def offerLast(connection: T): Unit = js.native
    
    /**
      * Retrieve the first connection in the pool
      */
    def poll(): T | Unit = js.native
  }
}
