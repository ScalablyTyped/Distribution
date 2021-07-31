package typings.reduxPromise

import org.scalablytyped.runtime.Shortcut
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.reduxPromise.mod.ReduxPromise.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("redux-promise", JSImport.Namespace)
  @js.native
  val ^ : Promise = js.native
  
  object ReduxPromise {
    
    type Promise = Middleware[js.Object, js.Any, Dispatch[AnyAction]]
  }
  
  type _To = Promise
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Promise = ^
  
  /* augmented module */
  object reduxAugmentingMod {
    
    @js.native
    trait Dispatch[S] extends StObject {
      
      def apply[R](asyncAction: PromiseAction[S]): R = js.native
    }
    
    type PromiseAction[S] = js.Function2[
        /* dispatch */ typings.reduxPromise.mod.reduxAugmentingMod.Dispatch[S], 
        /* getState */ js.UndefOr[js.Function0[S]], 
        js.Any
      ]
  }
}
