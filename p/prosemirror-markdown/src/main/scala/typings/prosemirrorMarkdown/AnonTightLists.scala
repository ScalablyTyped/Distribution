package typings.prosemirrorMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTightLists extends js.Object {
  var tightLists: js.UndefOr[Boolean | Null] = js.undefined
}

object AnonTightLists {
  @scala.inline
  def apply(tightLists: js.UndefOr[Boolean] = js.undefined): AnonTightLists = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tightLists)) __obj.updateDynamic("tightLists")(tightLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTightLists]
  }
}

