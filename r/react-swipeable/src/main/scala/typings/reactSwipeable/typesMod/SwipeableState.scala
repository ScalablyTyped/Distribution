package typings.reactSwipeable.typesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeableState extends js.Object {
  
  var cleanUpTouch: js.UndefOr[js.Function0[Unit]] = js.native
  
  var el: js.UndefOr[HTMLElement] = js.native
  
  var eventData: js.UndefOr[SwipeEventData] = js.native
  
  var first: Boolean = js.native
  
  var initial: Vector2 = js.native
  
  var start: Double = js.native
  
  var swiping: Boolean = js.native
  
  var xy: Vector2 = js.native
}
object SwipeableState {
  
  @scala.inline
  def apply(first: Boolean, initial: Vector2, start: Double, swiping: Boolean, xy: Vector2): SwipeableState = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], swiping = swiping.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeableState]
  }
  
  @scala.inline
  implicit class SwipeableStateOps[Self <: SwipeableState] (val x: Self) extends AnyVal {
    
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
    def setFirst(value: Boolean): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitial(value: Vector2): Self = this.set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwiping(value: Boolean): Self = this.set("swiping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXy(value: Vector2): Self = this.set("xy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCleanUpTouch(value: () => Unit): Self = this.set("cleanUpTouch", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCleanUpTouch: Self = this.set("cleanUpTouch", js.undefined)
    
    @scala.inline
    def setEl(value: HTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    
    @scala.inline
    def setEventData(value: SwipeEventData): Self = this.set("eventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventData: Self = this.set("eventData", js.undefined)
  }
}
