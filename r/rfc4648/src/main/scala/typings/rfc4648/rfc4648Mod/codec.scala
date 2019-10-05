package typings.rfc4648.rfc4648Mod

import typings.rfc4648.Anon_Loose
import typings.rfc4648.Anon_Pad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc4648", "codec")
@js.native
object codec extends js.Object {
  def parse[T](data: String, encoding: Encoding): T = js.native
  def parse[T](data: String, encoding: Encoding, options: Anon_Loose[T]): T = js.native
  def stringify(data: js.Object, encoding: Encoding): String = js.native
  def stringify(data: js.Object, encoding: Encoding, options: Anon_Pad): String = js.native
}

