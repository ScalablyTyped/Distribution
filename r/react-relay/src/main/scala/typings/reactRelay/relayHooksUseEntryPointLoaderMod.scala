package typings.reactRelay

import typings.reactRelay.relayHooksEntryPointTypesMod.EnvironmentProviderOptions
import typings.reactRelay.relayHooksEntryPointTypesMod.IEnvironmentProvider
import typings.reactRelay.relayHooksEntryPointTypesMod.PreloadedEntryPoint
import typings.reactRelay.relayHooksHelpersMod.GetEntryPointComponentFromEntryPoint
import typings.reactRelay.relayHooksHelpersMod.GetEntryPointParamsFromEntryPoint
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.DisposeFn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksUseEntryPointLoaderMod {
  
  @JSImport("react-relay/relay-hooks/useEntryPointLoader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useEntryPointLoader[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, Any]]],
    entryPoint: TEntryPoint
  ): UseEntryPointLoaderHookType[TEntryPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEntryPointLoader")(environmentProvider.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any])).asInstanceOf[UseEntryPointLoaderHookType[TEntryPoint]]
  
  type UseEntryPointLoaderHookType[TEntryPoint] = js.Tuple3[
    js.UndefOr[PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] | Null], 
    js.Function1[/* entryPointParams */ GetEntryPointParamsFromEntryPoint[TEntryPoint], Unit], 
    DisposeFn
  ]
}
