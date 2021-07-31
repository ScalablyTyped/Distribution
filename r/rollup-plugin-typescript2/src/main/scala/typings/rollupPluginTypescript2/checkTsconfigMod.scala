package typings.rollupPluginTypescript2

import typings.typescript.mod.ParsedCommandLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkTsconfigMod {
  
  @JSImport("rollup-plugin-typescript2/dist/check-tsconfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def checkTsConfig(parsedConfig: ParsedCommandLine): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkTsConfig")(parsedConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
