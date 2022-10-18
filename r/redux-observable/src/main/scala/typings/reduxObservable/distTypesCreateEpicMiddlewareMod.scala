package typings.reduxObservable

import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.reduxObservable.distTypesEpicMod.Epic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCreateEpicMiddlewareMod {
  
  @JSImport("redux-observable/dist/types/createEpicMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createEpicMiddleware[T /* <: Action[Any] */, O /* <: T */, S, D](): EpicMiddleware[T, O, S, D] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEpicMiddleware")().asInstanceOf[EpicMiddleware[T, O, S, D]]
  inline def createEpicMiddleware[T /* <: Action[Any] */, O /* <: T */, S, D](options: Options[D]): EpicMiddleware[T, O, S, D] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEpicMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[EpicMiddleware[T, O, S, D]]
  
  @js.native
  trait EpicMiddleware[T /* <: Action[Any] */, O /* <: T */, S, D]
    extends Middleware[js.Object, S, Dispatch[Any]] {
    
    def run(rootEpic: Epic[T, O, S, D]): Unit = js.native
  }
  
  trait Options[D] extends StObject {
    
    var dependencies: js.UndefOr[D] = js.undefined
  }
  object Options {
    
    inline def apply[D](): Options[D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[D]]
    }
    
    extension [Self <: Options[?], D](x: Self & Options[D]) {
      
      inline def setDependencies(value: D): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    }
  }
}
