package typings.atSolidReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultSrc extends js.Object {
  var defaultSrc: js.UndefOr[String] = js.undefined
  var src: String
}

object Anon_DefaultSrc {
  @scala.inline
  def apply(src: String, defaultSrc: String = null): Anon_DefaultSrc = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (defaultSrc != null) __obj.updateDynamic("defaultSrc")(defaultSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultSrc]
  }
}

