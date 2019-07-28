package typings.shopifyDashPrime.distOptionsScriptUnderscoreTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptTagOptions extends js.Object {
  /**
    * Filters the result to script tags with the given src.
    */
  var src: js.UndefOr[String] = js.undefined
}

object ScriptTagOptions {
  @scala.inline
  def apply(src: String = null): ScriptTagOptions = {
    val __obj = js.Dynamic.literal()
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[ScriptTagOptions]
  }
}

