package typings.sparkDashMd5.sparkDashMd5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spark-md5", JSImport.Namespace)
@js.native
class ^ () extends SparkMD5

@JSImport("spark-md5", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hash(str: String): String = js.native
  def hash(str: String, raw: Boolean): String = js.native
  def hashBinary(content: String): String = js.native
  def hashBinary(content: String, raw: Boolean): String = js.native
}

