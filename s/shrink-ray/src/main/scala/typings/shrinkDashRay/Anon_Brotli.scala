package typings.shrinkDashRay

import typings.std.Partial
import typings.std.Request
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Brotli extends js.Object {
  var brotli: Anon_01
  var cacheSize: Double
  var filter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FilterFunction */ js.Any
  var threshold: Double
  var zlib: Partial[Anon_0]
  def cache(req: Request, res: Response): Boolean
}

object Anon_Brotli {
  @scala.inline
  def apply(
    brotli: Anon_01,
    cache: (Request, Response) => Boolean,
    cacheSize: Double,
    filter: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify FilterFunction */ js.Any,
    threshold: Double,
    zlib: Partial[Anon_0]
  ): Anon_Brotli = {
    val __obj = js.Dynamic.literal(brotli = brotli, cache = js.Any.fromFunction2(cache), cacheSize = cacheSize, filter = filter, threshold = threshold, zlib = zlib)
  
    __obj.asInstanceOf[Anon_Brotli]
  }
}

