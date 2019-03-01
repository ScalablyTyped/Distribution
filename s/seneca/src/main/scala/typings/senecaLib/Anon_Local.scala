package typings
package senecaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Local extends js.Object {
  var local: js.UndefOr[scala.Boolean] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Local {
  @scala.inline
  def apply(local: js.UndefOr[scala.Boolean] = js.undefined, prefix: java.lang.String = null): Anon_Local = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Anon_Local]
  }
}

