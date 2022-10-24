package typings.reactRelay

import typings.react.mod.ReactElement
import typings.reactRelay.anon.EntryPointReference
import typings.reactRelay.relayHooksEntryPointTypesMod.PreloadedEntryPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksEntryPointContainerDotreactMod {
  
  @JSImport("react-relay/relay-hooks/EntryPointContainer.react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def EntryPointContainer[TPreloadedEntryPoint /* <: PreloadedEntryPoint[Any] */](param0: EntryPointReference[TPreloadedEntryPoint]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("EntryPointContainer")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadedEntryPoint<infer C> ? C : never
    }}}
    */
  @js.native
  trait GetComponentFromPreloadedEntryPoint[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends react-relay.react-relay/relay-hooks/EntryPointTypes.EntryPointComponent<any, any, infer R, any> ? R : never
    }}}
    */
  @js.native
  trait GetRuntimePropsFromComponent[T] extends StObject
}
