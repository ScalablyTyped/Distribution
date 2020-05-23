package typings.rdflib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Q extends js.Object {
  var q: js.UndefOr[Double | String] = js.undefined
}

object Q {
  @scala.inline
  def apply(q: Double | String = null): Q = {
    val __obj = js.Dynamic.literal()
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    __obj.asInstanceOf[Q]
  }
}

