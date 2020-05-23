package typings.snykDepGraph.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompareRoot extends js.Object {
  var compareRoot: js.UndefOr[Boolean] = js.undefined
}

object CompareRoot {
  @scala.inline
  def apply(compareRoot: js.UndefOr[Boolean] = js.undefined): CompareRoot = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compareRoot)) __obj.updateDynamic("compareRoot")(compareRoot.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompareRoot]
  }
}

