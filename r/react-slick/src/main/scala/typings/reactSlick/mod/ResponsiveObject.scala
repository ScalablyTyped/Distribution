package typings.reactSlick.mod

import typings.reactSlick.reactSlickStrings.unslick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveObject extends js.Object {
  var breakpoint: Double = js.native
  var settings: unslick | Settings = js.native
}

object ResponsiveObject {
  @scala.inline
  def apply(breakpoint: Double, settings: unslick | Settings): ResponsiveObject = {
    val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsiveObject]
  }
  @scala.inline
  implicit class ResponsiveObjectOps[Self <: ResponsiveObject] (val x: Self) extends AnyVal {
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
    def setBreakpoint(value: Double): Self = this.set("breakpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: unslick | Settings): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
  
}

