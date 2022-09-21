package typings.reactRelay

import typings.react.mod.ReactElement
import typings.reactRelay.anon.EntryPointReference
import typings.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryPointContainerReactMod {
  
  @JSImport("react-relay/relay-hooks/EntryPointContainer.react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def EntryPointContainer[TPreloadedEntryPoint /* <: PreloadedEntryPoint[Any] */](hasEntryPointReferenceProps: EntryPointReference[TPreloadedEntryPoint]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("EntryPointContainer")(hasEntryPointReferenceProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  type GetComponentFromPreloadedEntryPoint[T] = Any
  
  type GetRuntimePropsFromComponent[T] = Any
}
