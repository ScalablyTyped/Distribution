package typings.reactTypingEffect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTypingEffectProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var cursor: js.UndefOr[String] = js.native
  var cursorClassName: js.UndefOr[String] = js.native
  var eraseDelay: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
  var staticText: js.UndefOr[String] = js.native
  var text: String | js.Array[String] = js.native
  var typingDelay: js.UndefOr[Double] = js.native
}

object ReactTypingEffectProps {
  @scala.inline
  def apply(text: String | js.Array[String]): ReactTypingEffectProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactTypingEffectProps]
  }
  @scala.inline
  implicit class ReactTypingEffectPropsOps[Self <: ReactTypingEffectProps] (val x: Self) extends AnyVal {
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
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setText(value: String | js.Array[String]): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setCursorClassName(value: String): Self = this.set("cursorClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorClassName: Self = this.set("cursorClassName", js.undefined)
    @scala.inline
    def setEraseDelay(value: Double): Self = this.set("eraseDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEraseDelay: Self = this.set("eraseDelay", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setStaticText(value: String): Self = this.set("staticText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticText: Self = this.set("staticText", js.undefined)
    @scala.inline
    def setTypingDelay(value: Double): Self = this.set("typingDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypingDelay: Self = this.set("typingDelay", js.undefined)
  }
  
}

