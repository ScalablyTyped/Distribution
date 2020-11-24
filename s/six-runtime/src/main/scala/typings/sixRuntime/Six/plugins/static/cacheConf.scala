package typings.sixRuntime.Six.plugins.static

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait cacheConf extends js.Object {
  
  var cache: Boolean = js.native
  
  var defer: Boolean = js.native
  
  var extensions: Boolean | js.Array[String] = js.native
  
  var gzip: Boolean = js.native
  
  var index: String = js.native
  
  var maxAge: Double = js.native
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
  
  @scala.inline
  implicit class cacheConfOps[Self <: cacheConf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefer(value: Boolean): Self = this.set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsVarargs(value: String*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: Boolean | js.Array[String]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGzip(value: Boolean): Self = this.set("gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
  }
}
