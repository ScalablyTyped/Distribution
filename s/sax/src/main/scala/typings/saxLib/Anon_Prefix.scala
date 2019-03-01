package typings
package saxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Prefix extends js.Object {
  var prefix: java.lang.String
  var uri: java.lang.String
}

object Anon_Prefix {
  @scala.inline
  def apply(prefix: java.lang.String, uri: java.lang.String): Anon_Prefix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Anon_Prefix]
  }
}

