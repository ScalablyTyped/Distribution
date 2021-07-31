package typings.reactRelay

import typings.reactRelay.entryPointTypesMod.EnvironmentProviderOptions
import typings.reactRelay.entryPointTypesMod.IEnvironmentProvider
import typings.reactRelay.entryPointTypesMod.PreloadedEntryPoint
import typings.reactRelay.helpersMod.GetEntryPointComponentFromEntryPoint
import typings.reactRelay.helpersMod.GetEntryPointParamsFromEntryPoint
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadEntryPointMod {
  
  @JSImport("react-relay/lib/relay-experimental/loadEntryPoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def loadEntryPoint[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, js.Any]]],
    entryPoint: TEntryPoint,
    entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]
  ): PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEntryPoint")(environmentProvider.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], entryPointParams.asInstanceOf[js.Any])).asInstanceOf[PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]]]
}
