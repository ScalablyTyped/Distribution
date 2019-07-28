package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  var password: String
  var username: String
}

object AuthOptions {
  @scala.inline
  def apply(password: String, username: String): AuthOptions = {
    val __obj = js.Dynamic.literal(password = password, username = username)
  
    __obj.asInstanceOf[AuthOptions]
  }
}

