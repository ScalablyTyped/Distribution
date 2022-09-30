package typings.sphereEngineBrowser

import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pactMod {
  
  /**
    * Represents a promise which can be resolved or rejected externally.
    */
  @JSImport("pact", JSImport.Default)
  @js.native
  /**
    * Construct a new, unsettled pact.
    */
  open class default[T] ()
    extends StObject
       with Pact[T]
  
  /**
    * Represents a promise which can be resolved or rejected externally.
    */
  @js.native
  trait Pact[T]
    extends StObject
       with Promise[T] {
    
    /**
      * Reject this pact's promise.
      * @param reason Value to reject the promise with.
      */
    def reject(): Unit = js.native
    def reject(reason: Any): Unit = js.native
    
    /**
      * Resolve this pact's promise.
      * @param value Value to resolve the promise with.
      */
    def resolve(): Unit = js.native
    def resolve(value: T): Unit = js.native
    
    /**
      * Get a standard promise which resolves or rejects with the same result as this pact.
      * Unlike the pact, the promise cannot be settled externally.
      */
    def toPromise(): js.Promise[T] = js.native
  }
}
