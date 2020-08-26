package typings.reactVirtualized.esAutoSizerMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoSizerProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  /**
    *     Optional custom CSS class name to attach to root AutoSizer element.
    * This is an advanced property and is not typically necessary.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Height passed to child for initial render; useful for server-side rendering.
    * This value will be overridden with an accurate height after mounting.
    */
  var defaultHeight: js.UndefOr[Double] = js.native
  /**
    * Width passed to child for initial render; useful for server-side rendering.
    * This value will be overridden with an accurate width after mounting.
    */
  var defaultWidth: js.UndefOr[Double] = js.native
  /** Disable dynamic :height property */
  var disableHeight: js.UndefOr[Boolean] = js.native
  /** Disable dynamic :width property */
  var disableWidth: js.UndefOr[Boolean] = js.native
  /** Nonce of the inlined stylesheet for Content Security Policy */
  var nonce: js.UndefOr[String] = js.native
  /** Callback to be invoked on-resize: ({ height, width }) */
  var onResize: js.UndefOr[js.Function1[/* info */ Size, _]] = js.native
  /**
    * Optional custom inline style to attach to root AutoSizer element.
    * This is an advanced property and is not typically necessary.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Function responsible for rendering children.
    * This function should implement the following signature:
    * ({ height, width }) => PropTypes.element
    */
  def children(props: Size): ReactNode = js.native
}

object AutoSizerProps {
  @scala.inline
  def apply(children: Size => ReactNode): AutoSizerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[AutoSizerProps]
  }
  @scala.inline
  implicit class AutoSizerPropsOps[Self <: AutoSizerProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: Size => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefaultHeight(value: Double): Self = this.set("defaultHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHeight: Self = this.set("defaultHeight", js.undefined)
    @scala.inline
    def setDefaultWidth(value: Double): Self = this.set("defaultWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultWidth: Self = this.set("defaultWidth", js.undefined)
    @scala.inline
    def setDisableHeight(value: Boolean): Self = this.set("disableHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableHeight: Self = this.set("disableHeight", js.undefined)
    @scala.inline
    def setDisableWidth(value: Boolean): Self = this.set("disableWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableWidth: Self = this.set("disableWidth", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setOnResize(value: /* info */ Size => _): Self = this.set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

