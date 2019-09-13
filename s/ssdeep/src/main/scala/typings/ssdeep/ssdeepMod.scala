package typings.ssdeep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssdeep", JSImport.Namespace)
@js.native
object ssdeepMod extends js.Object {
  def compare(hash1: String, hash2: String): Double = js.native
  def hash(content: String): String = js.native
  def hash_from_file(path: String): String = js.native
}

