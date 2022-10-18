package typings.storybookCoreServer

import typings.storybookCoreCommon.distTs3Dot9TypesMod.BuilderOptions
import typings.storybookCoreCommon.distTs3Dot9TypesMod.CLIOptions
import typings.storybookCoreCommon.distTs3Dot9TypesMod.LoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9BuildDevMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/build-dev", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildDev(loadOptions: LoadOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDev")(loadOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def buildDevStandalone(options: CLIOptions & LoadOptions & BuilderOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDevStandalone")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
