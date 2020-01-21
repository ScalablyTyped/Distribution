package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.contextMod.IContext
import typings.rollupPluginTypescript2.ioptionsMod.IOptions
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ParsedCommandLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rollup-plugin-typescript2/dist/get-options-overrides", JSImport.Namespace)
@js.native
object getOptionsOverridesMod extends js.Object {
  def createFilter(context: IContext, pluginOptions: IOptions, parsedConfig: ParsedCommandLine): js.Any = js.native
  def getOptionsOverrides(hasUseTsconfigDeclarationDirCacheRoot: IOptions): CompilerOptions = js.native
  def getOptionsOverrides(hasUseTsconfigDeclarationDirCacheRoot: IOptions, preParsedTsconfig: ParsedCommandLine): CompilerOptions = js.native
}

