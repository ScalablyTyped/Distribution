package typings.prosemirrorDashMarkdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TightLists extends js.Object {
  var tightLists: js.UndefOr[Boolean | Null] = js.undefined
}

object Anon_TightLists {
  @scala.inline
  def apply(tightLists: js.UndefOr[Boolean] = js.undefined): Anon_TightLists = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tightLists)) __obj.updateDynamic("tightLists")(tightLists)
    __obj.asInstanceOf[Anon_TightLists]
  }
}

