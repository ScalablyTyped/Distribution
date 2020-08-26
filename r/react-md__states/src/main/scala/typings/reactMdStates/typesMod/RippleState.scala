package typings.reactMdStates.typesMod

import typings.reactMdStates.anon.CSSPropertiesleftnumberto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RippleState extends js.Object {
  var entered: Boolean = js.native
  var exiting: Boolean = js.native
  var holding: Boolean = js.native
  var startTime: Double = js.native
  var style: CSSPropertiesleftnumberto = js.native
  var `type`: RippleType = js.native
}

object RippleState {
  @scala.inline
  def apply(
    entered: Boolean,
    exiting: Boolean,
    holding: Boolean,
    startTime: Double,
    style: CSSPropertiesleftnumberto,
    `type`: RippleType
  ): RippleState = {
    val __obj = js.Dynamic.literal(entered = entered.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any], holding = holding.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleState]
  }
  @scala.inline
  implicit class RippleStateOps[Self <: RippleState] (val x: Self) extends AnyVal {
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
    def setEntered(value: Boolean): Self = this.set("entered", value.asInstanceOf[js.Any])
    @scala.inline
    def setExiting(value: Boolean): Self = this.set("exiting", value.asInstanceOf[js.Any])
    @scala.inline
    def setHolding(value: Boolean): Self = this.set("holding", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSPropertiesleftnumberto): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: RippleType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

