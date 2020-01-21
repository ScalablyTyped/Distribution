package typings.quotedPrintable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("quoted-printable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val version: String = js.native
  def decode(input: String): String = js.native
  def encode(input: String): String = js.native
}

