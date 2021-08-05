package typings.reactNativeElements.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBarPlatform
  extends StObject
     with SearchBarBase {
  
  /**
    * Callback fired when the cancel button is pressed
    */
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object SearchBarPlatform {
  
  inline def apply(): SearchBarPlatform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarPlatform]
  }
  
  extension [Self <: SearchBarPlatform](x: Self) {
    
    inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
  }
}
