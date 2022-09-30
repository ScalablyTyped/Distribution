package typings.reactFloater

import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-floater/lib/modules/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMount(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useMount")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useSetState[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyObject */ Any */](): js.Tuple2[
    T, 
    js.Function1[/* patch */ Partial[T] | (js.Function1[/* previousState */ T, Partial[T]]), Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetState")().asInstanceOf[js.Tuple2[
    T, 
    js.Function1[/* patch */ Partial[T] | (js.Function1[/* previousState */ T, Partial[T]]), Unit]
  ]]
  inline def useSetState[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyObject */ Any */](initialState: T): js.Tuple2[
    T, 
    js.Function1[/* patch */ Partial[T] | (js.Function1[/* previousState */ T, Partial[T]]), Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    T, 
    js.Function1[/* patch */ Partial[T] | (js.Function1[/* previousState */ T, Partial[T]]), Unit]
  ]]
  
  inline def useSingleton(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useSingleton")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useUnmount(fn: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useUnmount")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useUpdateEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useUpdateEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useUpdateEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useUpdateEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
