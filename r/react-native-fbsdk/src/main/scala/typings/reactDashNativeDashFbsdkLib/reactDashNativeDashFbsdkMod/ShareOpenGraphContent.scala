package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOpenGraphContent extends js.Object {
  /**
    * Open Graph Action to be shared.
    */
  var action: ShareOpenGraphAction
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.undefined
  /**
    * The type of content to be shared is open graph content.
    */
  var contentType: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkLibStrings.`open-graph`
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Property name that points to the primary Open Graph Object in the action.
    */
  var previewPropertyName: java.lang.String
}

