package typings
package prosemirrorDashMarkdownLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TightLists extends js.Object {
  var tightLists: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
}

object Anon_TightLists {
  @scala.inline
  def apply(tightLists: js.UndefOr[scala.Boolean] = js.undefined): Anon_TightLists = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tightLists)) __obj.updateDynamic("tightLists")(tightLists)
    __obj.asInstanceOf[Anon_TightLists]
  }
}

