package typings
package samlLib.samlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyInfoProvider extends js.Object {
  def getKeyInfo(key: java.lang.String, prefix: java.lang.String): java.lang.String
}

object KeyInfoProvider {
  @scala.inline
  def apply(getKeyInfo: (java.lang.String, java.lang.String) => java.lang.String): KeyInfoProvider = {
    val __obj = js.Dynamic.literal(getKeyInfo = js.Any.fromFunction2(getKeyInfo))
  
    __obj.asInstanceOf[KeyInfoProvider]
  }
}

