package typings.reactNativeMaterialKit.mod

import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.dashed
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.dotted
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardActionStyle extends StObject {
  
  var borderStyle: js.UndefOr[solid | dotted | dashed] = js.native
  
  var borderTopColor: js.UndefOr[String] = js.native
  
  var borderTopWidth: js.UndefOr[Double] = js.native
  
  var padding: js.UndefOr[Double] = js.native
}
object CardActionStyle {
  
  @scala.inline
  def apply(): CardActionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardActionStyle]
  }
  
  @scala.inline
  implicit class CardActionStyleMutableBuilder[Self <: CardActionStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderStyle(value: solid | dotted | dashed): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
    
    @scala.inline
    def setBorderTopColor(value: String): Self = StObject.set(x, "borderTopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopColorUndefined: Self = StObject.set(x, "borderTopColor", js.undefined)
    
    @scala.inline
    def setBorderTopWidth(value: Double): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopWidthUndefined: Self = StObject.set(x, "borderTopWidth", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
