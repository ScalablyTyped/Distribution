package typings.semanticUiReact.messageMessageMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.ReactType
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.messageHeaderMod.MessageHeaderProps
import typings.semanticUiReact.messageItemMod.MessageItemProps
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictMessageProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** A message can be formatted to attach itself to other content. */
  var attached: js.UndefOr[Boolean | bottom | top] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** A message can be formatted to be different colors. */
  var color: js.UndefOr[SemanticCOLORS] = js.native
  /** A message can only take up the width of its content. */
  var compact: js.UndefOr[Boolean] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** A message may be formatted to display a negative message. Same as `negative`. */
  var error: js.UndefOr[Boolean] = js.native
  /** A message can float above content that it is related to. */
  var floating: js.UndefOr[Boolean] = js.native
  /** Shorthand for MessageHeader. */
  var header: js.UndefOr[SemanticShorthandItem[MessageHeaderProps]] = js.native
  /** A message can be hidden. */
  var hidden: js.UndefOr[Boolean] = js.native
  /** Add an icon by icon name or pass an <Icon /.> */
  var icon: js.UndefOr[js.Any | Boolean] = js.native
  /** A message may be formatted to display information. */
  var info: js.UndefOr[Boolean] = js.native
  /** Array shorthand items for the MessageList. Mutually exclusive with children. */
  var list: js.UndefOr[SemanticShorthandCollection[MessageItemProps]] = js.native
  /** A message may be formatted to display a negative message. Same as `error`. */
  var negative: js.UndefOr[Boolean] = js.native
  /**
    * A message that the user can choose to hide.
    * Called when the user clicks the "x" icon. This also adds the "x" icon.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onDismiss: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ MessageProps, Unit]
  ] = js.native
  /** A message may be formatted to display a positive message.  Same as `success`. */
  var positive: js.UndefOr[Boolean] = js.native
  /** A message can have different sizes. */
  var size: js.UndefOr[MessageSizeProp] = js.native
  /** A message may be formatted to display a positive message.  Same as `positive`. */
  var success: js.UndefOr[Boolean] = js.native
  /** A message can be set to visible to force itself to be shown. */
  var visible: js.UndefOr[Boolean] = js.native
  /** A message may be formatted to display warning messages. */
  var warning: js.UndefOr[Boolean] = js.native
}

object StrictMessageProps {
  @scala.inline
  def apply(): StrictMessageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictMessageProps]
  }
  @scala.inline
  implicit class StrictMessagePropsOps[Self <: StrictMessageProps] (val x: Self) extends AnyVal {
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setAttached(value: Boolean | bottom | top): Self = this.set("attached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor(value: SemanticCOLORS): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFloating(value: Boolean): Self = this.set("floating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
    @scala.inline
    def setHeaderFunction3(
      value: (/* component */ ReactType[MessageHeaderProps], MessageHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
    ): Self = this.set("header", js.Any.fromFunction3(value))
    @scala.inline
    def setHeader(value: SemanticShorthandItem[MessageHeaderProps]): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIcon(value: js.Any | Boolean): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setInfo(value: Boolean): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setListVarargs(value: SemanticShorthandItem[MessageItemProps]*): Self = this.set("list", js.Array(value :_*))
    @scala.inline
    def setList(value: SemanticShorthandCollection[MessageItemProps]): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    @scala.inline
    def setNegative(value: Boolean): Self = this.set("negative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegative: Self = this.set("negative", js.undefined)
    @scala.inline
    def setOnDismiss(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ MessageProps) => Unit): Self = this.set("onDismiss", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setPositive(value: Boolean): Self = this.set("positive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositive: Self = this.set("positive", js.undefined)
    @scala.inline
    def setSize(value: MessageSizeProp): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWarning(value: Boolean): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

