package typings.reactMdExpansionPanel.expansionPanelMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactMdCard.cardMod.CardProps
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpansionPanelProps
  extends CardProps
     with ConfigurableCardContentProps {
  /**
    * An optional className to provide the content of the panel.
    */
  var contentClassName: js.UndefOr[String] = js.native
  /**
    * An optional style to provide to the content of the panel.
    */
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * An optional header element to display instead of the default
    * implementation.
    */
  var customHeader: js.UndefOr[ReactNode] = js.native
  /**
    * Boolean if the collapse transition should be disabled for the content
    * within the panel. It is recommended to disable this transition if there is
    * a lot of content within the panel since animating max-height isn't super
    * great since it causes DOM repaints during the entire transition.
    */
  var disableTransition: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if clicking on the header should no longer toggle the expansion
    * state. This will automatically be provided from the `usePanels` hook for
    * when a panel cannot be closed to do preventing all panels from being closed
    * at a time.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the panel is currently expanded.
    */
  var expanded: Boolean = js.native
  /**
    * An optional expander icon to use within the default header implementation.
    * This defaults to the `"expander"` icon.
    */
  var expanderIcon: js.UndefOr[ReactNode] = js.native
  /**
    * The children to display within the default header element.
    */
  var header: js.UndefOr[ReactNode] = js.native
  /**
    * An optional className to provide to the default header implementation. If
    * the `header` prop is provided, this will do nothing.
    */
  var headerClassName: js.UndefOr[String] = js.native
  /**
    * An optional ref to pass to the default header implementation. This will be
    * provided automatically if you are using the `usePanels` hook to allow
    * keyboard movement with the arrow keys and home/end keys. If you provide
    * your own `header`, you'll need to pass the `headerRef` to your custom
    * implementation to the focusable element for the keyboard focus behavior to
    * work.
    */
  var headerRef: js.UndefOr[Ref[HTMLButtonElement]] = js.native
  /**
    * An optional style object to provide to the default header implementation. If
    * the `header` prop is provided, this will do nothing.
    */
  var headerStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * An id for the panel that is required for a11y.
    */
  @JSName("id")
  var id_ExpansionPanelProps: String = js.native
  /**
    * Boolean if margin top should be applied to this header to add some
    * additional spacing between this panel and the previous panel. This will
    * automatically be provided for panels when using the `usePanels` hook.
    */
  var marginTop: js.UndefOr[Boolean] = js.native
  /**
    * A function that should attempt to change the expansion state of the panel.
    */
  var onExpandClick: MouseEventHandler[HTMLButtonElement] = js.native
  /**
    * Boolean if the content should be persistent within the DOM instead of
    * unmounting once no longer expanded. This is only really helpful if you want
    * to maintain state while the panel is hidden since the children will unmount
    * when not expanded.
    */
  var persistent: js.UndefOr[Boolean] = js.native
}

object ExpansionPanelProps {
  @scala.inline
  def apply(
    expanded: Boolean,
    id: String,
    onExpandClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit
  ): ExpansionPanelProps = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onExpandClick = js.Any.fromFunction1(onExpandClick))
    __obj.asInstanceOf[ExpansionPanelProps]
  }
  @scala.inline
  implicit class ExpansionPanelPropsOps[Self <: ExpansionPanelProps] (val x: Self) extends AnyVal {
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
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnExpandClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = this.set("onExpandClick", js.Any.fromFunction1(value))
    @scala.inline
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    @scala.inline
    def setContentStyle(value: CSSProperties): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    @scala.inline
    def setCustomHeader(value: ReactNode): Self = this.set("customHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomHeader: Self = this.set("customHeader", js.undefined)
    @scala.inline
    def setDisableTransition(value: Boolean): Self = this.set("disableTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTransition: Self = this.set("disableTransition", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setExpanderIcon(value: ReactNode): Self = this.set("expanderIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanderIcon: Self = this.set("expanderIcon", js.undefined)
    @scala.inline
    def setHeader(value: ReactNode): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderClassName(value: String): Self = this.set("headerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderClassName: Self = this.set("headerClassName", js.undefined)
    @scala.inline
    def setHeaderRefFunction1(value: /* instance */ HTMLButtonElement | Null => Unit): Self = this.set("headerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaderRef(value: Ref[HTMLButtonElement]): Self = this.set("headerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderRef: Self = this.set("headerRef", js.undefined)
    @scala.inline
    def setHeaderRefNull: Self = this.set("headerRef", null)
    @scala.inline
    def setHeaderStyle(value: CSSProperties): Self = this.set("headerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderStyle: Self = this.set("headerStyle", js.undefined)
    @scala.inline
    def setMarginTop(value: Boolean): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistent: Self = this.set("persistent", js.undefined)
  }
  
}

