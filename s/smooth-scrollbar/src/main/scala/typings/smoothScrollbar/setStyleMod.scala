package typings.smoothScrollbar

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setStyleMod {
  
  @JSImport("smooth-scrollbar/utils/set-style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def setStyle(elem: HTMLElement, styles: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyle")(elem.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
