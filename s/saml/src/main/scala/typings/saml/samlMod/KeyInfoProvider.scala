package typings.saml.samlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyInfoProvider extends js.Object {
  def getKeyInfo(key: String, prefix: String): String
}

object KeyInfoProvider {
  @scala.inline
  def apply(getKeyInfo: (String, String) => String): KeyInfoProvider = {
    val __obj = js.Dynamic.literal(getKeyInfo = js.Any.fromFunction2(getKeyInfo))
  
    __obj.asInstanceOf[KeyInfoProvider]
  }
}

