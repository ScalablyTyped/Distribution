package typings.rollupPluginTypescript2

import typings.rollupPluginTypescript2.anon.FileName
import typings.rollupPluginTypescript2.contextMod.IContext
import typings.rollupPluginTypescript2.ioptionsMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseTsconfigMod {
  
  @JSImport("rollup-plugin-typescript2/dist/parse-tsconfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parseTsConfig(context: IContext, pluginOptions: IOptions): FileName = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTsConfig")(context.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any])).asInstanceOf[FileName]
}
