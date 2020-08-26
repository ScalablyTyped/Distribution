package typings.reactVirtualized.esWindowScrollerMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactVirtualized.anon.Height
import typings.reactVirtualized.anon.ScrollLeft
import typings.std.Element
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowScrollerProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  /** Callback to be invoked on-resize: ({ height, width }) */
  var onResize: js.UndefOr[js.Function1[/* params */ Height, Unit]] = js.native
  /** Callback to be invoked on-scroll: ({ scrollLeft, scrollTop }) */
  var onScroll: js.UndefOr[js.Function1[/* params */ ScrollLeft, Unit]] = js.native
  /** Element to attach scroll event listeners. Defaults to window. */
  var scrollElement: js.UndefOr[(Window with (/* globalThis */ js.Any)) | Element] = js.native
  /**
    * Wait this amount of time after the last scroll event before resetting child `pointer-events`.
    */
  var scrollingResetTimeInterval: js.UndefOr[Double] = js.native
  /** Height used for server-side rendering */
  var serverHeight: js.UndefOr[Double] = js.native
  /** Width used for server-side rendering */
  var serverWidth: js.UndefOr[Double] = js.native
  /**
    * Function responsible for rendering children.
    * This function should implement the following signature:
    * ({ height, isScrolling, scrollLeft, scrollTop, width, onChildScroll }) => PropTypes.element
    */
  def children(params: WindowScrollerChildProps): ReactNode = js.native
}

object WindowScrollerProps {
  @scala.inline
  def apply(children: WindowScrollerChildProps => ReactNode): WindowScrollerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[WindowScrollerProps]
  }
  @scala.inline
  implicit class WindowScrollerPropsOps[Self <: WindowScrollerProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: WindowScrollerChildProps => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setOnResize(value: /* params */ Height => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setOnScroll(value: /* params */ ScrollLeft => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    @scala.inline
    def setScrollElement(value: (Window with (/* globalThis */ js.Any)) | Element): Self = this.set("scrollElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollElement: Self = this.set("scrollElement", js.undefined)
    @scala.inline
    def setScrollingResetTimeInterval(value: Double): Self = this.set("scrollingResetTimeInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollingResetTimeInterval: Self = this.set("scrollingResetTimeInterval", js.undefined)
    @scala.inline
    def setServerHeight(value: Double): Self = this.set("serverHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerHeight: Self = this.set("serverHeight", js.undefined)
    @scala.inline
    def setServerWidth(value: Double): Self = this.set("serverWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerWidth: Self = this.set("serverWidth", js.undefined)
  }
  
}

