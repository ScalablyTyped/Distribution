package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.contextMod.IContext
import typings.rollupPluginTypescript2.ioptionsMod.IOptions
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOptionsOverridesMod {
  
  @JSImport("rollup-plugin-typescript2/dist/get-options-overrides", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createFilter(context: IContext, pluginOptions: IOptions, parsedConfig: ParsedCommandLine): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(context.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any], parsedConfig.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getOptionsOverrides(hasUseTsconfigDeclarationDirCacheRootCwd: IOptions): CompilerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionsOverrides")(hasUseTsconfigDeclarationDirCacheRootCwd.asInstanceOf[js.Any]).asInstanceOf[CompilerOptions]
  @scala.inline
  def getOptionsOverrides(hasUseTsconfigDeclarationDirCacheRootCwd: IOptions, preParsedTsconfig: ParsedCommandLine): CompilerOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptionsOverrides")(hasUseTsconfigDeclarationDirCacheRootCwd.asInstanceOf[js.Any], preParsedTsconfig.asInstanceOf[js.Any])).asInstanceOf[CompilerOptions]
}
