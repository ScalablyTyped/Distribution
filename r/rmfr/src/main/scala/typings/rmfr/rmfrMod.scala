package typings.rmfr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmfr", JSImport.Namespace)
@js.native
object rmfrMod extends js.Object {
  def apply(path: String): js.Promise[Unit] = js.native
  def apply(path: String, options: Options): js.Promise[Unit] = js.native
  type Options = typings.rimraf.rimrafMod.Options with Anon_False
}

