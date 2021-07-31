package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.smoothScrollbar.scrollbarMod.ScrollbarSize
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryMod {
  
  @JSImport("smooth-scrollbar/geometry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSize(scrollbar: Scrollbar): ScrollbarSize = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[ScrollbarSize]
  
  @scala.inline
  def isVisible(scrollbar: Scrollbar, elem: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVisible")(scrollbar.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def update(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
