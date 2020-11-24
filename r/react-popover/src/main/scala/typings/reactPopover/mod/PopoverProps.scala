package typings.reactPopover.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopoverProps extends js.Object {
  
  var appendTarget: js.UndefOr[Element] = js.native
  
  var body: ReactNode = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var enterExitTransitionDurationMs: js.UndefOr[Double] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var onOuterAction: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var place: js.UndefOr[PopoverPlace] = js.native
  
  var preferPlace: js.UndefOr[PopoverPlace] = js.native
  
  var refreshIntervalMs: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var target: js.UndefOr[ReactElement] = js.native
  
  var tipSize: js.UndefOr[Double] = js.native
}
object PopoverProps {
  
  @scala.inline
  def apply(): PopoverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopoverProps]
  }
  
  @scala.inline
  implicit class PopoverPropsOps[Self <: PopoverProps] (val x: Self) extends AnyVal {
    
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
    def setAppendTarget(value: Element): Self = this.set("appendTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppendTarget: Self = this.set("appendTarget", js.undefined)
    
    @scala.inline
    def setBody(value: ReactNode): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setEnterExitTransitionDurationMs(value: Double): Self = this.set("enterExitTransitionDurationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterExitTransitionDurationMs: Self = this.set("enterExitTransitionDurationMs", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setOnOuterAction(value: /* event */ Event => Unit): Self = this.set("onOuterAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOuterAction: Self = this.set("onOuterAction", js.undefined)
    
    @scala.inline
    def setPlace(value: PopoverPlace): Self = this.set("place", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlace: Self = this.set("place", js.undefined)
    
    @scala.inline
    def setPreferPlace(value: PopoverPlace): Self = this.set("preferPlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferPlace: Self = this.set("preferPlace", js.undefined)
    
    @scala.inline
    def setRefreshIntervalMs(value: Double): Self = this.set("refreshIntervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshIntervalMs: Self = this.set("refreshIntervalMs", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTarget(value: ReactElement): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTipSize(value: Double): Self = this.set("tipSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTipSize: Self = this.set("tipSize", js.undefined)
  }
}
