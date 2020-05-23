package typings.reactNative.mod

import typings.reactNative.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowPropTypesIOSStatic extends js.Object {
  /**
    * Sets the drop shadow color
    * @platform ios
    */
  var shadowColor: String
  /**
    * Sets the drop shadow offset
    * @platform ios
    */
  var shadowOffset: Height
  /**
    * Sets the drop shadow opacity (multiplied by the color's alpha component)
    * @platform ios
    */
  var shadowOpacity: Double
  /**
    * Sets the drop shadow blur radius
    * @platform ios
    */
  var shadowRadius: Double
}

object ShadowPropTypesIOSStatic {
  @scala.inline
  def apply(shadowColor: String, shadowOffset: Height, shadowOpacity: Double, shadowRadius: Double): ShadowPropTypesIOSStatic = {
    val __obj = js.Dynamic.literal(shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], shadowOpacity = shadowOpacity.asInstanceOf[js.Any], shadowRadius = shadowRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowPropTypesIOSStatic]
  }
}

