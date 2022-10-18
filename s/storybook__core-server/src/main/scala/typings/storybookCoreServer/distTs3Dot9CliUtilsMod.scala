package typings.storybookCoreServer

import typings.std.Record
import typings.storybookCoreCommon.distTs3Dot9TypesMod.CLIOptions
import typings.storybookCoreServer.distTs3Dot9CliProdMod.ProdCliOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9CliUtilsMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/cli/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkDeprecatedFlags(hasDllUiDllDocsDllStaticDir: CLIOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkDeprecatedFlags")(hasDllUiDllDocsDllStaticDir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def checkDeprecatedFlags(hasDllUiDllDocsDllStaticDir: ProdCliOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkDeprecatedFlags")(hasDllUiDllDocsDllStaticDir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getEnvConfig(program: Record[String, Any], configEnv: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getEnvConfig")(program.asInstanceOf[js.Any], configEnv.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseList(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseList")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
