package typings.sixRuntime.Six_.plugins.static

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait staticConf extends js.Object {
  var cacheConf: typings.sixRuntime.Six_.plugins.static.cacheConf
  var rootPath: String
}

object staticConf {
  @scala.inline
  def apply(cacheConf: cacheConf, rootPath: String): staticConf = {
    val __obj = js.Dynamic.literal(cacheConf = cacheConf.asInstanceOf[js.Any], rootPath = rootPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[staticConf]
  }
}

