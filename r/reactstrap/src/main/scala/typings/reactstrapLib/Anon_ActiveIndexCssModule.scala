package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveIndexCssModule extends js.Object {
  var activeIndex: scala.Double
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var items: js.Array[js.Object]
  def onClickHandler(idx: scala.Double): scala.Unit
}

object Anon_ActiveIndexCssModule {
  @scala.inline
  def apply(
    activeIndex: scala.Double,
    items: js.Array[js.Object],
    onClickHandler: js.Function1[scala.Double, scala.Unit],
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null
  ): Anon_ActiveIndexCssModule = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex, items = items, onClickHandler = onClickHandler)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    __obj.asInstanceOf[Anon_ActiveIndexCssModule]
  }
}

