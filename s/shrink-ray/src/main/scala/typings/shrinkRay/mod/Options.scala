package typings.shrinkRay.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.shrinkRay.anon.Lgblock
import typings.shrinkRay.anon.Partialflushnumberundefin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  cacheSize :number,   threshold :number,   zlib :std.Partial<{  flush :number | undefined,   finishFlush :number | undefined,   chunkSize :number | undefined,   windowBits :number | undefined,   strategy :number | undefined,   dictionary :any | undefined,   level :-1 | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9,   memLevel :1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9}>,   brotli :{  lgblock :number,   lgwin :number,   mode :0 | 1 | 2,   quality :0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11},   filter :shrink-ray.shrink-ray.FilterFunction, cache (req : express.express.Request<express-serve-static-core.express-serve-static-core.ParamsDictionary, any, any, express-serve-static-core.express-serve-static-core.Query>, res : express.express.Response<any>): boolean}> */
@js.native
trait Options extends js.Object {
  
  var brotli: js.UndefOr[Lgblock] = js.native
  
  var cache: js.UndefOr[
    js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean]
  ] = js.native
  
  var cacheSize: js.UndefOr[Double] = js.native
  
  var filter: js.UndefOr[FilterFunction] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
  
  var zlib: js.UndefOr[Partialflushnumberundefin] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBrotli(value: Lgblock): Self = this.set("brotli", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrotli: Self = this.set("brotli", js.undefined)
    
    @scala.inline
    def setCache(value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean): Self = this.set("cache", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCacheSize(value: Double): Self = this.set("cacheSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheSize: Self = this.set("cacheSize", js.undefined)
    
    @scala.inline
    def setFilter(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean
    ): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    
    @scala.inline
    def setZlib(value: Partialflushnumberundefin): Self = this.set("zlib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZlib: Self = this.set("zlib", js.undefined)
  }
}
