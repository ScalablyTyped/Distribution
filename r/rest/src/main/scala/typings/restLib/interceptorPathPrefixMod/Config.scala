package typings
package restLib.interceptorPathPrefixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object Config {
  @scala.inline
  def apply(prefix: java.lang.String = null): Config = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[Config]
  }
}

