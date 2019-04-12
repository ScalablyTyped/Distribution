package typings
package atSolidReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultSrc extends js.Object {
  var defaultSrc: js.UndefOr[java.lang.String] = js.undefined
  var src: java.lang.String
}

object Anon_DefaultSrc {
  @scala.inline
  def apply(src: java.lang.String, defaultSrc: java.lang.String = null): Anon_DefaultSrc = {
    val __obj = js.Dynamic.literal(src = src)
    if (defaultSrc != null) __obj.updateDynamic("defaultSrc")(defaultSrc)
    __obj.asInstanceOf[Anon_DefaultSrc]
  }
}

