package typings.restartHooks

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useDebouncedStateMod {
  
  @JSImport("@restart/hooks/cjs/useDebouncedState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](initialState: T, delay: Double): js.Tuple2[T, Dispatch[SetStateAction[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, Dispatch[SetStateAction[T]]]]
}
