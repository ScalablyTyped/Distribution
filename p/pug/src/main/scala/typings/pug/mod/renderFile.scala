package typings.pug.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pug", "renderFile")
@js.native
object renderFile extends js.Object {
  def apply(path: String): String = js.native
  def apply(path: String, callback: js.Function2[/* err */ Error | Null, /* html */ String, Unit]): Unit = js.native
  def apply(path: String, options: Options with LocalsObject): String = js.native
  def apply(
    path: String,
    options: Options with LocalsObject,
    callback: js.Function2[/* err */ Error | Null, /* html */ String, Unit]
  ): Unit = js.native
}

