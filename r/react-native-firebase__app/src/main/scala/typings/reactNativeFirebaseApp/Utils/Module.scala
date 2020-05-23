package typings.reactNativeFirebaseApp.Utils

import typings.reactNativeFirebaseApp.ReactNativeFirebase.FirebaseApp
import typings.reactNativeFirebaseApp.ReactNativeFirebase.FirebaseModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends FirebaseModule {
  /**
    * Returns true if this app is running inside a Firebase Test Lab environment. Always returns false on iOS.
    *
    * @android
    */
  var isRunningInTestLab: Boolean
}

object Module {
  @scala.inline
  def apply(app: FirebaseApp, emitter: js.Any, isRunningInTestLab: Boolean, native: js.Any): Module = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], isRunningInTestLab = isRunningInTestLab.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
}

