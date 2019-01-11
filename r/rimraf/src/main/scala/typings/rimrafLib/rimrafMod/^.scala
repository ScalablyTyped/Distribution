package typings
package rimrafLib.rimrafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rimraf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var BUSYTRIES_MAX: scala.Double = js.native
  var EMFILE_MAX: scala.Double = js.native
  def apply(path: java.lang.String, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  def apply(
    path: java.lang.String,
    options: rimrafLib.rimrafMod.rimrafNs.Options,
    callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): scala.Unit = js.native
  def `__promisify__`(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def `__promisify__`(path: java.lang.String, options: rimrafLib.rimrafMod.rimrafNs.Options): js.Promise[scala.Unit] = js.native
  def sync(path: java.lang.String): scala.Unit = js.native
  def sync(path: java.lang.String, options: rimrafLib.rimrafMod.rimrafNs.Options): scala.Unit = js.native
}

