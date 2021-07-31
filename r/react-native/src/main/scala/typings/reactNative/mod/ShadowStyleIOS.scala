package typings.reactNative.mod

import typings.reactNative.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowStyleIOS extends StObject {
  
  var shadowColor: js.UndefOr[ColorValue] = js.undefined
  
  var shadowOffset: js.UndefOr[Height] = js.undefined
  
  var shadowOpacity: js.UndefOr[Double] = js.undefined
  
  var shadowRadius: js.UndefOr[Double] = js.undefined
}
object ShadowStyleIOS {
  
  @scala.inline
  def apply(): ShadowStyleIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowStyleIOS]
  }
  
  @scala.inline
  implicit class ShadowStyleIOSMutableBuilder[Self <: ShadowStyleIOS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShadowColor(value: ColorValue): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffset(value: Height): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetUndefined: Self = StObject.set(x, "shadowOffset", js.undefined)
    
    @scala.inline
    def setShadowOpacity(value: Double): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOpacityUndefined: Self = StObject.set(x, "shadowOpacity", js.undefined)
    
    @scala.inline
    def setShadowRadius(value: Double): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowRadiusUndefined: Self = StObject.set(x, "shadowRadius", js.undefined)
  }
}
