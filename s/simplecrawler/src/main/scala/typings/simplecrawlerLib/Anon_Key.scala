package typings
package simplecrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: java.lang.String
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Key {
  @scala.inline
  def apply(key: java.lang.String, passphrase: java.lang.String = null): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    __obj.asInstanceOf[Anon_Key]
  }
}

