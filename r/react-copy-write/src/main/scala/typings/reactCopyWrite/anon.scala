package typings.reactCopyWrite

import org.scalablytyped.runtime.Instantiable0
import typings.reactCopyWrite.mod.AnyDeepMemberOfState
import typings.reactCopyWrite.mod.MutateFn
import typings.reactCopyWrite.mod.Mutator
import typings.reactCopyWrite.mod.Provider
import typings.reactCopyWrite.mod.SelectorFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Consumer[T /* <: js.Object */] extends StObject {
    
    var Consumer: Instantiable0[typings.reactCopyWrite.mod.Consumer[T]] = js.native
    
    var Provider: Instantiable0[typings.reactCopyWrite.mod.Provider[T]] = js.native
    
    var createSelector: SelectorFn[T] = js.native
    
    var mutate: Mutator[T] = js.native
  }
  object Consumer {
    
    @scala.inline
    def apply[T /* <: js.Object */](
      Consumer: Instantiable0[typings.reactCopyWrite.mod.Consumer[T]],
      Provider: Instantiable0[Provider[T]],
      createSelector: T => AnyDeepMemberOfState[T],
      mutate: /* mutator */ MutateFn[T] => Unit
    ): Consumer[T] = {
      val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], createSelector = js.Any.fromFunction1(createSelector), mutate = js.Any.fromFunction1(mutate))
      __obj.asInstanceOf[Consumer[T]]
    }
    
    @scala.inline
    implicit class ConsumerMutableBuilder[Self <: Consumer[_], T /* <: js.Object */] (val x: Self with Consumer[T]) extends AnyVal {
      
      @scala.inline
      def setConsumer(value: Instantiable0[typings.reactCopyWrite.mod.Consumer[T]]): Self = StObject.set(x, "Consumer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateSelector(value: T => AnyDeepMemberOfState[T]): Self = StObject.set(x, "createSelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMutate(value: /* mutator */ MutateFn[T] => Unit): Self = StObject.set(x, "mutate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProvider(value: Instantiable0[Provider[T]]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    }
  }
}
