package typings.rimraf.rimrafMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rimraf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var BUSYTRIES_MAX: Double = js.native
  var EMFILE_MAX: Double = js.native
  def apply(path: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def apply(path: String, options: Options, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
}

