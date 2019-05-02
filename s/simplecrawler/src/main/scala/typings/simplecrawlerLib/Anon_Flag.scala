package typings
package simplecrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flag extends js.Object {
  var flag: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Flag {
  @scala.inline
  def apply(flag: java.lang.String = null): Anon_Flag = {
    val __obj = js.Dynamic.literal()
    if (flag != null) __obj.updateDynamic("flag")(flag)
    __obj.asInstanceOf[Anon_Flag]
  }
}

