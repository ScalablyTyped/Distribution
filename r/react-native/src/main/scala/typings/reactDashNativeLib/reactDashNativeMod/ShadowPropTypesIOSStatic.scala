package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowPropTypesIOSStatic extends js.Object {
  /**
    * Sets the drop shadow color
    * @platform ios
    */
  var shadowColor: java.lang.String
  /**
    * Sets the drop shadow offset
    * @platform ios
    */
  var shadowOffset: reactDashNativeLib.Anon_Height
  /**
    * Sets the drop shadow opacity (multiplied by the color's alpha component)
    * @platform ios
    */
  var shadowOpacity: scala.Double
  /**
    * Sets the drop shadow blur radius
    * @platform ios
    */
  var shadowRadius: scala.Double
}

object ShadowPropTypesIOSStatic {
  @scala.inline
  def apply(
    shadowColor: java.lang.String,
    shadowOffset: reactDashNativeLib.Anon_Height,
    shadowOpacity: scala.Double,
    shadowRadius: scala.Double
  ): ShadowPropTypesIOSStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("shadowColor")(shadowColor)
    __obj.updateDynamic("shadowOffset")(shadowOffset)
    __obj.updateDynamic("shadowOpacity")(shadowOpacity)
    __obj.updateDynamic("shadowRadius")(shadowRadius)
    __obj.asInstanceOf[ShadowPropTypesIOSStatic]
  }
}

