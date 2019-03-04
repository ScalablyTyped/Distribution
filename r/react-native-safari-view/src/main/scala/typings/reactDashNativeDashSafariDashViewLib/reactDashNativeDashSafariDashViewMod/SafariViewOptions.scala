package typings
package reactDashNativeDashSafariDashViewLib.reactDashNativeDashSafariDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafariViewOptions extends js.Object {
  /**
    * A String containing a hex or rgba color to use for the background of the browser controls (only available on iOS 10 and higher)
    *
    */
  var barTintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A Boolean indicating to open the Safari View from the bottom
    *
    */
  var fromBottom: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A Boolean indicating to use Safari's Reader Mode if available
    *
    */
  var readerMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A String containing a hex or rgba color to use for the browser controls
    *
    */
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A String containing the url you want to load in the Safari View
    *
    */
  var url: java.lang.String
}

object SafariViewOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    barTintColor: java.lang.String = null,
    fromBottom: js.UndefOr[scala.Boolean] = js.undefined,
    readerMode: js.UndefOr[scala.Boolean] = js.undefined,
    tintColor: java.lang.String = null
  ): SafariViewOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (barTintColor != null) __obj.updateDynamic("barTintColor")(barTintColor)
    if (!js.isUndefined(fromBottom)) __obj.updateDynamic("fromBottom")(fromBottom)
    if (!js.isUndefined(readerMode)) __obj.updateDynamic("readerMode")(readerMode)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    __obj.asInstanceOf[SafariViewOptions]
  }
}

