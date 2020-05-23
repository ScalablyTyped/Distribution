package typings.shrinkRay.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.shrinkRay.anon.Lgblock
import typings.shrinkRay.anon.PartialflushnumberfinishF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  cacheSize  :number,   threshold  :number,   zlib  :std.Partial<{  flush ? :number,   finishFlush ? :number,   chunkSize ? :number,   windowBits ? :number,   strategy ? :number,   dictionary ? :any,   level  :-1 | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9,   memLevel  :1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9}>,   brotli  :{  lgblock  :number,   lgwin  :number,   mode  :0 | 1 | 2,   quality  :0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11},   filter  :shrink-ray.shrink-ray.FilterFunction, cache (req : express.express.Request<express-serve-static-core.express-serve-static-core.ParamsDictionary, any, any, express-serve-static-core.express-serve-static-core.Query>, res : express.express.Response<any>): boolean}> */
trait Options extends js.Object {
  var brotli: js.UndefOr[Lgblock] = js.undefined
  var cache: js.UndefOr[
    js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean]
  ] = js.undefined
  var cacheSize: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[FilterFunction] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var zlib: js.UndefOr[PartialflushnumberfinishF] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    brotli: Lgblock = null,
    cache: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean = null,
    cacheSize: js.UndefOr[Double] = js.undefined,
    filter: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => Boolean = null,
    threshold: js.UndefOr[Double] = js.undefined,
    zlib: PartialflushnumberfinishF = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (brotli != null) __obj.updateDynamic("brotli")(brotli.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(js.Any.fromFunction2(cache))
    if (!js.isUndefined(cacheSize)) __obj.updateDynamic("cacheSize")(cacheSize.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    if (zlib != null) __obj.updateDynamic("zlib")(zlib.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

