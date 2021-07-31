package typings.reactSideEffect

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.reactSideEffect.anon.Peek
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-side-effect", JSImport.Namespace)
  @js.native
  val ^ : WithSideEffect = js.native
  
  type ClassDecorator[TProp, TPeek, TRewind] = js.Function1[
    /* component */ ComponentType[TProp], 
    ComponentType[TProp] & (Peek[TPeek, TRewind])
  ]
  
  @js.native
  trait WithSideEffect extends StObject {
    
    def apply[TProp, TState](
      reducePropsToState: js.Function1[/* propsList */ js.Array[TProp], TState],
      handleStateChangeOnClient: js.Function1[/* state */ TState, Unit]
    ): typings.std.ClassDecorator = js.native
    def apply[TProp, TState, TServerState](
      reducePropsToState: js.Function1[/* propsList */ js.Array[TProp], TState],
      handleStateChangeOnClient: js.Function1[/* state */ TState, Unit],
      mapStateOnServer: js.Function1[/* state */ TState, TServerState]
    ): typings.std.ClassDecorator = js.native
  }
  
  type _To = WithSideEffect
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: WithSideEffect = ^
}
