package typings.reachTooltip.mod

import typings.react.mod.ReactEventHandler
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerParams extends js.Object {
  
  var `aria-describedby`: String = js.native
  
  var `data-reach-tooltip-trigger`: String = js.native
  
  var onBlur: ReactEventHandler[Element] = js.native
  
  var onFocus: ReactEventHandler[Element] = js.native
  
  var onKeyDown: ReactEventHandler[Element] = js.native
  
  var onMouseDown: ReactEventHandler[Element] = js.native
  
  var onMouseEnter: ReactEventHandler[Element] = js.native
  
  var onMouseLeave: ReactEventHandler[Element] = js.native
  
  var onMouseMove: ReactEventHandler[Element] = js.native
  
  var ref: Ref[_] = js.native
}
object TriggerParams {
  
  @scala.inline
  def apply(
    `aria-describedby`: String,
    `data-reach-tooltip-trigger`: String,
    onBlur: SyntheticEvent[Element, Event] => Unit,
    onFocus: SyntheticEvent[Element, Event] => Unit,
    onKeyDown: SyntheticEvent[Element, Event] => Unit,
    onMouseDown: SyntheticEvent[Element, Event] => Unit,
    onMouseEnter: SyntheticEvent[Element, Event] => Unit,
    onMouseLeave: SyntheticEvent[Element, Event] => Unit,
    onMouseMove: SyntheticEvent[Element, Event] => Unit
  ): TriggerParams = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), onKeyDown = js.Any.fromFunction1(onKeyDown), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseMove = js.Any.fromFunction1(onMouseMove))
    __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-reach-tooltip-trigger")(`data-reach-tooltip-trigger`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerParams]
  }
  
  @scala.inline
  implicit class TriggerParamsOps[Self <: TriggerParams] (val x: Self) extends AnyVal {
    
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
    def `setAria-describedby`(value: String): Self = this.set("aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-reach-tooltip-trigger`(value: String): Self = this.set("data-reach-tooltip-trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBlur(value: SyntheticEvent[Element, Event] => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocus(value: SyntheticEvent[Element, Event] => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDown(value: SyntheticEvent[Element, Event] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseDown(value: SyntheticEvent[Element, Event] => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseEnter(value: SyntheticEvent[Element, Event] => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseLeave(value: SyntheticEvent[Element, Event] => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseMove(value: SyntheticEvent[Element, Event] => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
}
