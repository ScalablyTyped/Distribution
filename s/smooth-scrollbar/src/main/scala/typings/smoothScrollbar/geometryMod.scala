package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.smoothScrollbar.scrollbarMod.ScrollbarSize
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryMod {
  
  @JSImport("smooth-scrollbar/geometry", "getSize")
  @js.native
  def getSize(scrollbar: Scrollbar): ScrollbarSize = js.native
  
  @JSImport("smooth-scrollbar/geometry", "isVisible")
  @js.native
  def isVisible(scrollbar: Scrollbar, elem: HTMLElement): Boolean = js.native
  
  @JSImport("smooth-scrollbar/geometry", "update")
  @js.native
  def update(scrollbar: Scrollbar): Unit = js.native
}
