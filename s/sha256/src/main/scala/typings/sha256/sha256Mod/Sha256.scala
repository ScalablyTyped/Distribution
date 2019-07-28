package typings.sha256.sha256Mod

import typings.sha256.Anon_AsBytes
import typings.sha256.Anon_AsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha256 extends js.Object {
  def apply(message: Message): String = js.native
  def apply(message: Message, options: Anon_AsBytes): js.Array[Double] = js.native
  def apply(message: Message, options: Anon_AsString): String = js.native
}

