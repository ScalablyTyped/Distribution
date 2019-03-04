package typings
package sixDashRuntimeLib.SixNs.pluginsNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait runtimeConf extends js.Object {
  var codeKey: java.lang.String
  var dataKey: java.lang.String
  var msgKey: java.lang.String
}

object runtimeConf {
  @scala.inline
  def apply(codeKey: java.lang.String, dataKey: java.lang.String, msgKey: java.lang.String): runtimeConf = {
    val __obj = js.Dynamic.literal(codeKey = codeKey, dataKey = dataKey, msgKey = msgKey)
  
    __obj.asInstanceOf[runtimeConf]
  }
}

