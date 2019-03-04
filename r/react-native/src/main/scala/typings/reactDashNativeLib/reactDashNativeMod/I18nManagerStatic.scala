package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nManagerStatic extends js.Object {
  var isRTL: scala.Boolean
  def allowRTL(allowRTL: scala.Boolean): js.Object
  def forceRTL(forceRTL: scala.Boolean): js.Object
}

object I18nManagerStatic {
  @scala.inline
  def apply(
    allowRTL: js.Function1[scala.Boolean, js.Object],
    forceRTL: js.Function1[scala.Boolean, js.Object],
    isRTL: scala.Boolean
  ): I18nManagerStatic = {
    val __obj = js.Dynamic.literal(allowRTL = allowRTL, forceRTL = forceRTL, isRTL = isRTL)
  
    __obj.asInstanceOf[I18nManagerStatic]
  }
}

