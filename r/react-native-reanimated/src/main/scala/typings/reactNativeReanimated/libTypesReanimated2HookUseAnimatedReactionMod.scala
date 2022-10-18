package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.BasicWorkletFunction
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.WorkletFunction
import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.DependencyList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2HookUseAnimatedReactionMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/hook/useAnimatedReaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnimatedReaction[T](
    prepare: BasicWorkletFunction[T],
    react: AnimatedReactionWorkletFunction[T],
    dependencies: DependencyList
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAnimatedReaction")(prepare.asInstanceOf[js.Any], react.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait AnimatedReactionWorkletFunction[T]
    extends StObject
       with WorkletFunction {
    
    def apply(prepared: T): Unit = js.native
    def apply(prepared: T, previous: T): Unit = js.native
  }
}
