package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreWarnings extends js.Object {
  def ignoreWarnings(warnings: js.Array[String]): Unit
}

object Anon_IgnoreWarnings {
  @scala.inline
  def apply(ignoreWarnings: js.Array[String] => Unit): Anon_IgnoreWarnings = {
    val __obj = js.Dynamic.literal(ignoreWarnings = js.Any.fromFunction1(ignoreWarnings))
  
    __obj.asInstanceOf[Anon_IgnoreWarnings]
  }
}

