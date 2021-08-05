package typings.rnAppUpgrade

import typings.reactNative.mod.EmitterSubscription
import typings.rnAppUpgrade.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rn-app-upgrade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDownListener(callBack: js.Function1[/* progress */ Double, Unit]): EmitterSubscription = ^.asInstanceOf[js.Dynamic].applyDynamic("addDownListener")(callBack.asInstanceOf[js.Any]).asInstanceOf[EmitterSubscription]
  
  inline def checkUpdate(appId: String, version: String): js.Promise[Code] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUpdate")(appId.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Code]]
  
  inline def openAPPStore(appid: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openAPPStore")(appid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def upgrade(apkUrl: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("upgrade")(apkUrl.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
