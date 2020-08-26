package typings.reactTypist.mod

import typings.reactTypist.mod.Typist.CurrentTextProps
import typings.reactTypist.mod.Typist.CursorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypistProps extends js.Object {
  var avgTypingDelay: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  var cursor: js.UndefOr[CursorProps] = js.native
  var delayGenerator: js.UndefOr[
    js.Function3[/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps, Double]
  ] = js.native
  var onCharacterTyped: js.UndefOr[js.Function2[/* char */ String, /* charIndex */ Double, Unit]] = js.native
  var onLineTyped: js.UndefOr[js.Function2[/* line */ String, /* lineIndex */ Double, Unit]] = js.native
  var onTypingDone: js.UndefOr[js.Function0[Unit]] = js.native
  var startDelay: js.UndefOr[Double] = js.native
  var stdTypingDelay: js.UndefOr[Double] = js.native
}

object TypistProps {
  @scala.inline
  def apply(): TypistProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypistProps]
  }
  @scala.inline
  implicit class TypistPropsOps[Self <: TypistProps] (val x: Self) extends AnyVal {
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
    def setAvgTypingDelay(value: Double): Self = this.set("avgTypingDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvgTypingDelay: Self = this.set("avgTypingDelay", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCursor(value: CursorProps): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDelayGenerator(value: (/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps) => Double): Self = this.set("delayGenerator", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDelayGenerator: Self = this.set("delayGenerator", js.undefined)
    @scala.inline
    def setOnCharacterTyped(value: (/* char */ String, /* charIndex */ Double) => Unit): Self = this.set("onCharacterTyped", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCharacterTyped: Self = this.set("onCharacterTyped", js.undefined)
    @scala.inline
    def setOnLineTyped(value: (/* line */ String, /* lineIndex */ Double) => Unit): Self = this.set("onLineTyped", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLineTyped: Self = this.set("onLineTyped", js.undefined)
    @scala.inline
    def setOnTypingDone(value: () => Unit): Self = this.set("onTypingDone", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnTypingDone: Self = this.set("onTypingDone", js.undefined)
    @scala.inline
    def setStartDelay(value: Double): Self = this.set("startDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDelay: Self = this.set("startDelay", js.undefined)
    @scala.inline
    def setStdTypingDelay(value: Double): Self = this.set("stdTypingDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdTypingDelay: Self = this.set("stdTypingDelay", js.undefined)
  }
  
}

