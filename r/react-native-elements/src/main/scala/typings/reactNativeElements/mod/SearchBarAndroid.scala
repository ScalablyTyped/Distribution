package typings.reactNativeElements.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBarAndroid
  extends StObject
     with SearchBarPlatform {
  
  /**
    * Override the cancel Icon props or use a custom component. Use null or false to hide the icon.
    */
  var cancelIcon: js.UndefOr[IconNode] = js.undefined
}
object SearchBarAndroid {
  
  inline def apply(): SearchBarAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarAndroid]
  }
  
  extension [Self <: SearchBarAndroid](x: Self) {
    
    inline def setCancelIcon(value: IconNode): Self = StObject.set(x, "cancelIcon", value.asInstanceOf[js.Any])
    
    inline def setCancelIconUndefined: Self = StObject.set(x, "cancelIcon", js.undefined)
  }
}
