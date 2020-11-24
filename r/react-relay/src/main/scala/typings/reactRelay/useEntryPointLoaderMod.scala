package typings.reactRelay

import typings.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typings.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typings.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import typings.reactRelay.helpersMod.GetEntryPointComponentFromEntryPoint
import typings.reactRelay.helpersMod.GetEntryPointParamsFromEntryPoint
import typings.relayRuntime.relayRuntimeTypesMod.DisposeFn
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-relay/lib/relay-experimental/useEntryPointLoader", JSImport.Namespace)
@js.native
object useEntryPointLoaderMod extends js.Object {
  
  def useEntryPointLoader[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, _]]],
    entryPoint: TEntryPoint
  ): UseEntryPointLoaderHookType[TEntryPoint] = js.native
  
  type UseEntryPointLoaderHookType[TEntryPoint] = js.Tuple3[
    js.UndefOr[PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] | Null], 
    js.Function1[/* entryPointParams */ GetEntryPointParamsFromEntryPoint[TEntryPoint], Unit], 
    DisposeFn
  ]
}
