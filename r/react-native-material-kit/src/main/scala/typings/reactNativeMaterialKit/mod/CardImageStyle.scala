package typings.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardImageStyle extends StObject {
  
  var height: js.UndefOr[Double] = js.native
  
  var resizeMode: js.UndefOr[String] = js.native
}
object CardImageStyle {
  
  @scala.inline
  def apply(): CardImageStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardImageStyle]
  }
  
  @scala.inline
  implicit class CardImageStyleMutableBuilder[Self <: CardImageStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setResizeMode(value: String): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
  }
}
