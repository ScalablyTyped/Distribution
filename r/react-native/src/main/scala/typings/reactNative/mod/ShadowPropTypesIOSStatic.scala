package typings.reactNative.mod

import typings.reactNative.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowPropTypesIOSStatic extends StObject {
  
  /**
    * Sets the drop shadow color
    * @platform ios
    */
  var shadowColor: ColorValue = js.native
  
  /**
    * Sets the drop shadow offset
    * @platform ios
    */
  var shadowOffset: Height = js.native
  
  /**
    * Sets the drop shadow opacity (multiplied by the color's alpha component)
    * @platform ios
    */
  var shadowOpacity: Double = js.native
  
  /**
    * Sets the drop shadow blur radius
    * @platform ios
    */
  var shadowRadius: Double = js.native
}
object ShadowPropTypesIOSStatic {
  
  @scala.inline
  def apply(shadowColor: ColorValue, shadowOffset: Height, shadowOpacity: Double, shadowRadius: Double): ShadowPropTypesIOSStatic = {
    val __obj = js.Dynamic.literal(shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], shadowOpacity = shadowOpacity.asInstanceOf[js.Any], shadowRadius = shadowRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowPropTypesIOSStatic]
  }
  
  @scala.inline
  implicit class ShadowPropTypesIOSStaticMutableBuilder[Self <: ShadowPropTypesIOSStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShadowColor(value: ColorValue): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffset(value: Height): Self = StObject.set(x, "shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOpacity(value: Double): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowRadius(value: Double): Self = StObject.set(x, "shadowRadius", value.asInstanceOf[js.Any])
  }
}
