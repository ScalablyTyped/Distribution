package typings.sixDashRuntime.SixNs.pluginsNs.staticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cacheConf extends js.Object {
  var cache: Boolean
  var defer: Boolean
  var extensions: Boolean | js.Array[String]
  var gzip: Boolean
  var index: String
  var maxAge: Double
}

object cacheConf {
  @scala.inline
  def apply(
    cache: Boolean,
    defer: Boolean,
    extensions: Boolean | js.Array[String],
    gzip: Boolean,
    index: String,
    maxAge: Double
  ): cacheConf = {
    val __obj = js.Dynamic.literal(cache = cache, defer = defer, extensions = extensions.asInstanceOf[js.Any], gzip = gzip, index = index, maxAge = maxAge)
  
    __obj.asInstanceOf[cacheConf]
  }
}

