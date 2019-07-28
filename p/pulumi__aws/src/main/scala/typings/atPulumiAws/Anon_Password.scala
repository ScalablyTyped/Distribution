package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Password extends js.Object {
  var password: String
  var url: String
  var username: String
}

object Anon_Password {
  @scala.inline
  def apply(password: String, url: String, username: String): Anon_Password = {
    val __obj = js.Dynamic.literal(password = password, url = url, username = username)
  
    __obj.asInstanceOf[Anon_Password]
  }
}

