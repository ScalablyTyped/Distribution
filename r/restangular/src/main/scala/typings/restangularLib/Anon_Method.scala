package typings
package restangularLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: java.lang.String
  var params: js.Any
  var url: java.lang.String
}

object Anon_Method {
  @scala.inline
  def apply(method: java.lang.String, params: js.Any, url: java.lang.String): Anon_Method = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Method]
  }
}

