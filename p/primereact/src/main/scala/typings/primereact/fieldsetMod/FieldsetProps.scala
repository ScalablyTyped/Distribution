package typings.primereact.fieldsetMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldsetProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var collapsed: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var legend: js.UndefOr[js.Any] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onCollapse: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onExpand: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var onToggle: js.UndefOr[js.Function1[/* e */ typings.primereact.anon.Event, Unit]] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var toggleable: js.UndefOr[Boolean] = js.native
}
object FieldsetProps {
  
  @scala.inline
  def apply(): FieldsetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldsetProps]
  }
  
  @scala.inline
  implicit class FieldsetPropsOps[Self <: FieldsetProps] (val x: Self) extends AnyVal {
    
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
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLegend(value: js.Any): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* event */ Event => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnCollapse(value: /* event */ Event => Unit): Self = this.set("onCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCollapse: Self = this.set("onCollapse", js.undefined)
    
    @scala.inline
    def setOnExpand(value: /* event */ Event => Unit): Self = this.set("onExpand", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnExpand: Self = this.set("onExpand", js.undefined)
    
    @scala.inline
    def setOnToggle(value: /* e */ typings.primereact.anon.Event => Unit): Self = this.set("onToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setToggleable(value: Boolean): Self = this.set("toggleable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleable: Self = this.set("toggleable", js.undefined)
  }
}
