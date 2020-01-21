package typings.rScript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R extends js.Object {
  def call(callback: js.Function2[/* err */ js.Any, /* d */ js.Any, Unit]): Unit = js.native
  def call(options: Options, callback: js.Function2[/* err */ js.Any, /* d */ js.Any, Unit]): Unit = js.native
  def callSync(): js.Any = js.native
  def callSync(options: Options): js.Any = js.native
  def data(args: js.Any*): this.type = js.native
}

