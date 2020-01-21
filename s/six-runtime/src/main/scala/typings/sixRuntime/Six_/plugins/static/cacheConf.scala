package typings.sixRuntime.Six_.plugins.static

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
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], defer = defer.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gzip = gzip.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[cacheConf]
  }
}

