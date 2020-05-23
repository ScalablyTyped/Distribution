package typings.prosemirrorMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TightLists extends js.Object {
  var tightLists: js.UndefOr[Boolean | Null] = js.undefined
}

object TightLists {
  @scala.inline
  def apply(tightLists: js.UndefOr[Null | Boolean] = js.undefined): TightLists = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tightLists)) __obj.updateDynamic("tightLists")(tightLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[TightLists]
  }
}

