package typings.saxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLDecl extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var standalone: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object XMLDecl {
  @scala.inline
  def apply(encoding: String = null, standalone: String = null, version: String = null): XMLDecl = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (standalone != null) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLDecl]
  }
}

