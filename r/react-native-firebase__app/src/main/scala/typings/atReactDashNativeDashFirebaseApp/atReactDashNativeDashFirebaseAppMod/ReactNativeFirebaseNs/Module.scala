package typings.atReactDashNativeDashFirebaseApp.atReactDashNativeDashFirebaseAppMod.ReactNativeFirebaseNs

import typings.atReactDashNativeDashFirebaseApp.ReactNativeFirebaseNs.FirebaseModuleWithStatics
import typings.atReactDashNativeDashFirebaseApp.UtilsNs.Statics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  /**
    * Utils provides a collection of utilities to aid in using Firebase
    * and related services inside React Native, e.g. Test Lab helpers
    * and Google Play Services version helpers.
    */
  var utils: FirebaseModuleWithStatics[typings.atReactDashNativeDashFirebaseApp.UtilsNs.Module, Statics]
}

object Module {
  @scala.inline
  def apply(utils: FirebaseModuleWithStatics[typings.atReactDashNativeDashFirebaseApp.UtilsNs.Module, Statics]): Module = {
    val __obj = js.Dynamic.literal(utils = utils)
  
    __obj.asInstanceOf[Module]
  }
}

