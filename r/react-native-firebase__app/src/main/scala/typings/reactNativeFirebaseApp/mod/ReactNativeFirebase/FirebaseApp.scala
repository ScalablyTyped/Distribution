package typings.reactNativeFirebaseApp.mod.ReactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseApp extends js.Object {
  def utils(): typings.reactNativeFirebaseApp.Utils.Module = js.native
}

object FirebaseApp {
  @scala.inline
  def apply(utils: () => typings.reactNativeFirebaseApp.Utils.Module): FirebaseApp = {
    val __obj = js.Dynamic.literal(utils = js.Any.fromFunction0(utils))
    __obj.asInstanceOf[FirebaseApp]
  }
  @scala.inline
  implicit class FirebaseAppOps[Self <: FirebaseApp] (val x: Self) extends AnyVal {
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
    def setUtils(value: () => typings.reactNativeFirebaseApp.Utils.Module): Self = this.set("utils", js.Any.fromFunction0(value))
  }
  
}

