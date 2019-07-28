package typings.promiseDashSftp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Echo extends js.Object {
  /** Whether the user's input should be displayed on-screen */
  var echo: Boolean
  /** The query to pose to the user */
  var prompt: String
}

object Anon_Echo {
  @scala.inline
  def apply(echo: Boolean, prompt: String): Anon_Echo = {
    val __obj = js.Dynamic.literal(echo = echo, prompt = prompt)
  
    __obj.asInstanceOf[Anon_Echo]
  }
}

