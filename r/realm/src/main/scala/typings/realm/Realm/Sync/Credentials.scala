package typings.realm.Realm.Sync

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  val identityProvider: String
  val token: String
  val userInfo: StringDictionary[js.Any]
}

object Credentials {
  @scala.inline
  def apply(identityProvider: String, token: String, userInfo: StringDictionary[js.Any]): Credentials = {
    val __obj = js.Dynamic.literal(identityProvider = identityProvider.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

