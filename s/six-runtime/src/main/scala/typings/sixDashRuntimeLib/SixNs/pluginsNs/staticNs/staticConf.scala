package typings
package sixDashRuntimeLib.SixNs.pluginsNs.staticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait staticConf extends js.Object {
  var cacheConf: sixDashRuntimeLib.SixNs.pluginsNs.staticNs.cacheConf
  var rootPath: java.lang.String
}

object staticConf {
  @scala.inline
  def apply(cacheConf: cacheConf, rootPath: java.lang.String): staticConf = {
    val __obj = js.Dynamic.literal(cacheConf = cacheConf, rootPath = rootPath)
  
    __obj.asInstanceOf[staticConf]
  }
}

