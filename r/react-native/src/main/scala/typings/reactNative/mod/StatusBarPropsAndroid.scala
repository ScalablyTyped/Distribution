package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBarPropsAndroid extends StObject {
  
  /**
    * The background color of the status bar.
    *
    * @platform android
    */
  var backgroundColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * If the status bar is translucent. When translucent is set to true,
    * the app will draw under the status bar. This is useful when using a
    * semi transparent status bar color.
    *
    * @platform android
    */
  var translucent: js.UndefOr[Boolean] = js.undefined
}
object StatusBarPropsAndroid {
  
  inline def apply(): StatusBarPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusBarPropsAndroid]
  }
  
  extension [Self <: StatusBarPropsAndroid](x: Self) {
    
    inline def setBackgroundColor(value: ColorValue): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
  }
}
