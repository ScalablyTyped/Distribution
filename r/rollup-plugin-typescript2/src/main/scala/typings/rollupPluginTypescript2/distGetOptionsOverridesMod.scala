package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.distContextMod.RollupContext
import typings.rollupPluginTypescript2.distIoptionsMod.IOptions
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGetOptionsOverridesMod {
  
  @JSImport("rollup-plugin-typescript2/dist/get-options-overrides", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFilter(context: RollupContext, pluginOptions: IOptions, parsedConfig: ParsedCommandLine): js.Function1[/* id */ Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilter")(context.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any], parsedConfig.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* id */ Any, Boolean]]
  
  inline def getOptionsOverrides(param0: IOptions): CompilerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionsOverrides")(param0.asInstanceOf[js.Any]).asInstanceOf[CompilerOptions]
  inline def getOptionsOverrides(param0: IOptions, preParsedTsconfig: ParsedCommandLine): CompilerOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptionsOverrides")(param0.asInstanceOf[js.Any], preParsedTsconfig.asInstanceOf[js.Any])).asInstanceOf[CompilerOptions]
}
