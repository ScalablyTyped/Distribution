package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.smoothScrollbar.scrollbarMod.ScrollbarSize
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smooth-scrollbar/geometry", JSImport.Namespace)
@js.native
object geometryMod extends js.Object {
  
  def getSize(scrollbar: Scrollbar): ScrollbarSize = js.native
  
  def isVisible(scrollbar: Scrollbar, elem: HTMLElement): Boolean = js.native
  
  def update(scrollbar: Scrollbar): Unit = js.native
}
