package typings
package realmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Provider extends js.Object {
  var provider: java.lang.String
  var providerToken: java.lang.String
  var userInfo: js.Any
}

object Anon_Provider {
  @scala.inline
  def apply(provider: java.lang.String, providerToken: java.lang.String, userInfo: js.Any): Anon_Provider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provider")(provider)
    __obj.updateDynamic("providerToken")(providerToken)
    __obj.updateDynamic("userInfo")(userInfo)
    __obj.asInstanceOf[Anon_Provider]
  }
}

