package typings.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait X11Options extends js.Object {
  /** The Screen number to use (default: `0`). */
  var screen: js.UndefOr[Double] = js.native
  /** Whether to allow just a single connection (default: `false`).*/
  var single: js.UndefOr[Boolean] = js.native
}

object X11Options {
  @scala.inline
  def apply(): X11Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X11Options]
  }
  @scala.inline
  implicit class X11OptionsOps[Self <: X11Options] (val x: Self) extends AnyVal {
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
    def setScreen(value: Double): Self = this.set("screen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreen: Self = this.set("screen", js.undefined)
    @scala.inline
    def setSingle(value: Boolean): Self = this.set("single", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingle: Self = this.set("single", js.undefined)
  }
  
}

