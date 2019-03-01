package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Status extends js.Object {
  var status: java.lang.String
  var url: java.lang.String
}

object Anon_Status {
  @scala.inline
  def apply(status: java.lang.String, url: java.lang.String): Anon_Status = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Status]
  }
}

