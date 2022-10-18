package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterExitAnimationOptions extends StObject {
  
  /**
    * Animate opening component
    */
  var enter: js.UndefOr[ViewAnimationOptions] = js.undefined
  
  /**
    * Animate closing component
    */
  var exit: js.UndefOr[ViewAnimationOptions] = js.undefined
}
object EnterExitAnimationOptions {
  
  inline def apply(): EnterExitAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterExitAnimationOptions]
  }
  
  extension [Self <: EnterExitAnimationOptions](x: Self) {
    
    inline def setEnter(value: ViewAnimationOptions): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: ViewAnimationOptions): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
