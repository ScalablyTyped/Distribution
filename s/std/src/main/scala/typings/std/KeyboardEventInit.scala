package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardEventInit extends EventModifierInit {
  var code: js.UndefOr[java.lang.String] = js.native
  var isComposing: js.UndefOr[scala.Boolean] = js.native
  var key: js.UndefOr[java.lang.String] = js.native
  var location: js.UndefOr[Double] = js.native
  var repeat: js.UndefOr[scala.Boolean] = js.native
}

object KeyboardEventInit {
  @scala.inline
  def apply(): KeyboardEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardEventInit]
  }
  @scala.inline
  implicit class KeyboardEventInitOps[Self <: KeyboardEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: java.lang.String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setIsComposing(value: scala.Boolean): Self = this.set("isComposing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsComposing: Self = this.set("isComposing", js.undefined)
    @scala.inline
    def setKey(value: java.lang.String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLocation(value: Double): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setRepeat(value: scala.Boolean): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
  }
  
}

