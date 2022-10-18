package typings.storybookCoreServer

import typings.storybookCoreCommon.distTs3Dot9TypesMod.CLIOptions
import typings.storybookCoreServer.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9CliDevMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/cli/dev", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDevCli(packageJson: Name): js.Promise[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CommanderStatic */ Any) & CLIOptions
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevCli")(packageJson.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CommanderStatic */ Any) & CLIOptions
  ]]
}
