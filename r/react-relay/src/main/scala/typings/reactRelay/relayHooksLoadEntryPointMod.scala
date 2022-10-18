package typings.reactRelay

import typings.reactRelay.relayHooksEntryPointTypesMod.EnvironmentProviderOptions
import typings.reactRelay.relayHooksEntryPointTypesMod.IEnvironmentProvider
import typings.reactRelay.relayHooksEntryPointTypesMod.PreloadedEntryPoint
import typings.reactRelay.relayHooksHelpersMod.GetEntryPointComponentFromEntryPoint
import typings.reactRelay.relayHooksHelpersMod.GetEntryPointParamsFromEntryPoint
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksLoadEntryPointMod {
  
  @JSImport("react-relay/relay-hooks/loadEntryPoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadEntryPoint[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, Any]]],
    entryPoint: TEntryPoint,
    entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]
  ): PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEntryPoint")(environmentProvider.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], entryPointParams.asInstanceOf[js.Any])).asInstanceOf[PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]]]
}
