package typings.primereact.dialogMod

import typings.primereact.anon.Maximized
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogProps extends js.Object {
  var appendTo: js.UndefOr[HTMLElement] = js.native
  var ariaCloseIconLabel: js.UndefOr[String] = js.native
  var baseZIndex: js.UndefOr[Double] = js.native
  var blockScroll: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var closable: js.UndefOr[Boolean] = js.native
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  var contentStyle: js.UndefOr[js.Object] = js.native
  var dismissableMask: js.UndefOr[Boolean] = js.native
  var focusOnShow: js.UndefOr[Boolean] = js.native
  var footer: js.UndefOr[js.Any] = js.native
  var header: js.UndefOr[js.Any] = js.native
  var iconsTemplate: js.UndefOr[js.Any] = js.native
  var id: js.UndefOr[String] = js.native
  var maskClassName: js.UndefOr[String] = js.native
  var maximizable: js.UndefOr[Boolean] = js.native
  var maximized: js.UndefOr[Boolean] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var onMaximize: js.UndefOr[js.Function1[/* e */ Maximized, Unit]] = js.native
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  var position: js.UndefOr[String] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var showHeader: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  def onHide(): Unit = js.native
}

object DialogProps {
  @scala.inline
  def apply(onHide: () => Unit): DialogProps = {
    val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
    __obj.asInstanceOf[DialogProps]
  }
  @scala.inline
  implicit class DialogPropsOps[Self <: DialogProps] (val x: Self) extends AnyVal {
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
    def setOnHide(value: () => Unit): Self = this.set("onHide", js.Any.fromFunction0(value))
    @scala.inline
    def setAppendTo(value: HTMLElement): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setAriaCloseIconLabel(value: String): Self = this.set("ariaCloseIconLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaCloseIconLabel: Self = this.set("ariaCloseIconLabel", js.undefined)
    @scala.inline
    def setBaseZIndex(value: Double): Self = this.set("baseZIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseZIndex: Self = this.set("baseZIndex", js.undefined)
    @scala.inline
    def setBlockScroll(value: Boolean): Self = this.set("blockScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockScroll: Self = this.set("blockScroll", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = this.set("closeOnEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnEscape: Self = this.set("closeOnEscape", js.undefined)
    @scala.inline
    def setContentStyle(value: js.Object): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    @scala.inline
    def setDismissableMask(value: Boolean): Self = this.set("dismissableMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissableMask: Self = this.set("dismissableMask", js.undefined)
    @scala.inline
    def setFocusOnShow(value: Boolean): Self = this.set("focusOnShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusOnShow: Self = this.set("focusOnShow", js.undefined)
    @scala.inline
    def setFooter(value: js.Any): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setIconsTemplate(value: js.Any): Self = this.set("iconsTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconsTemplate: Self = this.set("iconsTemplate", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMaskClassName(value: String): Self = this.set("maskClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskClassName: Self = this.set("maskClassName", js.undefined)
    @scala.inline
    def setMaximizable(value: Boolean): Self = this.set("maximizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximizable: Self = this.set("maximizable", js.undefined)
    @scala.inline
    def setMaximized(value: Boolean): Self = this.set("maximized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximized: Self = this.set("maximized", js.undefined)
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setOnMaximize(value: /* e */ Maximized => Unit): Self = this.set("onMaximize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMaximize: Self = this.set("onMaximize", js.undefined)
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

