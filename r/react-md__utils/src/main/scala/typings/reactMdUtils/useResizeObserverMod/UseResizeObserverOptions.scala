package typings.reactMdUtils.useResizeObserverMod

import typings.react.mod.Ref
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseResizeObserverOptions[E /* <: HTMLElement */] extends js.Object {
  
  /**
    * Boolean if the `onResize` callback should not be triggered if only the
    * height has changed for the watched element.
    */
  var disableHeight: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the `onResize` callback should not be triggered if only the
    * width has changed for the watched element.
    */
  var disableWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional ref to merge with the returned ref handler function
    */
  var ref: js.UndefOr[Ref[E | Null]] = js.native
}
object UseResizeObserverOptions {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](): UseResizeObserverOptions[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseResizeObserverOptions[E]]
  }
  
  @scala.inline
  implicit class UseResizeObserverOptionsOps[Self <: UseResizeObserverOptions[_], E /* <: HTMLElement */] (val x: Self with UseResizeObserverOptions[E]) extends AnyVal {
    
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
    def setDisableHeight(value: Boolean): Self = this.set("disableHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableHeight: Self = this.set("disableHeight", js.undefined)
    
    @scala.inline
    def setDisableWidth(value: Boolean): Self = this.set("disableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableWidth: Self = this.set("disableWidth", js.undefined)
    
    @scala.inline
    def setRefFunction1(value: /* instance */ (E | Null) | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[E | Null]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
}
