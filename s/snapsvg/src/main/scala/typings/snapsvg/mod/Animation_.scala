package typings.snapsvg.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation_ extends js.Object {
  var attr: StringDictionary[String | Double | Boolean | js.Any] = js.native
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  var duration: Double = js.native
  var easing: js.UndefOr[js.Function1[/* num */ Double, Double]] = js.native
}

object Animation_ {
  @scala.inline
  def apply(attr: StringDictionary[String | Double | Boolean | js.Any], duration: Double): Animation_ = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation_]
  }
  @scala.inline
  implicit class Animation_Ops[Self <: Animation_] (val x: Self) extends AnyVal {
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
    def setAttr(value: StringDictionary[String | Double | Boolean | js.Any]): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setEasing(value: /* num */ Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
  }
  
}

