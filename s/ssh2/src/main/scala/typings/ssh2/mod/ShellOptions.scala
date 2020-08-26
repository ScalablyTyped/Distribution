package typings.ssh2.mod

import typings.node.processMod.global.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellOptions extends js.Object {
  /** An environment to use for the execution of the shell. */
  var env: js.UndefOr[ProcessEnv] = js.native
  /** Set either to `true` to use defaults, a number to specify a specific screen number, or an object containing x11 settings. */
  var x11: js.UndefOr[Boolean | Double | X11Options] = js.native
}

object ShellOptions {
  @scala.inline
  def apply(): ShellOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellOptions]
  }
  @scala.inline
  implicit class ShellOptionsOps[Self <: ShellOptions] (val x: Self) extends AnyVal {
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
    def setEnv(value: ProcessEnv): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setX11(value: Boolean | Double | X11Options): Self = this.set("x11", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX11: Self = this.set("x11", js.undefined)
  }
  
}

