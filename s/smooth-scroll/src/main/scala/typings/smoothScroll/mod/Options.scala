package typings.smoothScroll.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var clip: js.UndefOr[Boolean] = js.native
  
  var customEasing: js.UndefOr[js.Function1[/* time */ Double, Double]] = js.native
  
  var durationMax: js.UndefOr[Double | Null] = js.native
  
  var durationMin: js.UndefOr[Double | Null] = js.native
  
  var easing: js.UndefOr[Easing] = js.native
  
  // Custom Events
  var emitEvents: js.UndefOr[Boolean] = js.native
  
  var header: js.UndefOr[String] = js.native
  
  // Selectors
  var ignore: js.UndefOr[String] = js.native
  
  var offset: js.UndefOr[
    Double | (js.Function2[
      /* anchor */ js.UndefOr[Element | Double | Null], 
      /* toggle */ js.UndefOr[Element | Null], 
      Double
    ])
  ] = js.native
  
  var popstate: js.UndefOr[Boolean] = js.native
  
  // Speed & Easing
  var speed: js.UndefOr[Double] = js.native
  
  var speedAsDuration: js.UndefOr[Boolean] = js.native
  
  var topOnEmptyHash: js.UndefOr[Boolean] = js.native
  
  // History
  var updateURL: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setClip(value: Boolean): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def setCustomEasing(value: /* time */ Double => Double): Self = this.set("customEasing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomEasing: Self = this.set("customEasing", js.undefined)
    
    @scala.inline
    def setDurationMax(value: Double): Self = this.set("durationMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationMax: Self = this.set("durationMax", js.undefined)
    
    @scala.inline
    def setDurationMaxNull: Self = this.set("durationMax", null)
    
    @scala.inline
    def setDurationMin(value: Double): Self = this.set("durationMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationMin: Self = this.set("durationMin", js.undefined)
    
    @scala.inline
    def setDurationMinNull: Self = this.set("durationMin", null)
    
    @scala.inline
    def setEasing(value: Easing): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setEmitEvents(value: Boolean): Self = this.set("emitEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmitEvents: Self = this.set("emitEvents", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setIgnore(value: String): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setOffsetFunction2(
      value: (/* anchor */ js.UndefOr[Element | Double | Null], /* toggle */ js.UndefOr[Element | Null]) => Double
    ): Self = this.set("offset", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOffset(
      value: Double | (js.Function2[
          /* anchor */ js.UndefOr[Element | Double | Null], 
          /* toggle */ js.UndefOr[Element | Null], 
          Double
        ])
    ): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPopstate(value: Boolean): Self = this.set("popstate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopstate: Self = this.set("popstate", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setSpeedAsDuration(value: Boolean): Self = this.set("speedAsDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeedAsDuration: Self = this.set("speedAsDuration", js.undefined)
    
    @scala.inline
    def setTopOnEmptyHash(value: Boolean): Self = this.set("topOnEmptyHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopOnEmptyHash: Self = this.set("topOnEmptyHash", js.undefined)
    
    @scala.inline
    def setUpdateURL(value: Boolean): Self = this.set("updateURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateURL: Self = this.set("updateURL", js.undefined)
  }
}
