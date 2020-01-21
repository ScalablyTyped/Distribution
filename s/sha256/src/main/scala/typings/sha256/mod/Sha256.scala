package typings.sha256.mod

import typings.sha256.AnonAsBytes
import typings.sha256.AnonAsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha256 extends js.Object {
  def apply(message: Message): String = js.native
  def apply(message: Message, options: AnonAsBytes): js.Array[Double] = js.native
  def apply(message: Message, options: AnonAsString): String = js.native
}

