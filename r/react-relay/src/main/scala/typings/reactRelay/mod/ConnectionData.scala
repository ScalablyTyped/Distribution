package typings.reactRelay.mod

import typings.reactRelay.anon.PartialPageInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionData extends js.Object {
  var edges: js.UndefOr[js.Array[_] | Null] = js.undefined
  var pageInfo: js.UndefOr[PartialPageInfo | Null] = js.undefined
}

object ConnectionData {
  @scala.inline
  def apply(
    edges: js.UndefOr[Null | js.Array[_]] = js.undefined,
    pageInfo: js.UndefOr[Null | PartialPageInfo] = js.undefined
  ): ConnectionData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(edges)) __obj.updateDynamic("edges")(edges.asInstanceOf[js.Any])
    if (!js.isUndefined(pageInfo)) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionData]
  }
}

