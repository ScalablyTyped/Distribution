package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RefreshControlPropsAndroid extends ViewProps {
  /**
       * The colors (at least one) that will be used to draw the refresh indicator.
       */
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * Whether the pull to refresh functionality is enabled.
       */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The background color of the refresh indicator.
       */
  var progressBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Progress view top offset
       * @platform android
       */
  var progressViewOffset: js.UndefOr[scala.Double] = js.undefined
  /**
       * Size of the refresh indicator, see RefreshControl.SIZE.
       */
  var size: js.UndefOr[scala.Double] = js.undefined
}

