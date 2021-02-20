package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.contextMod.IContext
import typings.rollupPluginTypescript2.ioptionsMod.IOptions
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOptionsOverridesMod {
  
  @JSImport("rollup-plugin-typescript2/dist/get-options-overrides", "createFilter")
  @js.native
  def createFilter(context: IContext, pluginOptions: IOptions, parsedConfig: ParsedCommandLine): js.Any = js.native
  
  @JSImport("rollup-plugin-typescript2/dist/get-options-overrides", "getOptionsOverrides")
  @js.native
  def getOptionsOverrides(hasUseTsconfigDeclarationDirCacheRootCwd: IOptions): CompilerOptions = js.native
  @JSImport("rollup-plugin-typescript2/dist/get-options-overrides", "getOptionsOverrides")
  @js.native
  def getOptionsOverrides(hasUseTsconfigDeclarationDirCacheRootCwd: IOptions, preParsedTsconfig: ParsedCommandLine): CompilerOptions = js.native
}
