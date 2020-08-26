package typings.reactWindow.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonProps extends js.Object {
  /**
    * Optional CSS class to attach to outermost <div> element.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Tag name passed to document.createElement to create the inner container element. This is an advanced property; in most cases, the default ("div") should be used.
    */
  var innerElementType: js.UndefOr[ReactElementType] = js.native
  /**
    * Ref to attach to the inner container element. This is an advanced property.
    */
  var innerRef: js.UndefOr[Ref[_]] = js.native
  /**
    * Tag name passed to document.createElement to create the inner container element. This is an advanced property; in most cases, the default ("div") should be used.
    *
    * @deprecated since 1.4.0
    */
  var innerTagName: js.UndefOr[String] = js.native
  /**
    * Contextual data to be passed to the item renderer as a data prop. This is a light-weight alternative to React's built-in context API.
    *
    * Item data is useful for item renderers that are class components.
    */
  var itemData: js.UndefOr[js.Any] = js.native
  /**
    * Tag name passed to document.createElement to create the outer container element. This is an advanced property; in most cases, the default ("div") should be used.
    */
  var outerElementType: js.UndefOr[ReactElementType] = js.native
  /**
    * Ref to attach to the outer container element. This is an advanced property.
    */
  var outerRef: js.UndefOr[Ref[_]] = js.native
  /**
    * Tag name passed to document.createElement to create the outer container element. This is an advanced property; in most cases, the default ("div") should be used.
    *
    * @deprecated since 1.4.0
    */
  var outerTagName: js.UndefOr[String] = js.native
  /**
    * Optional inline style to attach to outermost <div> element.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Adds an additional isScrolling parameter to the children render function. This parameter can be used to show a placeholder row or column while the list is being scrolled.
    *
    * Note that using this parameter will result in an additional render call after scrolling has stopped (when isScrolling changes from true to false).
    */
  var useIsScrolling: js.UndefOr[Boolean] = js.native
}

object CommonProps {
  @scala.inline
  def apply(): CommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonProps]
  }
  @scala.inline
  implicit class CommonPropsOps[Self <: CommonProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setInnerElementType(value: ReactElementType): Self = this.set("innerElementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerElementType: Self = this.set("innerElementType", js.undefined)
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: Ref[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    @scala.inline
    def setInnerTagName(value: String): Self = this.set("innerTagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerTagName: Self = this.set("innerTagName", js.undefined)
    @scala.inline
    def setItemData(value: js.Any): Self = this.set("itemData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemData: Self = this.set("itemData", js.undefined)
    @scala.inline
    def setOuterElementType(value: ReactElementType): Self = this.set("outerElementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterElementType: Self = this.set("outerElementType", js.undefined)
    @scala.inline
    def setOuterRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("outerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setOuterRef(value: Ref[_]): Self = this.set("outerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterRef: Self = this.set("outerRef", js.undefined)
    @scala.inline
    def setOuterRefNull: Self = this.set("outerRef", null)
    @scala.inline
    def setOuterTagName(value: String): Self = this.set("outerTagName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOuterTagName: Self = this.set("outerTagName", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUseIsScrolling(value: Boolean): Self = this.set("useIsScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseIsScrolling: Self = this.set("useIsScrolling", js.undefined)
  }
  
}

