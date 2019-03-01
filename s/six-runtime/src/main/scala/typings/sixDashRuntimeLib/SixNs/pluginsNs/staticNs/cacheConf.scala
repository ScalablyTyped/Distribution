package typings
package sixDashRuntimeLib.SixNs.pluginsNs.staticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cacheConf extends js.Object {
  var cache: scala.Boolean
  var defer: scala.Boolean
  var extensions: scala.Boolean | js.Array[java.lang.String]
  var gzip: scala.Boolean
  var index: java.lang.String
  var maxAge: scala.Double
}

object cacheConf {
  @scala.inline
  def apply(
    cache: scala.Boolean,
    defer: scala.Boolean,
    extensions: scala.Boolean | js.Array[java.lang.String],
    gzip: scala.Boolean,
    index: java.lang.String,
    maxAge: scala.Double
  ): cacheConf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("defer")(defer)
    __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.updateDynamic("gzip")(gzip)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("maxAge")(maxAge)
    __obj.asInstanceOf[cacheConf]
  }
}

