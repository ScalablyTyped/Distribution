package typings.reactVis.anon

import typings.reactVis.mod.RVTickFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var domain: js.Array[Double]
  var name: String
  var tickFormat: js.UndefOr[RVTickFormat] = js.undefined
}

object Domain {
  @scala.inline
  def apply(domain: js.Array[Double], name: String, tickFormat: /* tick */ js.Any => String = null): Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (tickFormat != null) __obj.updateDynamic("tickFormat")(js.Any.fromFunction1(tickFormat))
    __obj.asInstanceOf[Domain]
  }
}

