package typings.atReactDashNativeDashFirebaseApp.atReactDashNativeDashFirebaseAppMod.ReactNativeFirebaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  def utils(): typings.atReactDashNativeDashFirebaseApp.UtilsNs.Module
}

object FirebaseApp {
  @scala.inline
  def apply(utils: () => typings.atReactDashNativeDashFirebaseApp.UtilsNs.Module): FirebaseApp = {
    val __obj = js.Dynamic.literal(utils = js.Any.fromFunction0(utils))
  
    __obj.asInstanceOf[FirebaseApp]
  }
}

