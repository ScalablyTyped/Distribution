package typings.slate.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "KeyUtils")
@js.native
object KeyUtils extends js.Object {
  def create(): String = js.native
  def create(key: String): String = js.native
  def resetGenerator(): Unit = js.native
  def setGenerator(func: js.Function0[_]): Unit = js.native
}

