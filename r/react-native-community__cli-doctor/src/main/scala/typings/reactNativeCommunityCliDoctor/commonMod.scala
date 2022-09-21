package typings.reactNativeCommunityCliDoctor

import typings.reactNativeCommunityCliDoctor.anon.Command
import typings.reactNativeCommunityCliDoctor.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/healthchecks/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logError(hasHealthcheckLoaderErrorMessageCommand: Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logError")(hasHealthcheckLoaderErrorMessageCommand.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logManualInstallation(hasHealthcheckUrlCommandMessage: Command): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logManualInstallation")(hasHealthcheckUrlCommandMessage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logMessage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logMessage")().asInstanceOf[Unit]
  inline def logMessage(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logMessage")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeMessage(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeMessage")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
