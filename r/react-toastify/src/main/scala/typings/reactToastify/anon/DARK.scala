package typings.reactToastify.anon

import typings.reactToastify.typesMod.TypeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DARK extends js.Object {
  var DARK: TypeOptions = js.native
  var DEFAULT: TypeOptions = js.native
  var ERROR: TypeOptions = js.native
  var INFO: TypeOptions = js.native
  var SUCCESS: TypeOptions = js.native
  var WARNING: TypeOptions = js.native
}

object DARK {
  @scala.inline
  def apply(
    DARK: TypeOptions,
    DEFAULT: TypeOptions,
    ERROR: TypeOptions,
    INFO: TypeOptions,
    SUCCESS: TypeOptions,
    WARNING: TypeOptions
  ): DARK = {
    val __obj = js.Dynamic.literal(DARK = DARK.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any], WARNING = WARNING.asInstanceOf[js.Any])
    __obj.asInstanceOf[DARK]
  }
  @scala.inline
  implicit class DARKOps[Self <: DARK] (val x: Self) extends AnyVal {
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
    def setDARK(value: TypeOptions): Self = this.set("DARK", value.asInstanceOf[js.Any])
    @scala.inline
    def setDEFAULT(value: TypeOptions): Self = this.set("DEFAULT", value.asInstanceOf[js.Any])
    @scala.inline
    def setERROR(value: TypeOptions): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setINFO(value: TypeOptions): Self = this.set("INFO", value.asInstanceOf[js.Any])
    @scala.inline
    def setSUCCESS(value: TypeOptions): Self = this.set("SUCCESS", value.asInstanceOf[js.Any])
    @scala.inline
    def setWARNING(value: TypeOptions): Self = this.set("WARNING", value.asInstanceOf[js.Any])
  }
  
}

