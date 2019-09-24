package typings.relayDashCompiler.libBinRelayCompilerMainMod

import typings.relayDashCompiler.libLanguageRelayLanguagePluginInterfaceMod.PluginInitializer
import typings.relayDashCompiler.libLanguageRelayLanguagePluginInterfaceMod.PluginInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/bin/RelayCompilerMain", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getLanguagePlugin(language: String): PluginInterface = js.native
  def getLanguagePlugin(language: PluginInitializer): PluginInterface = js.native
  def main(config: Config): js.Promise[Unit] = js.native
}

