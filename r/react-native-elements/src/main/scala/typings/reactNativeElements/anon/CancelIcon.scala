package typings.reactNativeElements.anon

import typings.reactNativeElements.distIconsIconMod.IconNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelIcon extends StObject {
  
  var cancelIcon: js.UndefOr[IconNode] = js.undefined
}
object CancelIcon {
  
  inline def apply(): CancelIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelIcon] (val x: Self) extends AnyVal {
    
    inline def setCancelIcon(value: IconNode): Self = StObject.set(x, "cancelIcon", value.asInstanceOf[js.Any])
    
    inline def setCancelIconUndefined: Self = StObject.set(x, "cancelIcon", js.undefined)
  }
}
