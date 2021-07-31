package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.absolute
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.relative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardMenuStyle extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[absolute | relative] = js.undefined
  
  var right: js.UndefOr[Double] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
}
object CardMenuStyle {
  
  @scala.inline
  def apply(): CardMenuStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardMenuStyle]
  }
  
  @scala.inline
  implicit class CardMenuStyleMutableBuilder[Self <: CardMenuStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setPosition(value: absolute | relative): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
