package typings.realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Provider extends js.Object {
  var provider: String
  var providerToken: String
  var userInfo: js.Any
}

object Anon_Provider {
  @scala.inline
  def apply(provider: String, providerToken: String, userInfo: js.Any): Anon_Provider = {
    val __obj = js.Dynamic.literal(provider = provider, providerToken = providerToken, userInfo = userInfo)
  
    __obj.asInstanceOf[Anon_Provider]
  }
}

