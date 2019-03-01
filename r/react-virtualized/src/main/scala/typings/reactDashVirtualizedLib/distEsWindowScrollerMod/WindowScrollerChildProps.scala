package typings
package reactDashVirtualizedLib.distEsWindowScrollerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowScrollerChildProps extends js.Object {
  var height: scala.Double
  var isScrolling: scala.Boolean
  var scrollLeft: scala.Double
  var scrollTop: scala.Double
  var width: scala.Double
  def onChildScroll(params: reactDashVirtualizedLib.Anon_ScrollTop): scala.Unit
}

object WindowScrollerChildProps {
  @scala.inline
  def apply(
    height: scala.Double,
    isScrolling: scala.Boolean,
    onChildScroll: js.Function1[reactDashVirtualizedLib.Anon_ScrollTop, scala.Unit],
    scrollLeft: scala.Double,
    scrollTop: scala.Double,
    width: scala.Double
  ): WindowScrollerChildProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("isScrolling")(isScrolling)
    __obj.updateDynamic("onChildScroll")(onChildScroll)
    __obj.updateDynamic("scrollLeft")(scrollLeft)
    __obj.updateDynamic("scrollTop")(scrollTop)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[WindowScrollerChildProps]
  }
}

