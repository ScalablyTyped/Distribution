package typings.realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProvider extends js.Object {
  var provider: String
  var providerToken: String
  var userInfo: js.Any
}

object AnonProvider {
  @scala.inline
  def apply(provider: String, providerToken: String, userInfo: js.Any): AnonProvider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], providerToken = providerToken.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProvider]
  }
}

