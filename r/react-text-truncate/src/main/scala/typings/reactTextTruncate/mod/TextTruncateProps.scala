package typings.reactTextTruncate.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTruncateProps extends js.Object {
  var containerClassName: js.UndefOr[String] = js.native
  var element: js.UndefOr[String] = js.native
  var line: js.UndefOr[Double | Boolean] = js.native
  var maxCalculateTimes: js.UndefOr[Double] = js.native
  var onCalculated: js.UndefOr[js.Function0[Unit]] = js.native
  var onToggled: js.UndefOr[js.Function1[/* truncated */ Boolean, Unit]] = js.native
  var onTruncated: js.UndefOr[js.Function0[Unit]] = js.native
  var text: js.UndefOr[String] = js.native
  var textElement: js.UndefOr[ReactNode] = js.native
  var textTruncateChild: js.UndefOr[ReactNode] = js.native
  var truncateText: js.UndefOr[String] = js.native
}

object TextTruncateProps {
  @scala.inline
  def apply(): TextTruncateProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTruncateProps]
  }
  @scala.inline
  implicit class TextTruncatePropsOps[Self <: TextTruncateProps] (val x: Self) extends AnyVal {
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
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClassName: Self = this.set("containerClassName", js.undefined)
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setLine(value: Double | Boolean): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setMaxCalculateTimes(value: Double): Self = this.set("maxCalculateTimes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCalculateTimes: Self = this.set("maxCalculateTimes", js.undefined)
    @scala.inline
    def setOnCalculated(value: () => Unit): Self = this.set("onCalculated", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCalculated: Self = this.set("onCalculated", js.undefined)
    @scala.inline
    def setOnToggled(value: /* truncated */ Boolean => Unit): Self = this.set("onToggled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnToggled: Self = this.set("onToggled", js.undefined)
    @scala.inline
    def setOnTruncated(value: () => Unit): Self = this.set("onTruncated", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnTruncated: Self = this.set("onTruncated", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextElement(value: ReactNode): Self = this.set("textElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextElement: Self = this.set("textElement", js.undefined)
    @scala.inline
    def setTextTruncateChild(value: ReactNode): Self = this.set("textTruncateChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextTruncateChild: Self = this.set("textTruncateChild", js.undefined)
    @scala.inline
    def setTruncateText(value: String): Self = this.set("truncateText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncateText: Self = this.set("truncateText", js.undefined)
  }
  
}

