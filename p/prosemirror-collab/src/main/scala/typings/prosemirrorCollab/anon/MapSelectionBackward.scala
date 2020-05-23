package typings.prosemirrorCollab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapSelectionBackward extends js.Object {
  var mapSelectionBackward: js.UndefOr[Boolean] = js.undefined
}

object MapSelectionBackward {
  @scala.inline
  def apply(mapSelectionBackward: js.UndefOr[Boolean] = js.undefined): MapSelectionBackward = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(mapSelectionBackward)) __obj.updateDynamic("mapSelectionBackward")(mapSelectionBackward.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapSelectionBackward]
  }
}

