package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharePhotoContent extends js.Object {
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.undefined
  /**
    * The type of content to be shared is photo.
    */
  var contentType: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkLibStrings.photo
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Photos to be shared.
    */
  var photos: js.Array[SharePhoto]
}

