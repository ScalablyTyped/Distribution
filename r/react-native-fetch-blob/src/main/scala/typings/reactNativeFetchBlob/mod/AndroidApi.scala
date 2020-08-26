package typings.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidApi extends js.Object {
  /**
    * When sending an ACTION_VIEW intent with given file path and MIME type, system will try to open an
    * App to handle the file. For example, open Gallery app to view an image, or install APK.
    * @param path Path of the file to be opened.
    * @param mime Basically system will open an app according to this MIME type.
    */
  def actionViewIntent(path: String, mime: String): js.Promise[_] = js.native
}

object AndroidApi {
  @scala.inline
  def apply(actionViewIntent: (String, String) => js.Promise[_]): AndroidApi = {
    val __obj = js.Dynamic.literal(actionViewIntent = js.Any.fromFunction2(actionViewIntent))
    __obj.asInstanceOf[AndroidApi]
  }
  @scala.inline
  implicit class AndroidApiOps[Self <: AndroidApi] (val x: Self) extends AnyVal {
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
    def setActionViewIntent(value: (String, String) => js.Promise[_]): Self = this.set("actionViewIntent", js.Any.fromFunction2(value))
  }
  
}

