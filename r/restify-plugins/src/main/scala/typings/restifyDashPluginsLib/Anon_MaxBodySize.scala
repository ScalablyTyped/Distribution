package typings
package restifyDashPluginsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxBodySize extends js.Object {
  var maxBodySize: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MaxBodySize {
  @scala.inline
  def apply(maxBodySize: scala.Int | scala.Double = null): Anon_MaxBodySize = {
    val __obj = js.Dynamic.literal()
    if (maxBodySize != null) __obj.updateDynamic("maxBodySize")(maxBodySize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxBodySize]
  }
}

