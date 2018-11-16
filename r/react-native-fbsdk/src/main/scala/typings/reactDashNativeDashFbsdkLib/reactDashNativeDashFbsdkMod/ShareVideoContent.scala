package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ShareVideoContent extends js.Object {
  /**
       * Common parameters for share content;
       */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.undefined
  /**
       *  Description of the video.
       */
  var contentDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Title of the video.
       */
  var contentTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The type of content to be shared is photo.
       */
  var contentType: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkLibStrings.video
  /**
       * URL for the content being shared.
       */
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The photo that represents the video.
       */
  var previewPhoto: js.UndefOr[SharePhoto] = js.undefined
  /**
       * Video to be shared.
       */
  var video: ShareVideo
}

