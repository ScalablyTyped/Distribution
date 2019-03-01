package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Password extends js.Object {
  var password: java.lang.String
  var url: java.lang.String
  var username: java.lang.String
}

object Anon_Password {
  @scala.inline
  def apply(password: java.lang.String, url: java.lang.String, username: java.lang.String): Anon_Password = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Password]
  }
}

