package typings.realm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  var provider: String
  var providerToken: String
  var userInfo: js.Any
}

object Provider {
  @scala.inline
  def apply(provider: String, providerToken: String, userInfo: js.Any): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], providerToken = providerToken.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
}

