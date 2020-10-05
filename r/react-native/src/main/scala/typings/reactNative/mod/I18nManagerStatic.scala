package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I18nManagerStatic extends js.Object {
  var isRTL: Boolean = js.native
  def allowRTL(allowRTL: Boolean): js.Object = js.native
  def forceRTL(forceRTL: Boolean): js.Object = js.native
}

object I18nManagerStatic {
  @scala.inline
  def apply(allowRTL: Boolean => js.Object, forceRTL: Boolean => js.Object, isRTL: Boolean): I18nManagerStatic = {
    val __obj = js.Dynamic.literal(allowRTL = js.Any.fromFunction1(allowRTL), forceRTL = js.Any.fromFunction1(forceRTL), isRTL = isRTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nManagerStatic]
  }
  @scala.inline
  implicit class I18nManagerStaticOps[Self <: I18nManagerStatic] (val x: Self) extends AnyVal {
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
    def setAllowRTL(value: Boolean => js.Object): Self = this.set("allowRTL", js.Any.fromFunction1(value))
    @scala.inline
    def setForceRTL(value: Boolean => js.Object): Self = this.set("forceRTL", js.Any.fromFunction1(value))
    @scala.inline
    def setIsRTL(value: Boolean): Self = this.set("isRTL", value.asInstanceOf[js.Any])
  }
  
}

