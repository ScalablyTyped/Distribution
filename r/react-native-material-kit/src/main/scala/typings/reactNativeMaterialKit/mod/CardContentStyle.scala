package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardContentStyle extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var padding: js.UndefOr[Double] = js.native
}
object CardContentStyle {
  
  @scala.inline
  def apply(): CardContentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardContentStyle]
  }
  
  @scala.inline
  implicit class CardContentStyleMutableBuilder[Self <: CardContentStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
