package typings.scalike.scalikeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scalike", "Failure")
@js.native
object Failure extends js.Object {
  def apply[A](e: Error): Try[A] = js.native
}

