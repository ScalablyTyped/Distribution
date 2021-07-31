package typings.sinonAsPromised

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  trait SinonStub extends StObject {
    
    /**
      * Causes the stub to reject with the provided error.
      *
      * @param error   Rejection error.
      * @returns A thenable which will return a rejected promise with the provided error.
      * @remarks If error is a string, it will be set as the message on an Error object.
      */
    def rejects(error: js.Any): SinonStub
    
    /**
      * Causes the stub to resolve with the provided value.
      *
      * @param value   Resolve value.
      * @remarks Any Promises/A+ compliant library will handle this object properly.
      */
    def resolves[T](value: T): SinonStub
  }
  object SinonStub {
    
    @scala.inline
    def apply(rejects: js.Any => SinonStub, resolves: js.Any => SinonStub): SinonStub = {
      val __obj = js.Dynamic.literal(rejects = js.Any.fromFunction1(rejects), resolves = js.Any.fromFunction1(resolves))
      __obj.asInstanceOf[SinonStub]
    }
    
    @scala.inline
    implicit class SinonStubMutableBuilder[Self <: SinonStub] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRejects(value: js.Any => SinonStub): Self = StObject.set(x, "rejects", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolves(value: js.Any => SinonStub): Self = StObject.set(x, "resolves", js.Any.fromFunction1(value))
    }
  }
}
