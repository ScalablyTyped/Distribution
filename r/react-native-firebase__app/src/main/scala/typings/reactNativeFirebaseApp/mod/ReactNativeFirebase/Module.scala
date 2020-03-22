package typings.reactNativeFirebaseApp.mod.ReactNativeFirebase

import typings.reactNativeFirebaseApp.FirebaseModuleWithStatics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  /**
    * Utils provides a collection of utilities to aid in using Firebase
    * and related services inside React Native, e.g. Test Lab helpers
    * and Google Play Services version helpers.
    */
  var utils: FirebaseModuleWithStatics
}

object Module {
  @scala.inline
  def apply(utils: FirebaseModuleWithStatics): Module = {
    val __obj = js.Dynamic.literal(utils = utils.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Module]
  }
}

