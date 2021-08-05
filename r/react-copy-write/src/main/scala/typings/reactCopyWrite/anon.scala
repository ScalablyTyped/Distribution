package typings.reactCopyWrite

import org.scalablytyped.runtime.Instantiable0
import typings.reactCopyWrite.mod.AnyDeepMemberOfState
import typings.reactCopyWrite.mod.MutateFn
import typings.reactCopyWrite.mod.Mutator
import typings.reactCopyWrite.mod.Provider
import typings.reactCopyWrite.mod.SelectorFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Consumer[T /* <: js.Object */] extends StObject {
    
    var Consumer: Instantiable0[typings.reactCopyWrite.mod.Consumer[T]]
    
    var Provider: Instantiable0[typings.reactCopyWrite.mod.Provider[T]]
    
    var createSelector: SelectorFn[T]
    
    var mutate: Mutator[T]
  }
  object Consumer {
    
    inline def apply[T /* <: js.Object */](
      Consumer: Instantiable0[typings.reactCopyWrite.mod.Consumer[T]],
      Provider: Instantiable0[Provider[T]],
      createSelector: T => AnyDeepMemberOfState[T],
      mutate: /* mutator */ MutateFn[T] => Unit
    ): Consumer[T] = {
      val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], createSelector = js.Any.fromFunction1(createSelector), mutate = js.Any.fromFunction1(mutate))
      __obj.asInstanceOf[Consumer[T]]
    }
    
    extension [Self <: Consumer[?], T /* <: js.Object */](x: Self & Consumer[T]) {
      
      inline def setConsumer(value: Instantiable0[typings.reactCopyWrite.mod.Consumer[T]]): Self = StObject.set(x, "Consumer", value.asInstanceOf[js.Any])
      
      inline def setCreateSelector(value: T => AnyDeepMemberOfState[T]): Self = StObject.set(x, "createSelector", js.Any.fromFunction1(value))
      
      inline def setMutate(value: /* mutator */ MutateFn[T] => Unit): Self = StObject.set(x, "mutate", js.Any.fromFunction1(value))
      
      inline def setProvider(value: Instantiable0[Provider[T]]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    }
  }
}
