package typings.storybookCoreServer

import typings.storybookCoreCommon.distTs3Dot9TypesMod.VersionCheck
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsUpdateCheckMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/utils/update-check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createUpdateMessage(updateInfo: VersionCheck, version: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createUpdateMessage")(updateInfo.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def updateCheck(version: String): js.Promise[VersionCheck] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateCheck")(version.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VersionCheck]]
}
