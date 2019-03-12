package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidApi extends js.Object {
  /**
    * When sending an ACTION_VIEW intent with given file path and MIME type, system will try to open an
    * App to handle the file. For example, open Gallery app to view an image, or install APK.
    * @param path Path of the file to be opened.
    * @param mime Basically system will open an app according to this MIME type.
    */
  def actionViewIntent(path: java.lang.String, mime: java.lang.String): js.Promise[_]
}

object AndroidApi {
  @scala.inline
  def apply(actionViewIntent: (java.lang.String, java.lang.String) => js.Promise[_]): AndroidApi = {
    val __obj = js.Dynamic.literal(actionViewIntent = js.Any.fromFunction2(actionViewIntent))
  
    __obj.asInstanceOf[AndroidApi]
  }
}

