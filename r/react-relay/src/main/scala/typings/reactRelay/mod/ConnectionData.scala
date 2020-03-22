package typings.reactRelay.mod

import typings.reactRelay.PartialPageInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionData extends js.Object {
  var edges: js.UndefOr[js.Array[_] | Null] = js.undefined
  var pageInfo: js.UndefOr[PartialPageInfo | Null] = js.undefined
}

object ConnectionData {
  @scala.inline
  def apply(edges: js.Array[_] = null, pageInfo: PartialPageInfo = null): ConnectionData = {
    val __obj = js.Dynamic.literal()
    if (edges != null) __obj.updateDynamic("edges")(edges.asInstanceOf[js.Any])
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionData]
  }
}

