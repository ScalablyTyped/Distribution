package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.dark
import typings.reactNativeNavigation.reactNativeNavigationStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsStatusBar extends StObject {
  
  /**
    * Animate StatusBar style changes.
    * #### (iOS specific)
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the background color of the status bar
    * #### (Android specific)
    */
  var backgroundColor: js.UndefOr[Color] = js.undefined
  
  /**
    * Blur content beneath the StatusBar.
    * #### (iOS specific)
    */
  var blur: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Draw screen behind the status bar
    * #### (Android specific)
    */
  var drawBehind: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Automatically hide the StatusBar when the TopBar hides.
    * #### (iOS specific)
    */
  var hideWithTopBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the text color of the status bar
    * @default 'light'
    */
  var style: js.UndefOr[light | dark] = js.undefined
  
  /**
    * Allows the StatusBar to be translucent (blurred)
    * #### (Android specific)
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the status bar visibility
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object OptionsStatusBar {
  
  inline def apply(): OptionsStatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsStatusBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsStatusBar] (val x: Self) extends AnyVal {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBlur(value: Boolean): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    inline def setDrawBehind(value: Boolean): Self = StObject.set(x, "drawBehind", value.asInstanceOf[js.Any])
    
    inline def setDrawBehindUndefined: Self = StObject.set(x, "drawBehind", js.undefined)
    
    inline def setHideWithTopBar(value: Boolean): Self = StObject.set(x, "hideWithTopBar", value.asInstanceOf[js.Any])
    
    inline def setHideWithTopBarUndefined: Self = StObject.set(x, "hideWithTopBar", js.undefined)
    
    inline def setStyle(value: light | dark): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
