package typings.simperium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accesstoken extends js.Object {
  var access_token: js.UndefOr[String] = js.undefined
}

object Accesstoken {
  @scala.inline
  def apply(access_token: String = null): Accesstoken = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstoken]
  }
}

