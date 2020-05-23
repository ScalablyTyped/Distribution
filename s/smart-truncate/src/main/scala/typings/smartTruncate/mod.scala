package typings.smartTruncate

import typings.smartTruncate.anon.Mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smart-truncate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def smartTruncate(text: String, length: Double): String = js.native
  def smartTruncate(text: String, length: Double, options: Mark): String = js.native
}

