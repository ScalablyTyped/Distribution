package typings.senchaTouch.Ext.slider

import typings.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThumb extends IComponent {
  /** [Config Option] (Object) */
  var draggable: js.UndefOr[js.Any] = js.native
  /** [Method] Returns the value of draggable
    * @returns Object
    */
  var getDraggable: js.UndefOr[js.Function0[_]] = js.native
}

object IThumb {
  @scala.inline
  def apply(): IThumb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IThumb]
  }
  @scala.inline
  implicit class IThumbOps[Self <: IThumb] (val x: Self) extends AnyVal {
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
    def setDraggable(value: js.Any): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setGetDraggable(value: () => _): Self = this.set("getDraggable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDraggable: Self = this.set("getDraggable", js.undefined)
  }
  
}

