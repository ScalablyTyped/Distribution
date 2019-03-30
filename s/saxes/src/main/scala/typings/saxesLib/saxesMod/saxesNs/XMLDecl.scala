package typings
package saxesLib.saxesMod.saxesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLDecl extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var standalone: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object XMLDecl {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    standalone: java.lang.String = null,
    version: java.lang.String = null
  ): XMLDecl = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (standalone != null) __obj.updateDynamic("standalone")(standalone)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[XMLDecl]
  }
}

