package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardContentStyle extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
}
object CardContentStyle {
  
  inline def apply(): CardContentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardContentStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardContentStyle] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
