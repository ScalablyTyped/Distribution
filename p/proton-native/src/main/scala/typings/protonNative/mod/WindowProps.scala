package typings.protonNative.mod

import typings.protonNative.anon.W
import typings.protonNative.anon.Y
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowProps extends StObject {
  
  /**
    * Whether the window will have a border on the inside.
    */
  var borderless: js.UndefOr[Boolean] = js.native
  
  /**
    * Window can only have one child. To have more than one child, use boxes.
    */
  var children: js.UndefOr[Element] = js.native
  
  /**
    * Whether the window is closed. If set to closed, then the window will be closed.
    */
  var closed: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the window will be fullscreen on start.
    */
  var fullscreen: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the window is the last window. If set to `true`, then the program will quit once the window is closed.
    */
  var lastWindow: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether all children will have a margin around them and the outer edge of the window.
    */
  var margined: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether a menubar will be shown on the top of the window.
    */
  var menuBar: js.UndefOr[Boolean] = js.native
  
  /**
    * Called when the window is closed.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Called when the window size is changed by the user. The new size is passed as an argument, in an object.
    */
  var onContentSizeChange: js.UndefOr[js.Function1[/* size */ Y, Unit]] = js.native
  
  /**
    * How big the window is when the application is first started.
    */
  var size: js.UndefOr[W] = js.native
  
  /**
    * The title of the window. Will be shown at the top left ribbon.
    */
  var title: js.UndefOr[String] = js.native
}
object WindowProps {
  
  @scala.inline
  def apply(): WindowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowProps]
  }
  
  @scala.inline
  implicit class WindowPropsMutableBuilder[Self <: WindowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    @scala.inline
    def setChildren(value: Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    @scala.inline
    def setLastWindow(value: Boolean): Self = StObject.set(x, "lastWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastWindowUndefined: Self = StObject.set(x, "lastWindow", js.undefined)
    
    @scala.inline
    def setMargined(value: Boolean): Self = StObject.set(x, "margined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginedUndefined: Self = StObject.set(x, "margined", js.undefined)
    
    @scala.inline
    def setMenuBar(value: Boolean): Self = StObject.set(x, "menuBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuBarUndefined: Self = StObject.set(x, "menuBar", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnContentSizeChange(value: /* size */ Y => Unit): Self = StObject.set(x, "onContentSizeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContentSizeChangeUndefined: Self = StObject.set(x, "onContentSizeChange", js.undefined)
    
    @scala.inline
    def setSize(value: W): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
