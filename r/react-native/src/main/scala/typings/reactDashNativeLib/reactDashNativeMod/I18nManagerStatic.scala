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
  def apply(allowRTL: scala.Boolean => js.Object, forceRTL: scala.Boolean => js.Object, isRTL: scala.Boolean): I18nManagerStatic = {
    val __obj = js.Dynamic.literal(allowRTL = js.Any.fromFunction1(allowRTL), forceRTL = js.Any.fromFunction1(forceRTL), isRTL = isRTL)
  
    __obj.asInstanceOf[I18nManagerStatic]
  }
}

