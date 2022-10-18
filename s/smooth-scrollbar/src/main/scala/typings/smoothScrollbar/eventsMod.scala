package typings.smoothScrollbar

import typings.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("smooth-scrollbar/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keyboardHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("keyboardHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mouseHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resizeHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resizeHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def selectHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("selectHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def touchHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("touchHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def wheelHandler(scrollbar: Scrollbar): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("wheelHandler")(scrollbar.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
