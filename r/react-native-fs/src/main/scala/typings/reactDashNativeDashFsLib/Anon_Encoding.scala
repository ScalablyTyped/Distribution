package typings
package reactDashNativeDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding
  extends reactDashNativeDashFsLib.reactDashNativeDashFsMod.EncodingOrOptions {
  var encoding: js.UndefOr[reactDashNativeDashFsLib.reactDashNativeDashFsMod.Encoding] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: reactDashNativeDashFsLib.reactDashNativeDashFsMod.Encoding = null): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[Anon_Encoding]
  }
}

