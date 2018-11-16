package typings
package sha256Lib.sha256Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha256 extends js.Object {
  def apply(message: sha256Lib.Message): java.lang.String = js.native
  def apply(message: sha256Lib.Message, options: sha256Lib.Anon_AsBytes): js.Array[scala.Double] = js.native
  def apply(message: sha256Lib.Message, options: sha256Lib.Anon_AsString): java.lang.String = js.native
}

