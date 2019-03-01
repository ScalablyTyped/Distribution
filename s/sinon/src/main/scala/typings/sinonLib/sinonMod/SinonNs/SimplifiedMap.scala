package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplifiedMap extends SimplifiedSet {
  def get(key: js.Any): js.Any
}

object SimplifiedMap {
  @scala.inline
  def apply(get: js.Function1[js.Any, js.Any], has: js.Function1[js.Any, scala.Boolean]): SimplifiedMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("has")(has)
    __obj.asInstanceOf[SimplifiedMap]
  }
}

