package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBarProps
  extends StObject
     with StatusBarPropsIOS
     with StatusBarPropsAndroid {
  
  /**
    * If the transition between status bar property changes should be
    * animated. Supported for backgroundColor, barStyle and hidden.
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the status bar is hidden.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
}
object StatusBarProps {
  
  inline def apply(): StatusBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusBarProps]
  }
  
  extension [Self <: StatusBarProps](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
  }
}
