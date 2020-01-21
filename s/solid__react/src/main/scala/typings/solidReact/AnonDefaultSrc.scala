package typings.solidReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultSrc extends js.Object {
  var defaultSrc: js.UndefOr[String] = js.undefined
  var src: String
}

object AnonDefaultSrc {
  @scala.inline
  def apply(src: String, defaultSrc: String = null): AnonDefaultSrc = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (defaultSrc != null) __obj.updateDynamic("defaultSrc")(defaultSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultSrc]
  }
}

