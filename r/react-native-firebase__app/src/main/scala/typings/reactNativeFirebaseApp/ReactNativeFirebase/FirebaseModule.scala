package typings.reactNativeFirebaseApp.ReactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseModule extends js.Object {
  /**
    * The current `FirebaseApp` instance for this Firebase service.
    */
  var app: FirebaseApp
  /**
    * Returns the shared event emitter instance used for all JS event routing.
    */
  var emitter: js.Any
  /**
    * The native module instance for this Firebase service.
    */
  var native: js.Any
}

object FirebaseModule {
  @scala.inline
  def apply(app: FirebaseApp, emitter: js.Any, native: js.Any): FirebaseModule = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseModule]
  }
}

