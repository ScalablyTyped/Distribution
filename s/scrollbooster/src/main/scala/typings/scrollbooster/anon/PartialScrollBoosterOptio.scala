package typings.scrollbooster.anon

import typings.scrollbooster.mod.ScrollingState
import typings.scrollbooster.scrollboosterStrings.all
import typings.scrollbooster.scrollboosterStrings.horizontal
import typings.scrollbooster.scrollboosterStrings.mouse
import typings.scrollbooster.scrollboosterStrings.native
import typings.scrollbooster.scrollboosterStrings.touch
import typings.scrollbooster.scrollboosterStrings.transform
import typings.scrollbooster.scrollboosterStrings.vertical
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<scrollbooster.scrollbooster.ScrollBoosterOptions> */
@js.native
trait PartialScrollBoosterOptio extends js.Object {
  
  var bounce: js.UndefOr[Boolean] = js.native
  
  var bounceForce: js.UndefOr[Double] = js.native
  
  var content: js.UndefOr[HTMLElement | Null] = js.native
  
  var direction: js.UndefOr[horizontal | vertical | all] = js.native
  
  var emulateScroll: js.UndefOr[Boolean] = js.native
  
  var friction: js.UndefOr[Double] = js.native
  
  var inputsFocus: js.UndefOr[Boolean] = js.native
  
  var onClick: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event, Unit]] = js.native
  
  var onUpdate: js.UndefOr[js.Function1[/* state */ ScrollingState, Unit]] = js.native
  
  var pointerMode: js.UndefOr[touch | mouse | all] = js.native
  
  var scrollMode: js.UndefOr[transform | native] = js.native
  
  var shouldScroll: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event, Boolean]] = js.native
  
  var textSelection: js.UndefOr[Boolean] = js.native
  
  var viewport: js.UndefOr[HTMLElement | Null] = js.native
}
object PartialScrollBoosterOptio {
  
  @scala.inline
  def apply(): PartialScrollBoosterOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollBoosterOptio]
  }
  
  @scala.inline
  implicit class PartialScrollBoosterOptioOps[Self <: PartialScrollBoosterOptio] (val x: Self) extends AnyVal {
    
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
    def setBounce(value: Boolean): Self = this.set("bounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounce: Self = this.set("bounce", js.undefined)
    
    @scala.inline
    def setBounceForce(value: Double): Self = this.set("bounceForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounceForce: Self = this.set("bounceForce", js.undefined)
    
    @scala.inline
    def setContent(value: HTMLElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setDirection(value: horizontal | vertical | all): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setEmulateScroll(value: Boolean): Self = this.set("emulateScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmulateScroll: Self = this.set("emulateScroll", js.undefined)
    
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    
    @scala.inline
    def setInputsFocus(value: Boolean): Self = this.set("inputsFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputsFocus: Self = this.set("inputsFocus", js.undefined)
    
    @scala.inline
    def setOnClick(value: (/* state */ ScrollingState, /* event */ Event) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: /* state */ ScrollingState => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setPointerMode(value: touch | mouse | all): Self = this.set("pointerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerMode: Self = this.set("pointerMode", js.undefined)
    
    @scala.inline
    def setScrollMode(value: transform | native): Self = this.set("scrollMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollMode: Self = this.set("scrollMode", js.undefined)
    
    @scala.inline
    def setShouldScroll(value: (/* state */ ScrollingState, /* event */ Event) => Boolean): Self = this.set("shouldScroll", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteShouldScroll: Self = this.set("shouldScroll", js.undefined)
    
    @scala.inline
    def setTextSelection(value: Boolean): Self = this.set("textSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextSelection: Self = this.set("textSelection", js.undefined)
    
    @scala.inline
    def setViewport(value: HTMLElement): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
    
    @scala.inline
    def setViewportNull: Self = this.set("viewport", null)
  }
}
