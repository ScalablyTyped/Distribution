package typings.rollupDashPluginDashTypescript2

import typings.rollupDashPluginDashTypescript2.distContextMod.IContext
import typings.rollupDashPluginDashTypescript2.distIoptionsMod.IOptions
import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup-plugin-typescript2/dist/get-options-overrides", JSImport.Namespace)
@js.native
object distGetDashOptionsDashOverridesMod extends js.Object {
  def createFilter(context: IContext, pluginOptions: IOptions, parsedConfig: ParsedCommandLine): js.Any = js.native
  def getOptionsOverrides(hasUseTsconfigDeclarationDirCacheRoot: IOptions): CompilerOptions = js.native
  def getOptionsOverrides(hasUseTsconfigDeclarationDirCacheRoot: IOptions, preParsedTsconfig: ParsedCommandLine): CompilerOptions = js.native
}

