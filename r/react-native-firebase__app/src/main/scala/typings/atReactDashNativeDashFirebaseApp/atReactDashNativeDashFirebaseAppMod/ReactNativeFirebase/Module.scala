package typings.atReactDashNativeDashFirebaseApp.atReactDashNativeDashFirebaseAppMod.ReactNativeFirebase

import typings.atReactDashNativeDashFirebaseApp.ReactNativeFirebase.FirebaseModuleWithStatics
import typings.atReactDashNativeDashFirebaseApp.Utils.Statics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  /**
    * Utils provides a collection of utilities to aid in using Firebase
    * and related services inside React Native, e.g. Test Lab helpers
    * and Google Play Services version helpers.
    */
  var utils: FirebaseModuleWithStatics[typings.atReactDashNativeDashFirebaseApp.Utils.Module, Statics]
}

object Module {
  @scala.inline
  def apply(utils: FirebaseModuleWithStatics[typings.atReactDashNativeDashFirebaseApp.Utils.Module, Statics]): Module = {
    val __obj = js.Dynamic.literal(utils = utils.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Module]
  }
}

