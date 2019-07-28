package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enable extends js.Object {
  var enable: Boolean
  var enable_text: Boolean
}

object Anon_Enable {
  @scala.inline
  def apply(enable: Boolean, enable_text: Boolean): Anon_Enable = {
    val __obj = js.Dynamic.literal(enable = enable, enable_text = enable_text)
  
    __obj.asInstanceOf[Anon_Enable]
  }
}

