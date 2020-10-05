package typings.rcSelect.selectTriggerMod

import typings.rcSelect.interfaceMod.RenderDOMFunc
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectTriggerProps extends js.Object {
  var animation: js.UndefOr[String] = js.native
  var children: ReactElement = js.native
  var containerWidth: Double = js.native
  var direction: String = js.native
  var disabled: Boolean = js.native
  var dropdownAlign: js.Object = js.native
  var dropdownClassName: String = js.native
  var dropdownMatchSelectWidth: js.UndefOr[Boolean | Double] = js.native
  var dropdownRender: js.UndefOr[js.Function1[/* menu */ ReactElement, ReactElement]] = js.native
  var dropdownStyle: CSSProperties = js.native
  var empty: Boolean = js.native
  var getPopupContainer: js.UndefOr[RenderDOMFunc] = js.native
  var popupElement: ReactElement = js.native
  var prefixCls: String = js.native
  var transitionName: js.UndefOr[String] = js.native
  var visible: Boolean = js.native
  def getTriggerDOMNode(): HTMLElement = js.native
}

object SelectTriggerProps {
  @scala.inline
  def apply(
    children: ReactElement,
    containerWidth: Double,
    direction: String,
    disabled: Boolean,
    dropdownAlign: js.Object,
    dropdownClassName: String,
    dropdownStyle: CSSProperties,
    empty: Boolean,
    getTriggerDOMNode: () => HTMLElement,
    popupElement: ReactElement,
    prefixCls: String,
    visible: Boolean
  ): SelectTriggerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropdownAlign = dropdownAlign.asInstanceOf[js.Any], dropdownClassName = dropdownClassName.asInstanceOf[js.Any], dropdownStyle = dropdownStyle.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], getTriggerDOMNode = js.Any.fromFunction0(getTriggerDOMNode), popupElement = popupElement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectTriggerProps]
  }
  @scala.inline
  implicit class SelectTriggerPropsOps[Self <: SelectTriggerProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerWidth(value: Double): Self = this.set("containerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropdownAlign(value: js.Object): Self = this.set("dropdownAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropdownClassName(value: String): Self = this.set("dropdownClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropdownStyle(value: CSSProperties): Self = this.set("dropdownStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTriggerDOMNode(value: () => HTMLElement): Self = this.set("getTriggerDOMNode", js.Any.fromFunction0(value))
    @scala.inline
    def setPopupElement(value: ReactElement): Self = this.set("popupElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setDropdownMatchSelectWidth(value: Boolean | Double): Self = this.set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropdownMatchSelectWidth: Self = this.set("dropdownMatchSelectWidth", js.undefined)
    @scala.inline
    def setDropdownRender(value: /* menu */ ReactElement => ReactElement): Self = this.set("dropdownRender", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDropdownRender: Self = this.set("dropdownRender", js.undefined)
    @scala.inline
    def setGetPopupContainer(value: /* props */ js.Any => HTMLElement): Self = this.set("getPopupContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPopupContainer: Self = this.set("getPopupContainer", js.undefined)
    @scala.inline
    def setTransitionName(value: String): Self = this.set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionName: Self = this.set("transitionName", js.undefined)
  }
  
}

