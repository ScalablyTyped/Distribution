package typings.reactShare.anon

import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.StyleHTMLAttributes
import typings.reactShare.reactShareStrings.screenCenter
import typings.reactShare.reactShareStrings.windowCenter
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-share.react-share.CommonShareButtonProps & {  title :string | undefined,   description :string | undefined,   image :string | undefined} */
@js.native
trait CommonShareButtonPropstitClassName extends js.Object {
  /**
    * An object to pass any additional properties, such as `aria-*` attributes.
    */
  var additionalProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  /**
    *  Takes a function that returns a Promise to be fulfilled before calling
    * `onClick`. If you do not return promise, `onClick` is called immediately.
    */
  var beforeOnClick: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.native
  /**
    * A class name to add to the others added by react-share (SocialMediaShareButton, ...).
    */
  var className: js.UndefOr[String] = js.native
  /** Description of the shared page */
  var description: js.UndefOr[String] = js.native
  /** Disables click action and adds `disabled` class */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Style when button is disabled
    * @default { opacity: 0.6 }
    */
  var disabledStyle: js.UndefOr[StyleHTMLAttributes[HTMLDivElement]] = js.native
  /** An absolute link to the image that will be shared */
  var image: js.UndefOr[String] = js.native
  /**
    * Click callback handler.
    */
  var onClick: js.UndefOr[js.Function1[/* link */ String, Unit]] = js.native
  /**
    * Takes a function to be called after closing share dialog.
    */
  var onShareWindowClose: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * If false, does not open a new window and call the onClick callback instead.
    * @default true
    */
  var openWindow: js.UndefOr[Boolean] = js.native
  /**
    * The HTML role of the div.
    * @default "button"
    */
  var role: js.UndefOr[String] = js.native
  /**
    * Extra style for the button.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Indicates that its element can be focused, and where it participates in sequential keyboard
    * navigation.
    * @default "0"
    */
  var tabIndex: js.UndefOr[Double] = js.native
  /** Title of the shared page */
  var title: js.UndefOr[String] = js.native
  /**
    * URL of the shared page
    */
  var url: String = js.native
  var windowHeight: js.UndefOr[Double] = js.native
  /**
    * Whether to center the share box respectively to the screen or to the window.
    * @default "windowCenter"
    */
  var windowPosition: js.UndefOr[windowCenter | screenCenter] = js.native
  var windowWidth: js.UndefOr[Double] = js.native
}

object CommonShareButtonPropstitClassName {
  @scala.inline
  def apply(url: String): CommonShareButtonPropstitClassName = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonShareButtonPropstitClassName]
  }
  @scala.inline
  implicit class CommonShareButtonPropstitClassNameOps[Self <: CommonShareButtonPropstitClassName] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalProps(value: HTMLAttributes[HTMLDivElement]): Self = this.set("additionalProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalProps: Self = this.set("additionalProps", js.undefined)
    @scala.inline
    def setBeforeOnClick(value: () => js.Promise[Unit] | Unit): Self = this.set("beforeOnClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeOnClick: Self = this.set("beforeOnClick", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDisabledStyle(value: StyleHTMLAttributes[HTMLDivElement]): Self = this.set("disabledStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledStyle: Self = this.set("disabledStyle", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setOnClick(value: /* link */ String => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnShareWindowClose(value: () => Unit): Self = this.set("onShareWindowClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShareWindowClose: Self = this.set("onShareWindowClose", js.undefined)
    @scala.inline
    def setOpenWindow(value: Boolean): Self = this.set("openWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenWindow: Self = this.set("openWindow", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWindowHeight(value: Double): Self = this.set("windowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowHeight: Self = this.set("windowHeight", js.undefined)
    @scala.inline
    def setWindowPosition(value: windowCenter | screenCenter): Self = this.set("windowPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowPosition: Self = this.set("windowPosition", js.undefined)
    @scala.inline
    def setWindowWidth(value: Double): Self = this.set("windowWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowWidth: Self = this.set("windowWidth", js.undefined)
  }
  
}

