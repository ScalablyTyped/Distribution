package typings.reactNativeFirebaseApp.ReactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseModule extends js.Object {
  /**
    * The current `FirebaseApp` instance for this Firebase service.
    */
  var app: FirebaseApp = js.native
  /**
    * Returns the shared event emitter instance used for all JS event routing.
    */
  var emitter: js.Any = js.native
  /**
    * The native module instance for this Firebase service.
    */
  var native: js.Any = js.native
}

object FirebaseModule {
  @scala.inline
  def apply(app: FirebaseApp, emitter: js.Any, native: js.Any): FirebaseModule = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseModule]
  }
  @scala.inline
  implicit class FirebaseModuleOps[Self <: FirebaseModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApp(value: FirebaseApp): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmitter(value: js.Any): Self = this.set("emitter", value.asInstanceOf[js.Any])
    @scala.inline
    def setNative(value: js.Any): Self = this.set("native", value.asInstanceOf[js.Any])
  }
  
}

