package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedId extends _ResolveIdResult {
  var external: js.UndefOr[scala.Boolean | scala.Unit] = js.undefined
  var id: java.lang.String
}

object ResolvedId {
  @scala.inline
  def apply(id: java.lang.String, external: scala.Boolean | scala.Unit = null): ResolvedId = {
    val __obj = js.Dynamic.literal(id = id)
    if (external != null) __obj.updateDynamic("external")(external.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedId]
  }
}

