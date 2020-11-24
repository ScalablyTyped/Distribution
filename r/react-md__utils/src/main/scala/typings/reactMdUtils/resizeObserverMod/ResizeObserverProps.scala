package typings.reactMdUtils.resizeObserverMod

import typings.react.mod.ElementType
import typings.reactMdUtils.useResizeObserverMod.OnResizeObserverChange
import typings.reactMdUtils.useResizeObserverMod.ResizeObserverElementData
import typings.reactMdUtils.useResizeObserverV1Mod.ResizeObserverTarget
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeObserverProps extends js.Object {
  
  /**
    * An optional className to provide to this component when the `target` prop
    * is provided. You should really not be adding styles to this component as it
    * is hidden.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * This prop will only be used when the `target` prop is `undefined`. Since
    * the `ResizeObserver` will need to find a DOM node to listen to changes to,
    * it will be rendered in the dom and find the parent element for size
    * changes. You really only want to change this up if trying to listen to
    * table resize events and not using the `target` prop.
    */
  var component: js.UndefOr[ElementType[_]] = js.native
  
  /**
    * Boolean if the resize observer should stop tracking height changes. This
    * will only update the callback/renderer to not update on height changes, so
    * there will not be a huge performance boost.
    */
  var disableHeight: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the resize observer should stop tracking width changes. This
    * will only update the callback/renderer to not update on height changes, so
    * there will not be a huge performance boost.
    */
  var disableWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * The resize event handler for the resize observer. The callback will include
    * the next height, width, scrollHeight, scrollWidth, and the element that is
    * being observed.
    */
  var onResize: OnResizeObserverChange[HTMLElement] = js.native
  
  /**
    * An optional resize target to be used instead of the parent element of this
    * component.  This can either be an `HTMLElement`, a `querySelector` string,
    * a function that returns an `HTMLElement` or `null`.
    *
    * Setting this to `null` will result in a "lazy Observer". The observer will
    * not start until it has been updated to be a string or an HTMLElement.
    */
  var target: js.UndefOr[ResizeObserverTarget[HTMLElement]] = js.native
}
object ResizeObserverProps {
  
  @scala.inline
  def apply(onResize: /* resizeData */ ResizeObserverElementData[HTMLElement] => Unit): ResizeObserverProps = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    __obj.asInstanceOf[ResizeObserverProps]
  }
  
  @scala.inline
  implicit class ResizeObserverPropsOps[Self <: ResizeObserverProps] (val x: Self) extends AnyVal {
    
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
    def setOnResize(value: /* resizeData */ ResizeObserverElementData[HTMLElement] => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComponent(value: ElementType[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setDisableHeight(value: Boolean): Self = this.set("disableHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableHeight: Self = this.set("disableHeight", js.undefined)
    
    @scala.inline
    def setDisableWidth(value: Boolean): Self = this.set("disableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableWidth: Self = this.set("disableWidth", js.undefined)
    
    @scala.inline
    def setTargetFunction0(value: () => HTMLElement | Null): Self = this.set("target", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: ResizeObserverTarget[HTMLElement]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
  }
}
