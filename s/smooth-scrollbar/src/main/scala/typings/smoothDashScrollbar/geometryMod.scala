package typings.smoothDashScrollbar

import typings.smoothDashScrollbar.interfacesScrollbarMod.Scrollbar
import typings.smoothDashScrollbar.interfacesScrollbarMod.ScrollbarSize
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/geometry", JSImport.Namespace)
@js.native
object geometryMod extends js.Object {
  def getSize(scrollbar: Scrollbar): ScrollbarSize = js.native
  def isVisible(scrollbar: Scrollbar, elem: HTMLElement): Boolean = js.native
  def update(scrollbar: Scrollbar): Unit = js.native
}

