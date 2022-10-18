package typings.reactNativeMaps.anon

import typings.reactNativeMaps.reactNativeMapsStrings.`marker-press`
import typings.reactNativeMaps.reactNativeMapsStrings.press
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  /**
    * @platform Android
    */
  var action: js.UndefOr[press | `marker-press`] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setAction(value: press | `marker-press`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
  }
}
