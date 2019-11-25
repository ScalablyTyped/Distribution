package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nManagerStatic extends js.Object {
  var isRTL: Boolean
  def allowRTL(allowRTL: Boolean): js.Object
  def forceRTL(forceRTL: Boolean): js.Object
}

object I18nManagerStatic {
  @scala.inline
  def apply(allowRTL: Boolean => js.Object, forceRTL: Boolean => js.Object, isRTL: Boolean): I18nManagerStatic = {
    val __obj = js.Dynamic.literal(allowRTL = js.Any.fromFunction1(allowRTL), forceRTL = js.Any.fromFunction1(forceRTL), isRTL = isRTL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[I18nManagerStatic]
  }
}

