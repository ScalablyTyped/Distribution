package typings.reactNative.mod

import typings.reactNative.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowPropTypesIOSStatic extends js.Object {
  
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
  implicit class ShadowPropTypesIOSStaticOps[Self <: ShadowPropTypesIOSStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setShadowColor(value: ColorValue): Self = this.set("shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffset(value: Height): Self = this.set("shadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOpacity(value: Double): Self = this.set("shadowOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowRadius(value: Double): Self = this.set("shadowRadius", value.asInstanceOf[js.Any])
  }
}
