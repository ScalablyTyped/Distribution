package typings.protonNative.mod

import typings.protonNative.anon.W
import typings.protonNative.anon.Y
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowProps extends StObject {
  
  /**
    * Whether the window will have a border on the inside.
    */
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Window can only have one child. To have more than one child, use boxes.
    */
  var children: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether the window is closed. If set to closed, then the window will be closed.
    */
  var closed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the window will be fullscreen on start.
    */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the window is the last window. If set to `true`, then the program will quit once the window is closed.
    */
  var lastWindow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether all children will have a margin around them and the outer edge of the window.
    */
  var margined: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether a menubar will be shown on the top of the window.
    */
  var menuBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Called when the window is closed.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when the window size is changed by the user. The new size is passed as an argument, in an object.
    */
  var onContentSizeChange: js.UndefOr[js.Function1[/* size */ Y, Unit]] = js.undefined
  
  /**
    * How big the window is when the application is first started.
    */
  var size: js.UndefOr[W] = js.undefined
  
  /**
    * The title of the window. Will be shown at the top left ribbon.
    */
  var title: js.UndefOr[String] = js.undefined
}
object WindowProps {
  
  inline def apply(): WindowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowProps] (val x: Self) extends AnyVal {
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    inline def setChildren(value: Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setLastWindow(value: Boolean): Self = StObject.set(x, "lastWindow", value.asInstanceOf[js.Any])
    
    inline def setLastWindowUndefined: Self = StObject.set(x, "lastWindow", js.undefined)
    
    inline def setMargined(value: Boolean): Self = StObject.set(x, "margined", value.asInstanceOf[js.Any])
    
    inline def setMarginedUndefined: Self = StObject.set(x, "margined", js.undefined)
    
    inline def setMenuBar(value: Boolean): Self = StObject.set(x, "menuBar", value.asInstanceOf[js.Any])
    
    inline def setMenuBarUndefined: Self = StObject.set(x, "menuBar", js.undefined)
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnContentSizeChange(value: /* size */ Y => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction1(value))
    
    inline def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
    
    inline def setSize(value: W): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
