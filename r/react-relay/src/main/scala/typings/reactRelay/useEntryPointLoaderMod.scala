package typings.reactRelay

import typings.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typings.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typings.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import typings.reactRelay.helpersMod.GetEntryPointComponentFromEntryPoint
import typings.reactRelay.helpersMod.GetEntryPointParamsFromEntryPoint
import typings.relayRuntime.relayRuntimeTypesMod.DisposeFn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useEntryPointLoaderMod {
  
  @JSImport("react-relay/lib/relay-experimental/useEntryPointLoader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useEntryPointLoader[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, js.Any]]],
    entryPoint: TEntryPoint
  ): UseEntryPointLoaderHookType[TEntryPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEntryPointLoader")(environmentProvider.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any])).asInstanceOf[UseEntryPointLoaderHookType[TEntryPoint]]
  
  type UseEntryPointLoaderHookType[TEntryPoint] = js.Tuple3[
    js.UndefOr[PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] | Null], 
    js.Function1[/* entryPointParams */ GetEntryPointParamsFromEntryPoint[TEntryPoint], Unit], 
    DisposeFn
  ]
}
