package typings.atReactDashNativeDashFirebaseApp.atReactDashNativeDashFirebaseAppMod.ReactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseApp extends js.Object {
  def utils(): typings.atReactDashNativeDashFirebaseApp.Utils.Module
}

object FirebaseApp {
  @scala.inline
  def apply(utils: () => typings.atReactDashNativeDashFirebaseApp.Utils.Module): FirebaseApp = {
    val __obj = js.Dynamic.literal(utils = js.Any.fromFunction0(utils))
  
    __obj.asInstanceOf[FirebaseApp]
  }
}

