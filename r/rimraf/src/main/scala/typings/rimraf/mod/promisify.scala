package typings.rimraf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rimraf", "__promisify__")
@js.native
object promisify extends js.Object {
  def apply(path: String): js.Promise[Unit] = js.native
  def apply(path: String, options: Options): js.Promise[Unit] = js.native
}

