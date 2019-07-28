package typings.reactDashVirtualized.distEsWindowScrollerMod

import typings.react.reactMod.ReactElement
import typings.reactDashVirtualized.Anon_ScrollTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowScrollerChildProps extends js.Object {
  var height: Double = js.native
  var isScrolling: Boolean = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
  var width: Double = js.native
  def onChildScroll(params: Anon_ScrollTop): Unit = js.native
  def registerChild(): Unit = js.native
  def registerChild(element: ReactElement): Unit = js.native
}

