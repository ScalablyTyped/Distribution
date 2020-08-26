package typings.reactSplitPane.mod

import typings.react.mod.CSSProperties
import typings.reactSplitPane.reactSplitPaneStrings.first
import typings.reactSplitPane.reactSplitPaneStrings.horizontal
import typings.reactSplitPane.reactSplitPaneStrings.second
import typings.reactSplitPane.reactSplitPaneStrings.vertical
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitPaneProps extends js.Object {
  var allowResize: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var defaultSize: js.UndefOr[Size] = js.native
  var maxSize: js.UndefOr[Size] = js.native
  var minSize: js.UndefOr[Size] = js.native
  var onChange: js.UndefOr[js.Function1[/* newSize */ Double, Unit]] = js.native
  var onDragFinished: js.UndefOr[js.Function1[/* newSize */ Double, Unit]] = js.native
  var onDragStarted: js.UndefOr[js.Function0[Unit]] = js.native
  var onResizerClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onResizerDoubleClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var pane1Style: js.UndefOr[CSSProperties] = js.native
  var pane2Style: js.UndefOr[CSSProperties] = js.native
  var paneStyle: js.UndefOr[CSSProperties] = js.native
  var primary: js.UndefOr[first | second] = js.native
  var resizerClassName: js.UndefOr[String] = js.native
  var resizerStyle: js.UndefOr[CSSProperties] = js.native
  var size: js.UndefOr[Size] = js.native
  var split: js.UndefOr[vertical | horizontal] = js.native
  var step: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object SplitPaneProps {
  @scala.inline
  def apply(): SplitPaneProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SplitPaneProps]
  }
  @scala.inline
  implicit class SplitPanePropsOps[Self <: SplitPaneProps] (val x: Self) extends AnyVal {
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
    def setAllowResize(value: Boolean): Self = this.set("allowResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowResize: Self = this.set("allowResize", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefaultSize(value: Size): Self = this.set("defaultSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSize: Self = this.set("defaultSize", js.undefined)
    @scala.inline
    def setMaxSize(value: Size): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setMinSize(value: Size): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    @scala.inline
    def setOnChange(value: /* newSize */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnDragFinished(value: /* newSize */ Double => Unit): Self = this.set("onDragFinished", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragFinished: Self = this.set("onDragFinished", js.undefined)
    @scala.inline
    def setOnDragStarted(value: () => Unit): Self = this.set("onDragStarted", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDragStarted: Self = this.set("onDragStarted", js.undefined)
    @scala.inline
    def setOnResizerClick(value: /* event */ MouseEvent => Unit): Self = this.set("onResizerClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResizerClick: Self = this.set("onResizerClick", js.undefined)
    @scala.inline
    def setOnResizerDoubleClick(value: /* event */ MouseEvent => Unit): Self = this.set("onResizerDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResizerDoubleClick: Self = this.set("onResizerDoubleClick", js.undefined)
    @scala.inline
    def setPane1Style(value: CSSProperties): Self = this.set("pane1Style", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane1Style: Self = this.set("pane1Style", js.undefined)
    @scala.inline
    def setPane2Style(value: CSSProperties): Self = this.set("pane2Style", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePane2Style: Self = this.set("pane2Style", js.undefined)
    @scala.inline
    def setPaneStyle(value: CSSProperties): Self = this.set("paneStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaneStyle: Self = this.set("paneStyle", js.undefined)
    @scala.inline
    def setPrimary(value: first | second): Self = this.set("primary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    @scala.inline
    def setResizerClassName(value: String): Self = this.set("resizerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizerClassName: Self = this.set("resizerClassName", js.undefined)
    @scala.inline
    def setResizerStyle(value: CSSProperties): Self = this.set("resizerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizerStyle: Self = this.set("resizerStyle", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSplit(value: vertical | horizontal): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

