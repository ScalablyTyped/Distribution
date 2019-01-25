package typings
package rnDashFetchDashBlobLib.rnDashFetchDashBlobMod

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

