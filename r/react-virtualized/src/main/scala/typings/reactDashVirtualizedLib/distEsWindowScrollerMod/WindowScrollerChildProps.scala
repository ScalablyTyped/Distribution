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
    val __obj = js.Dynamic.literal(height = height, isScrolling = isScrolling, onChildScroll = onChildScroll, scrollLeft = scrollLeft, scrollTop = scrollTop, width = width)
  
    __obj.asInstanceOf[WindowScrollerChildProps]
  }
}

