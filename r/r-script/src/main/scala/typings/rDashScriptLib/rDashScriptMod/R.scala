package typings
package rDashScriptLib.rDashScriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R extends js.Object {
  def call(callback: js.Function2[/* err */ js.Any, /* d */ js.Any, scala.Unit]): scala.Unit = js.native
  def call(
    options: rDashScriptLib.rDashScriptMod.RNs.Options,
    callback: js.Function2[/* err */ js.Any, /* d */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def callSync(): js.Any = js.native
  def callSync(options: rDashScriptLib.rDashScriptMod.RNs.Options): js.Any = js.native
  def data(args: js.Any*): this.type = js.native
}

