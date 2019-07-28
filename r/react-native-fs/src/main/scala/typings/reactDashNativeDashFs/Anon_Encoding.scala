package typings.reactDashNativeDashFs

import typings.reactDashNativeDashFs.reactDashNativeDashFsMod.Encoding
import typings.reactDashNativeDashFs.reactDashNativeDashFsMod.EncodingOrOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends EncodingOrOptions {
  var encoding: js.UndefOr[Encoding] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: Encoding = null): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[Anon_Encoding]
  }
}

