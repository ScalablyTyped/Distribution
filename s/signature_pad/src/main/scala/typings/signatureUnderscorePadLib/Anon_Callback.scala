package typings
package signatureUnderscorePadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var callback: js.UndefOr[js.Function1[/* error */ js.UndefOr[stdLib.ErrorEvent], scala.Unit]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var ratio: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Callback {
  @scala.inline
  def apply(
    callback: js.Function1[/* error */ js.UndefOr[stdLib.ErrorEvent], scala.Unit] = null,
    height: scala.Int | scala.Double = null,
    ratio: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Callback]
  }
}

